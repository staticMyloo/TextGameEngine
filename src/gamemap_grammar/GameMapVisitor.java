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
	 * Visit a parse tree produced by {@link GameMapParser#vertexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertexList(GameMapParser.VertexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#edgeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeList(GameMapParser.EdgeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex(GameMapParser.VertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(GameMapParser.EdgeContext ctx);
}