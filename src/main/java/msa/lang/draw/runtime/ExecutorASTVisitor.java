package msa.lang.draw.runtime;

import msa.lang.draw.ast.node.*;
import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;
import msa.lang.draw.domain.command.*;
import msa.lang.draw.semantics.Symbol;
import msa.lang.draw.semantics.SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExecutorASTVisitor extends DrawBaseASTVisitor<Void> {

    private final SymbolTable symbolTable;

    private final Map<String, Double> evaluated;
    
    private final Map<String, DepictDeclarationASTNode> depictDeclarations;

    private Pen pen;
    private Paper paper;

    public ExecutorASTVisitor() {
        this.symbolTable = new SymbolTable();
        this.evaluated = new LinkedHashMap<>();
        this.depictDeclarations = new LinkedHashMap<>();

        this.pen = new Pen();
        this.paper = null;
    }

    public Paper getPaper() {
        return paper;
    }

    private Double evaluateExpression(ExpressionASTNode expression) {
        ExpressionEvaluatingASTVisitor evaluator = new ExpressionEvaluatingASTVisitor(evaluated);
        Double result = evaluator.visit(expression);
        return result;
    }

    @Override
    public Void visit(AssignmentASTNode node) {
        String name = node.getIdentifier();

        if (!symbolTable.contains(name))
            symbolTable.insert(new Symbol(name));


        evaluated.put(name, evaluateExpression(node.getExpression()));

        return null;
    }

    @Override
    public Void visit(ForwardASTNode node) {
        DrawCommand command = new ForwardCommand(evaluateExpression(node.getExpression()));
        command.execute(pen, paper);
        return null;
    }

    @Override
    public Void visit(GoToASTNode node) {
        DrawCommand command = new SetPenPositionCommand(evaluateExpression(node.getXExpression()),
                evaluateExpression(node.getYExpression()));
        command.execute(pen, paper);
        return null;
    }

    @Override
    public Void visit(PaperDeclarationASTNode node) {
        Paper paper = new Paper(evaluateExpression(node.getWidthExpression()).intValue(),
                evaluateExpression(node.getHeightExpression()).intValue());

        if (this.paper == null) {
            this.paper = paper;
        } else {
            throw new IllegalArgumentException("We already have a paper.");
        }

        return null;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        String name = node.getName();

        symbolTable.insert(new Symbol(name));

        evaluated.put(name, evaluateExpression(node.getExpression()));

        return null;
    }

    @Override
    public Void visit(SetPenStateASTNode node) {
        Pen.State state = node.getState() == SetPenStateASTNode.PenState.UP ? Pen.State.UP : Pen.State.DOWN;

        DrawCommand command = new SetPenStateCommand(state);
        command.execute(pen, paper);

        return null;
    }

    @Override
    public Void visit(SetPenColorASTNode node) {
        DrawCommand command = new SetPenColorCommand(evaluateExpression(node.getColorExpression()).intValue());
        command.execute(pen, paper);

        return null;
    }

    @Override
    public Void visit(TurnASTNode node) {
        DrawCommand command = new TurnDirectionCommand(evaluateExpression(node.getDegreesExpression()));
        command.execute(pen, paper);
        return null;
    }

    @Override
    public Void visit(MoveASTNode node) {
        DrawCommand command = new MovePenCommand(
                evaluateExpression(node.getDxExpression()),
                evaluateExpression(node.getDyExpression()));
        command.execute(pen, paper);
        return null;
    }

    @Override
    public Void visit(RepeatASTNode node) {

        int N = evaluateExpression(node.getNExpression()).intValue();

        for (int i = 0; i < N; i++) {
            for (StatementASTNode statement : node.getStatements()) {
                visit(statement);
            }
        }

        return null;
    }

    @Override
    public Void visit(WhileASTNode node) {

        while (evaluateExpression(node.getCheck()).intValue() != 0) {
            for (StatementASTNode statement : node.getStatements()) {
                visit(statement);
            }
        }

        return null;
    }

    @Override
    public Void visit(IfASTNode node) {

        if (evaluateExpression(node.getCheck()).intValue() != 0) {
            visit(node.getPrimary());
        } else {
            visit(node.getSecondary());
        }

        return null;
    }

    @Override
    public Void visit(DepictDeclarationASTNode node) {
        // Store the depict declaration for later use
        depictDeclarations.put(node.getIdentifier(), node);
        return null;
    }

    @Override
    public Void visit(DepictCallASTNode node) {
        String depictName = node.getReference().getId();
        
        // Look up the depict declaration
        if (!depictDeclarations.containsKey(depictName)) {
            throw new IllegalArgumentException("Depict function not found: " + depictName);
        }
        
        DepictDeclarationASTNode declaration = depictDeclarations.get(depictName);
        
        // Check parameter count
        if (declaration.getParameterList().size() != node.getActualParameterList().size()) {
            throw new IllegalArgumentException("Wrong number of arguments for depict " + depictName + 
                ": expected " + declaration.getParameterList().size() + 
                ", got " + node.getActualParameterList().size());
        }
        
        // Save current variable values (for scope management)
        Map<String, Double> savedValues = new LinkedHashMap<>();
        for (String param : declaration.getParameterList()) {
            if (evaluated.containsKey(param)) {
                savedValues.put(param, evaluated.get(param));
            }
        }
        
        // Bind parameters to arguments
        for (int i = 0; i < declaration.getParameterList().size(); i++) {
            String paramName = declaration.getParameterList().get(i);
            Double argValue = evaluateExpression(node.getActualParameterList().get(i));
            
            if (!symbolTable.contains(paramName)) {
                symbolTable.insert(new Symbol(paramName));
            }
            
            evaluated.put(paramName, argValue);
        }
        
        // Execute the depict body
        for (StatementASTNode statement : declaration.getStatements()) {
            visit(statement);
        }
        
        // Restore previous variable values
        for (String param : declaration.getParameterList()) {
            if (savedValues.containsKey(param)) {
                evaluated.put(param, savedValues.get(param));
            } else {
                evaluated.remove(param);
            }
        }
        
        return null;
    }
}
