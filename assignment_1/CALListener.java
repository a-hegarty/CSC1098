// Generated from ./CAL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CALParser}.
 */
public interface CALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CALParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CALParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CALParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#dec_list}.
	 * @param ctx the parse tree
	 */
	void enterDec_list(CALParser.Dec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#dec_list}.
	 * @param ctx the parse tree
	 */
	void exitDec_list(CALParser.Dec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CALParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CALParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(CALParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(CALParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#const_dec}.
	 * @param ctx the parse tree
	 */
	void enterConst_dec(CALParser.Const_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#const_dec}.
	 * @param ctx the parse tree
	 */
	void exitConst_dec(CALParser.Const_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#func_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_list(CALParser.Func_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#func_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_list(CALParser.Func_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CALParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CALParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CALParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CALParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CALParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CALParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#nemp_param_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_param_list(CALParser.Nemp_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#nemp_param_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_param_list(CALParser.Nemp_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CALParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CALParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(CALParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(CALParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CALParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CALParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CALParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CALParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_arith_op(CALParser.Bin_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_arith_op(CALParser.Bin_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(CALParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(CALParser.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CALParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CALParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(CALParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(CALParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CALParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CALParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(CALParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(CALParser.Nemp_arg_listContext ctx);
}