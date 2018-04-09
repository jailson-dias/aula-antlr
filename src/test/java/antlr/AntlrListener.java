// Generated from Antlr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrParser}.
 */
public interface AntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(@NotNull AntlrParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(@NotNull AntlrParser.OpContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull AntlrParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull AntlrParser.GoalContext ctx);
}