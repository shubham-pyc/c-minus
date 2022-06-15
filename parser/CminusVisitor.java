// Generated from Cminus.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CminusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CminusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CminusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CminusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CminusParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#varDeclId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclId(CminusParser.VarDeclIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#funDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(CminusParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CminusParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CminusParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#paramId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamId(CminusParser.ParamIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CminusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(CminusParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(CminusParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CminusParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CminusParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CminusParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(CminusParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(CminusParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CminusParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CminusParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRelExpression(CminusParser.UnaryRelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#relExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpression(CminusParser.RelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(CminusParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#sumExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(CminusParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#sumop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumop(CminusParser.SumopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#termExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpression(CminusParser.TermExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(CminusParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CminusParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#unaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryop(CminusParser.UnaryopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CminusParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#mutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutable(CminusParser.MutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#immutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmutable(CminusParser.ImmutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CminusParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CminusParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CminusParser.ConstantContext ctx);
}