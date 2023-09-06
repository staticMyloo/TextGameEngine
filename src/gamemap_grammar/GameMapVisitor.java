// Generated from C:/Users/myles/Desktop/TextGameEngine/src\GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomList(GameMapParser.RoomListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#edgeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeList(GameMapParser.EdgeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(GameMapParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#treasureItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreasureItem(GameMapParser.TreasureItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomName(GameMapParser.RoomNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#pickup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickup(GameMapParser.PickupContext ctx);
}