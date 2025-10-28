package msa.lang.draw.runtime;

import msa.lang.draw.ast.DrawAbstractSyntaxTreeVisitor;
import msa.lang.draw.ast.node.*;

public class DrawBaseASTVisitor<T> extends DrawAbstractSyntaxTreeVisitor<T> {
    @Override
    public T visit(CompilationUnitASTNode node) {
        for (StatementASTNode statement : node.getStatements()) {
            visit(statement);
        }

        return null;
    }

    @Override
    public T visit(AssignmentASTNode node) {
        
        visit(node.getExpression());

        return null;
    }

    @Override
    public T visit(ForwardASTNode node) {
        visit(node.getExpression());
        return null;
    }

    @Override
    public T visit(GoToASTNode node) {
        visit(node.getXExpression());
        visit(node.getYExpression());

        return null;
    }

    @Override
    public T visit(IntegerASTNode node) {
        return null;
    }

    @Override
    public T visit(RealNumberASTNode node) {
        return null;
    }

    @Override
    public T visit(InfixExpressionASTNode node) {
        visit(node.getLeft());
        visit(node.getRight());

        return null;
    }

    @Override
    public T visit(PaperDeclarationASTNode node) {
        visit(node.getWidthExpression());
        visit(node.getHeightExpression());

        return null;
    }

    @Override
    public T visit(VariableDefinitionASTNode node) {

        visit(node.getExpression());

        return null;
    }

    @Override
    public T visit(SetPenStateASTNode node) {

        return null;
    }

    @Override
    public T visit(SetPenColorASTNode node) {
        visit(node.getColorExpression());

        return null;
    }

    @Override
    public T visit(TurnASTNode node) {
        visit(node.getDegreesExpression());

        return null;
    }

    @Override
    public T visit(MoveASTNode node) {
        visit(node.getDxExpression());
        visit(node.getDyExpression());

        return null;
    }

    @Override
    public T visit(ReferenceASTNode node) {
        return null;
    }

    @Override
    public T visit(NegationASTNode node) {
        visit(node.getInnerNode());

        return null;
    }

    @Override
    public T visit(MathFunctionCallASTNode node) {
        visit(node.getArgument());

        return null;
    }

    @Override
    public T visit(RepeatASTNode node) {
        visit(node.getNExpression());

        for (StatementASTNode statement : node.getStatements()) {
            visit(statement);
        }

        return null;
    }

    @Override
    public T visit(WhileASTNode node) {
        visit(node.getCheck());

        for (StatementASTNode statement : node.getStatements()) {
            visit(statement);
        }

        return null;
    }

    @Override
    public T visit(IfASTNode node) {
        visit(node.getCheck());

        visit(node.getPrimary());

        visit(node.getSecondary());

        return null;
    }

    @Override
    public T visit(StatementBlockASTNode node) {

        for (StatementASTNode statement : node.getStatements()) {
            visit(statement);
        }

        return null;
    }

    @Override
    public T visit(DepictDeclarationASTNode node) {
        for (StatementASTNode statement : node.getStatements()) {
            visit(statement);
        }

        return null;
    }

    @Override
    public T visit(DepictCallASTNode node) {
        visit(node.getReference());
        
        for (ExpressionASTNode expression : node.getActualParameterList()) {
            visit(expression);
        }

        return null;
    }
}
