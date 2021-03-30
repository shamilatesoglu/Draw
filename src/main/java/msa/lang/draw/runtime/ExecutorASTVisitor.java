package msa.lang.draw.runtime;

import msa.lang.draw.ast.node.*;
import msa.lang.draw.domain.DrawCommandQueue;
import msa.lang.draw.domain.Paper;
import msa.lang.draw.domain.Pen;
import msa.lang.draw.domain.command.*;
import msa.lang.draw.runtime.exception.UndefinedSymbolException;
import msa.lang.draw.semantics.Symbol;
import msa.lang.draw.semantics.SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExecutorASTVisitor extends DrawBaseASTVisitor<Void> {

    private final SymbolTable symbolTable;

    private final Map<String, Double> evaluated;

    private DrawCommandQueue commandQueue;

    public ExecutorASTVisitor() {
        this.symbolTable = new SymbolTable();
        this.evaluated = new LinkedHashMap<>();

        this.commandQueue = null;
    }

    public DrawCommandQueue getCommandQueue() {
        return commandQueue;
    }

    private Double evaluateExpression(ExpressionASTNode expression) {
        ExpressionEvaluatingASTVisitor evaluator = new ExpressionEvaluatingASTVisitor(evaluated);
        Double result = evaluator.visit(expression);
        return result;
    }

    @Override
    public Void visit(AssignmentASTNode node) {
        String name = node.getReference().getId();

        if (!symbolTable.contains(name))
            throw new UndefinedSymbolException(name);

        evaluated.put(name, evaluateExpression(node.getExpression()));

        return null;
    }

    @Override
    public Void visit(ForwardASTNode node) {
        DrawCommand command = new ForwardCommand(evaluateExpression(node.getExpression()));
        commandQueue.enqueue(command);
        return null;
    }

    @Override
    public Void visit(GoToASTNode node) {
        DrawCommand command = new SetPenPositionCommand(evaluateExpression(node.getXExpression()),
                evaluateExpression(node.getYExpression()));
        commandQueue.enqueue(command);
        return null;
    }

    @Override
    public Void visit(PaperDeclarationASTNode node) {
        Paper paper = new Paper(evaluateExpression(node.getWidthExpression()).intValue(),
                evaluateExpression(node.getHeightExpression()).intValue());

        if (commandQueue == null) {
            Pen pen = new Pen();
            commandQueue = new DrawCommandQueue(pen, paper);
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

        commandQueue.enqueue(command);

        return null;
    }

    @Override
    public Void visit(SetPenColorASTNode node) {
        DrawCommand command = new SetPenColorCommand(evaluateExpression(node.getColorExpression()).intValue());

        commandQueue.enqueue(command);

        return null;
    }

    @Override
    public Void visit(TurnASTNode node) {
        DrawCommand command = new TurnDirectionCommand(evaluateExpression(node.getDegreesExpression()));
        commandQueue.enqueue(command);
        return null;
    }

    @Override
    public Void visit(MoveASTNode node) {
        DrawCommand command = new MovePenCommand(evaluateExpression(node.getDxExpression()),
                evaluateExpression(node.getDyExpression()));
        commandQueue.enqueue(command);
        return null;
    }

    @Override
    public Void visit(RepeatASTNode node) {

        int  N = evaluateExpression(node.getNExpression()).intValue();

        for (int i = 0; i < N; i++) {
            for (StatementASTNode statement : node.getStatements()) {
                visit(statement);
            }
        }

        return null;
    }
}
