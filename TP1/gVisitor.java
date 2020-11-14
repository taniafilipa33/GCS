// Generated from g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(gParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(gParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(gParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(gParser.ElemContext ctx);
}