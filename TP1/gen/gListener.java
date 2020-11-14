// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/GCS/TP1\g.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(gParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(gParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(gParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(gParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elems}.
	 * @param ctx the parse tree
	 */
	void enterElems(gParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elems}.
	 * @param ctx the parse tree
	 */
	void exitElems(gParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(gParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(gParser.ElemContext ctx);
}