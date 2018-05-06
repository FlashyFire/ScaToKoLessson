// Generated from F:/Git/Sandbox/checkListKotlin/src\checklist.g4 by ANTLR 4.7
package me.ntab;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link checklistParser}.
 */
public interface checklistListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link checklistParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(checklistParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(checklistParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(checklistParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(checklistParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(checklistParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(checklistParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(checklistParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(checklistParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#subtitle}.
	 * @param ctx the parse tree
	 */
	void enterSubtitle(checklistParser.SubtitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#subtitle}.
	 * @param ctx the parse tree
	 */
	void exitSubtitle(checklistParser.SubtitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(checklistParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(checklistParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(checklistParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(checklistParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(checklistParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(checklistParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(checklistParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(checklistParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#subst}.
	 * @param ctx the parse tree
	 */
	void enterSubst(checklistParser.SubstContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#subst}.
	 * @param ctx the parse tree
	 */
	void exitSubst(checklistParser.SubstContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(checklistParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(checklistParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(checklistParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(checklistParser.Logical_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(checklistParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(checklistParser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(checklistParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(checklistParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(checklistParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(checklistParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(checklistParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(checklistParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(checklistParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(checklistParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link checklistParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(checklistParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link checklistParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(checklistParser.NumberContext ctx);
}