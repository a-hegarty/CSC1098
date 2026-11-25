// Generated from ./cal.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calParser}.
 */
public interface calListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#dec_list}.
	 * @param ctx the parse tree
	 */
	void enterDec_list(calParser.Dec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#dec_list}.
	 * @param ctx the parse tree
	 */
	void exitDec_list(calParser.Dec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(calParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(calParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(calParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(calParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#const_dec}.
	 * @param ctx the parse tree
	 */
	void enterConst_dec(calParser.Const_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#const_dec}.
	 * @param ctx the parse tree
	 */
	void exitConst_dec(calParser.Const_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#func_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_list(calParser.Func_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#func_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_list(calParser.Func_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(calParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(calParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(calParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(calParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(calParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(calParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#nemp_param_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_param_list(calParser.Nemp_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#nemp_param_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_param_list(calParser.Nemp_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(calParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(calParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(calParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(calParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(calParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(calParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_arith_op(calParser.Bin_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_arith_op(calParser.Bin_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(calParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(calParser.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(calParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(calParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(calParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(calParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(calParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(calParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(calParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(calParser.Nemp_arg_listContext ctx);
}