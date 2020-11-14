// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/GCS/TP1\Ex12.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex12Parser}.
 */
public interface Ex12Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex12Parser#listas}.
	 * @param ctx the parse tree
	 */
	void enterListas(Ex12Parser.ListasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex12Parser#listas}.
	 * @param ctx the parse tree
	 */
	void exitListas(Ex12Parser.ListasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex12Parser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(Ex12Parser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex12Parser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(Ex12Parser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex12Parser#elementos}.
	 * @param ctx the parse tree
	 */
	void enterElementos(Ex12Parser.ElementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex12Parser#elementos}.
	 * @param ctx the parse tree
	 */
	void exitElementos(Ex12Parser.ElementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex12Parser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(Ex12Parser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex12Parser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(Ex12Parser.ElementoContext ctx);
}