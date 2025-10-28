package msa.lang.draw.ast;

import msa.lang.draw.ast.node.*;

public abstract class DrawAbstractSyntaxTreeVisitor<T> {
    public abstract T visit(CompilationUnitASTNode node);

    public abstract T visit(AssignmentASTNode node);

    public abstract T visit(ForwardASTNode node);

    public abstract T visit(GoToASTNode node);

    public abstract T visit(IntegerASTNode node);

    public abstract T visit(RealNumberASTNode node);

    public abstract T visit(InfixExpressionASTNode node);

    public abstract T visit(PaperDeclarationASTNode node);

    public abstract T visit(VariableDefinitionASTNode node);

    public abstract T visit(SetPenStateASTNode node);

    public abstract T visit(SetPenColorASTNode node);

    public abstract T visit(TurnASTNode node);

    public abstract T visit(MoveASTNode node);

    public abstract T visit(ReferenceASTNode node);

    public abstract T visit(NegationASTNode node);

    public abstract T visit(MathFunctionCallASTNode node);

    public abstract T visit(RepeatASTNode node);

    public abstract T visit(WhileASTNode node);

    public abstract T visit(IfASTNode node);

    public abstract T visit(StatementBlockASTNode node);

    public abstract T visit(DepictDeclarationASTNode node);

    public abstract T visit(DepictCallASTNode node);

    public T visit(DrawAbstractSyntaxTreeNode node) {
        if (node instanceof CompilationUnitASTNode) {
            return visit((CompilationUnitASTNode) node);
        }
        if (node instanceof AssignmentASTNode) {
            return visit((AssignmentASTNode) node);
        }
        if (node instanceof ForwardASTNode) {
            return visit((ForwardASTNode) node);
        }
        if (node instanceof IfASTNode) {
            return visit((IfASTNode) node);
        }
        if (node instanceof RepeatASTNode) {
            return visit((RepeatASTNode) node);
        }
        if (node instanceof WhileASTNode) {
            return visit((WhileASTNode) node);
        }
        if (node instanceof GoToASTNode) {
            return visit((GoToASTNode) node);
        }
        if (node instanceof IntegerASTNode) {
            return visit((IntegerASTNode) node);
        }
        if (node instanceof RealNumberASTNode) {
            return visit((RealNumberASTNode) node);
        }
        if (node instanceof PaperDeclarationASTNode) {
            return visit((PaperDeclarationASTNode) node);
        }
        if (node instanceof SetPenStateASTNode) {
            return visit((SetPenStateASTNode) node);
        }
        if (node instanceof InfixExpressionASTNode) {
            return visit((InfixExpressionASTNode) node);
        }
        if (node instanceof SetPenColorASTNode) {
            return visit((SetPenColorASTNode) node);
        }
        if (node instanceof NegationASTNode) {
            return visit((NegationASTNode) node);
        }
        if (node instanceof MathFunctionCallASTNode) {
            return visit((MathFunctionCallASTNode) node);
        }
        if (node instanceof TurnASTNode) {
            return visit((TurnASTNode) node);
        }
        if (node instanceof MoveASTNode) {
            return visit((MoveASTNode) node);
        }
        if (node instanceof ReferenceASTNode) {
            return visit((ReferenceASTNode) node);
        }
        if (node instanceof VariableDefinitionASTNode) {
            return visit((VariableDefinitionASTNode) node);
        }
        if (node instanceof StatementBlockASTNode) {
            return visit((StatementBlockASTNode) node);
        }
        if (node instanceof DepictDeclarationASTNode) {
            return visit((DepictDeclarationASTNode) node);
        }
        if (node instanceof DepictCallASTNode) {
            return visit((DepictCallASTNode) node);
        }

        return null;
    }


}
