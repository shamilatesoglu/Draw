package msa.lang.draw.ast;

import msa.lang.draw.cst.DrawBaseVisitor;
import msa.lang.draw.cst.DrawParser;

public class DrawAbstractSyntaxTreeBuilder extends DrawBaseVisitor<DrawAbstractSyntaxTreeNode> {

    @Override
    public DrawAbstractSyntaxTreeNode visitCompilationUnit(DrawParser.CompilationUnitContext ctx) {
        return super.visitCompilationUnit(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitStatementList(DrawParser.StatementListContext ctx) {
        return super.visitStatementList(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitStatement(DrawParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitPaperDeclaration(DrawParser.PaperDeclarationContext ctx) {
        return super.visitPaperDeclaration(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitVariableDeclaration(DrawParser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitGoToStatement(DrawParser.GoToStatementContext ctx) {
        return super.visitGoToStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitMoveStatement(DrawParser.MoveStatementContext ctx) {
        return super.visitMoveStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitPenStateStatement(DrawParser.PenStateStatementContext ctx) {
        return super.visitPenStateStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitPenColorStatement(DrawParser.PenColorStatementContext ctx) {
        return super.visitPenColorStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitRepeatStatement(DrawParser.RepeatStatementContext ctx) {
        return super.visitRepeatStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitTurnStatement(DrawParser.TurnStatementContext ctx) {
        return super.visitTurnStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitForwardStatement(DrawParser.ForwardStatementContext ctx) {
        return super.visitForwardStatement(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitReference(DrawParser.ReferenceContext ctx) {
        return super.visitReference(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitReferenceExpression(DrawParser.ReferenceExpressionContext ctx) {
        return super.visitReferenceExpression(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitInfixExpression(DrawParser.InfixExpressionContext ctx) {
        return super.visitInfixExpression(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitNumberExpression(DrawParser.NumberExpressionContext ctx) {
        return super.visitNumberExpression(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitParenthesisExpression(DrawParser.ParenthesisExpressionContext ctx) {
        return super.visitParenthesisExpression(ctx);
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitUnaryExpression(DrawParser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx);
    }
}
