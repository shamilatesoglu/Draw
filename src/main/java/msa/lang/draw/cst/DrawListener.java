// Generated from D:/Library/Repos/DrawDSL/grammar\Draw.g4 by ANTLR 4.9.1
package msa.lang.draw.cst;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawParser}.
 */
public interface DrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(DrawParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(DrawParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(DrawParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(DrawParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DrawParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DrawParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#paperDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPaperDeclaration(DrawParser.PaperDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#paperDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPaperDeclaration(DrawParser.PaperDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(DrawParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(DrawParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#goToStatement}.
	 * @param ctx the parse tree
	 */
	void enterGoToStatement(DrawParser.GoToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#goToStatement}.
	 * @param ctx the parse tree
	 */
	void exitGoToStatement(DrawParser.GoToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveStatement(DrawParser.MoveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveStatement(DrawParser.MoveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#penStateStatement}.
	 * @param ctx the parse tree
	 */
	void enterPenStateStatement(DrawParser.PenStateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#penStateStatement}.
	 * @param ctx the parse tree
	 */
	void exitPenStateStatement(DrawParser.PenStateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#penColorStatement}.
	 * @param ctx the parse tree
	 */
	void enterPenColorStatement(DrawParser.PenColorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#penColorStatement}.
	 * @param ctx the parse tree
	 */
	void exitPenColorStatement(DrawParser.PenColorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(DrawParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(DrawParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#turnStatement}.
	 * @param ctx the parse tree
	 */
	void enterTurnStatement(DrawParser.TurnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#turnStatement}.
	 * @param ctx the parse tree
	 */
	void exitTurnStatement(DrawParser.TurnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#forwardStatement}.
	 * @param ctx the parse tree
	 */
	void enterForwardStatement(DrawParser.ForwardStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#forwardStatement}.
	 * @param ctx the parse tree
	 */
	void exitForwardStatement(DrawParser.ForwardStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(DrawParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(DrawParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(DrawParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(DrawParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(DrawParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(DrawParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(DrawParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(DrawParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(DrawParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(DrawParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(DrawParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link DrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(DrawParser.UnaryExpressionContext ctx);
}