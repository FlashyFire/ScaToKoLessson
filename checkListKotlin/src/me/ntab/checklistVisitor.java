// Generated from F:/Git/Sandbox/checkListKotlin/src\checklist.g4 by ANTLR 4.7
package me.ntab;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link checklistParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface checklistVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link checklistParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(checklistParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(checklistParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(checklistParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(checklistParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#subtitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtitle(checklistParser.SubtitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(checklistParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(checklistParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(checklistParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(checklistParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#subst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubst(checklistParser.SubstContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(checklistParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expr(checklistParser.Logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op(checklistParser.Binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(checklistParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(checklistParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(checklistParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(checklistParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link checklistParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(checklistParser.NumberContext ctx);
}