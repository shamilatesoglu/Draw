package msa.lang.draw.ast;

import msa.lang.draw.ast.node.*;
import msa.lang.draw.cst.DrawBaseVisitor;
import msa.lang.draw.cst.DrawLexer;
import msa.lang.draw.cst.DrawParser;
import org.antlr.v4.runtime.RuleContext;

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
    public DrawAbstractSyntaxTreeNode visitAssignment(DrawParser.AssignmentContext ctx) {
        return new AssignmentASTNode(ctx.identifier().getText(), (ExpressionASTNode) visit(ctx.expression()));
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

        node.getStatements().addAll(ctx.statementBlock().statement().stream()
                .map(statementContext -> (StatementASTNode) visitStatement(statementContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitTurnStatement(DrawParser.TurnStatementContext ctx) {
        return new TurnASTNode((ExpressionASTNode) visit(ctx.expression()));
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
        String text = ctx.value.getText();
        switch (ctx.value.getType()) {
            case DrawLexer.INTEGER:
                return new IntegerASTNode(Integer.parseInt(text));
            case DrawLexer.REAL:
                return new RealNumberASTNode(Double.parseDouble(text));
            case DrawLexer.HEX:
                return new IntegerASTNode(Integer.decode(text));
            case DrawLexer.COLOR_LITERAL:
                return new IntegerASTNode(Integer.decode(text.replace("c", "0x")));
            case DrawLexer.BOOLEAN_LITERAL:
                if (text.equalsIgnoreCase("true") || text.equalsIgnoreCase("false")) {
                    boolean val = Boolean.parseBoolean(text);
                    return new IntegerASTNode(val ? 1 : 0);
                }
                break;
        }
        return null;
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

    @Override
    public DrawAbstractSyntaxTreeNode visitDepictDeclaration(DrawParser.DepictDeclarationContext ctx) {
        DepictDeclarationASTNode node = new DepictDeclarationASTNode(ctx.identifier().getText());

        node.getParameterList().addAll(ctx.parameterList().identifier().stream()
                .map(RuleContext::getText).collect(Collectors.toList()));

        node.getStatements().addAll(ctx.statementBlock().statement().stream()
                .map(statementContext -> (StatementASTNode) visitStatement(statementContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitDepictCall(DrawParser.DepictCallContext ctx) {
        DepictCallASTNode node = new DepictCallASTNode((ReferenceASTNode) visit(ctx.reference()));

        node.getActualParameterList().addAll(ctx.actualParameterList().expression().stream()
                .map(expressionContext -> (ExpressionASTNode) visit(expressionContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitIfStatement(DrawParser.IfStatementContext ctx) {
        IfASTNode node = new IfASTNode(
                (ExpressionASTNode) visit(ctx.expression()),
                (StatementASTNode) visit(ctx.primary),
                (StatementASTNode) visit(ctx.secondary));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitStatementBlock(DrawParser.StatementBlockContext ctx) {
        StatementBlockASTNode node = new StatementBlockASTNode();

        node.getStatements().addAll(ctx.statement().stream()
                .map(statementContext -> (StatementASTNode) visitStatement(statementContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitWhileStatement(DrawParser.WhileStatementContext ctx) {
        WhileASTNode node = new WhileASTNode((ExpressionASTNode) visit(ctx.expression()));

        node.getStatements().addAll(ctx.statementBlock().statement().stream()
                .map(statementContext -> (StatementASTNode) visitStatement(statementContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public DrawAbstractSyntaxTreeNode visitConditionalExpression(DrawParser.ConditionalExpressionContext ctx) {
        return new ConditionalExpressionASTNode(
                (ExpressionASTNode) visit(ctx.check),
                (ExpressionASTNode) visit(ctx.first),
                (ExpressionASTNode) visit(ctx.second)
        );
    }
}
