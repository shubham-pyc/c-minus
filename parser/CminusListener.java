// Generated from Cminus.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CminusParser}.
 */
public interface CminusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CminusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CminusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CminusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CminusParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CminusParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#varDeclId}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclId(CminusParser.VarDeclIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#varDeclId}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclId(CminusParser.VarDeclIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(CminusParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(CminusParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CminusParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CminusParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CminusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CminusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#paramId}.
	 * @param ctx the parse tree
	 */
	void enterParamId(CminusParser.ParamIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#paramId}.
	 * @param ctx the parse tree
	 */
	void exitParamId(CminusParser.ParamIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CminusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CminusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(CminusParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(CminusParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(CminusParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(CminusParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CminusParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CminusParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CminusParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CminusParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CminusParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CminusParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(CminusParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(CminusParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(CminusParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(CminusParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CminusParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CminusParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CminusParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CminusParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRelExpression(CminusParser.UnaryRelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRelExpression(CminusParser.UnaryRelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpression(CminusParser.RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpression(CminusParser.RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(CminusParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(CminusParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(CminusParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(CminusParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#sumop}.
	 * @param ctx the parse tree
	 */
	void enterSumop(CminusParser.SumopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#sumop}.
	 * @param ctx the parse tree
	 */
	void exitSumop(CminusParser.SumopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#termExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(CminusParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#termExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(CminusParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(CminusParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(CminusParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CminusParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CminusParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#unaryop}.
	 * @param ctx the parse tree
	 */
	void enterUnaryop(CminusParser.UnaryopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#unaryop}.
	 * @param ctx the parse tree
	 */
	void exitUnaryop(CminusParser.UnaryopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CminusParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CminusParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterMutable(CminusParser.MutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitMutable(CminusParser.MutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#immutable}.
	 * @param ctx the parse tree
	 */
	void enterImmutable(CminusParser.ImmutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#immutable}.
	 * @param ctx the parse tree
	 */
	void exitImmutable(CminusParser.ImmutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CminusParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CminusParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CminusParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CminusParser.ConstantContext ctx);
}