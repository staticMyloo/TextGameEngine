// Generated from C:/Users/myles/Desktop/TextGameEngine/src\PlayerCommand.g4 by ANTLR 4.12.0
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayerCommandParser}.
 */
public interface PlayerCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#exploreCommand}.
	 * @param ctx the parse tree
	 */
	void enterExploreCommand(PlayerCommandParser.ExploreCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#exploreCommand}.
	 * @param ctx the parse tree
	 */
	void exitExploreCommand(PlayerCommandParser.ExploreCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#battleCommand}.
	 * @param ctx the parse tree
	 */
	void enterBattleCommand(PlayerCommandParser.BattleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#battleCommand}.
	 * @param ctx the parse tree
	 */
	void exitBattleCommand(PlayerCommandParser.BattleCommandContext ctx);
}