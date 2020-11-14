// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/GCS/TP1\Ex12.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ex12Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ex12Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ex12Parser#listas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListas(Ex12Parser.ListasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex12Parser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(Ex12Parser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex12Parser#elementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementos(Ex12Parser.ElementosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex12Parser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento(Ex12Parser.ElementoContext ctx);
}