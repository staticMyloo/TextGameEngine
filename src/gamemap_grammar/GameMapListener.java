// Generated from C:/Users/myles/Desktop/TextGameEngine/src\GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void enterGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void exitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#vertexList}.
	 * @param ctx the parse tree
	 */
	void enterVertexList(GameMapParser.VertexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#vertexList}.
	 * @param ctx the parse tree
	 */
	void exitVertexList(GameMapParser.VertexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#edgeList}.
	 * @param ctx the parse tree
	 */
	void enterEdgeList(GameMapParser.EdgeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#edgeList}.
	 * @param ctx the parse tree
	 */
	void exitEdgeList(GameMapParser.EdgeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#vertex}.
	 * @param ctx the parse tree
	 */
	void enterVertex(GameMapParser.VertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#vertex}.
	 * @param ctx the parse tree
	 */
	void exitVertex(GameMapParser.VertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(GameMapParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(GameMapParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#treasureItem}.
	 * @param ctx the parse tree
	 */
	void enterTreasureItem(GameMapParser.TreasureItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#treasureItem}.
	 * @param ctx the parse tree
	 */
	void exitTreasureItem(GameMapParser.TreasureItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#pickup}.
	 * @param ctx the parse tree
	 */
	void enterPickup(GameMapParser.PickupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#pickup}.
	 * @param ctx the parse tree
	 */
	void exitPickup(GameMapParser.PickupContext ctx);
}