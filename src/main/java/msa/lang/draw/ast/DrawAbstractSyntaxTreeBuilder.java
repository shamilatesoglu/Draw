package msa.lang.draw.ast;

import msa.lang.draw.ast.node.*;
import msa.lang.draw.cst.DrawBaseVisitor;
import msa.lang.draw.cst.DrawLexer;
import msa.lang.draw.cst.DrawParser;

import java.util.stream.Collectors;

public class DrawAbstractSyntaxTreeBuilder extends DrawBaseVisitor<DrawAbstractSyntaxTreeNode> {
    @Override
    public DrawAbstractSyntaxTreeNode visitCompilationUnit(DrawParser.CompilationUnitContext ctx) {
        CompilationUnitASTNode node = new CompilationUnitASTNode();

        node.getStatements().addAll(ctx.statement().stream()
                .map(statementContext -> (StatementASTNode) visitStatement(statementContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitPaperDeclaration(DrawParser.PaperDeclarationContext ctx) {
        return new PaperDeclarationASTNode((ExpressionASTNode) visit(ctx.width), (ExpressionASTNode) visit(ctx.height));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitVariableDefinition(DrawParser.VariableDefinitionContext ctx) {
        return new VariableDefinitionASTNode(ctx.identifier.getText(), (ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitAssignment(DrawParser.AssignmentContext ctx) {
        return new AssignmentASTNode((ReferenceASTNode) visit(ctx.reference()), (ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitGoToStatement(DrawParser.GoToStatementContext ctx) {
        return new GoToASTNode((ExpressionASTNode) visit(ctx.x), (ExpressionASTNode) visit(ctx.y));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitMoveStatement(DrawParser.MoveStatementContext ctx) {
        return new MoveASTNode((ExpressionASTNode) visit(ctx.dx), (ExpressionASTNode) visit(ctx.dy));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitPenStateStatement(DrawParser.PenStateStatementContext ctx) {
        return new SetPenStateASTNode(ctx.state.getType() == DrawLexer.UP
                ? SetPenStateASTNode.PenState.UP : SetPenStateASTNode.PenState.DOWN);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitPenColorStatement(DrawParser.PenColorStatementContext ctx) {
        return new SetPenColorASTNode((ExpressionASTNode) visit(ctx.color));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitRepeatStatement(DrawParser.RepeatStatementContext ctx) {
        RepeatASTNode node = new RepeatASTNode((ExpressionASTNode) visit(ctx.times));

        node.getStatements().addAll(ctx.statement().stream()
                .map(statementContext -> (StatementASTNode) visitStatement(statementContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitTurnStatement(DrawParser.TurnStatementContext ctx) {
        return new TurnASTNode(ctx.direction.getType() == DrawLexer.RIGHT
                ? TurnASTNode.Direction.RIGHT : TurnASTNode.Direction.LEFT, (ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitForwardStatement(DrawParser.ForwardStatementContext ctx) {
        return new ForwardASTNode((ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitReference(DrawParser.ReferenceContext ctx) {
        return new ReferenceASTNode(ctx.getText());
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitReferenceExpression(DrawParser.ReferenceExpressionContext ctx) {
        return visitReference(ctx.reference());
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitInfixExpression(DrawParser.InfixExpressionContext ctx) {
        return new InfixExpressionASTNode((ExpressionASTNode) visit(ctx.left), ctx.operation.getType(), (ExpressionASTNode) visit(ctx.right));
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitNumberExpression(DrawParser.NumberExpressionContext ctx) {
        String text = ctx.value.getText().toLowerCase();
        if (text.equals("true") || text.equals("false")) {
            boolean val = Boolean.parseBoolean(text);
            return new NumberASTNode(val ? 1.0 : 0.0);
        } else {
            return new NumberASTNode(Double.valueOf(text));
        }
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitParenthesisExpression(DrawParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitUnaryExpression(DrawParser.UnaryExpressionContext ctx) {
        switch (ctx.operation.getType()) {
            case DrawLexer.OPERATOR_ADD:
                return visit(ctx.expression());

            case DrawLexer.OPERATOR_SUB:
                return new NegationASTNode((ExpressionASTNode) visit(ctx.expression()));

            default:
                throw new IllegalArgumentException("Unary operator not supported: " + ctx.operation.getText());
        }
    }
}
