// Generated from C:/Repos/Draw/grammar\Draw.g4 by ANTLR 4.9.1
package msa.lang.draw.cst;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(DrawParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DrawParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#paperDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaperDeclaration(DrawParser.PaperDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DrawParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#goToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatement(DrawParser.GoToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#moveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStatement(DrawParser.MoveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#depictDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepictDeclaration(DrawParser.DepictDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#depictCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepictCall(DrawParser.DepictCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(DrawParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(DrawParser.ActualParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DrawParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(DrawParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#penStateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenStateStatement(DrawParser.PenStateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#penColorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenColorStatement(DrawParser.PenColorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(DrawParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DrawParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#turnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnStatement(DrawParser.TurnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#forwardStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardStatement(DrawParser.ForwardStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(DrawParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DrawParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceExpression(DrawParser.ReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpression(DrawParser.InfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(DrawParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DrawParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(DrawParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DrawParser.UnaryExpressionContext ctx);
}