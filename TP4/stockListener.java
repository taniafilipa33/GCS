// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gramáticas na Compreensão de Software/GCS/TP4\stock.g4 by ANTLR 4.8

        import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link stockParser}.
 */
public interface stockListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link stockParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(stockParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(stockParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#stock}.
	 * @param ctx the parse tree
	 */
	void enterStock(stockParser.StockContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#stock}.
	 * @param ctx the parse tree
	 */
	void exitStock(stockParser.StockContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#faturas}.
	 * @param ctx the parse tree
	 */
	void enterFaturas(stockParser.FaturasContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#faturas}.
	 * @param ctx the parse tree
	 */
	void exitFaturas(stockParser.FaturasContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#fatura}.
	 * @param ctx the parse tree
	 */
	void enterFatura(stockParser.FaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#fatura}.
	 * @param ctx the parse tree
	 */
	void exitFatura(stockParser.FaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(stockParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(stockParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#cliente}.
	 * @param ctx the parse tree
	 */
	void enterCliente(stockParser.ClienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#cliente}.
	 * @param ctx the parse tree
	 */
	void exitCliente(stockParser.ClienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(stockParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(stockParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(stockParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(stockParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#fornecedor}.
	 * @param ctx the parse tree
	 */
	void enterFornecedor(stockParser.FornecedorContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#fornecedor}.
	 * @param ctx the parse tree
	 */
	void exitFornecedor(stockParser.FornecedorContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#movimentos}.
	 * @param ctx the parse tree
	 */
	void enterMovimentos(stockParser.MovimentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#movimentos}.
	 * @param ctx the parse tree
	 */
	void exitMovimentos(stockParser.MovimentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#produto}.
	 * @param ctx the parse tree
	 */
	void enterProduto(stockParser.ProdutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#produto}.
	 * @param ctx the parse tree
	 */
	void exitProduto(stockParser.ProdutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(stockParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(stockParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#movimento}.
	 * @param ctx the parse tree
	 */
	void enterMovimento(stockParser.MovimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#movimento}.
	 * @param ctx the parse tree
	 */
	void exitMovimento(stockParser.MovimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(stockParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(stockParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#preco}.
	 * @param ctx the parse tree
	 */
	void enterPreco(stockParser.PrecoContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#preco}.
	 * @param ctx the parse tree
	 */
	void exitPreco(stockParser.PrecoContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#quantidade}.
	 * @param ctx the parse tree
	 */
	void enterQuantidade(stockParser.QuantidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#quantidade}.
	 * @param ctx the parse tree
	 */
	void exitQuantidade(stockParser.QuantidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(stockParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(stockParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#nif}.
	 * @param ctx the parse tree
	 */
	void enterNif(stockParser.NifContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#nif}.
	 * @param ctx the parse tree
	 */
	void exitNif(stockParser.NifContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#nib}.
	 * @param ctx the parse tree
	 */
	void enterNib(stockParser.NibContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#nib}.
	 * @param ctx the parse tree
	 */
	void exitNib(stockParser.NibContext ctx);
	/**
	 * Enter a parse tree produced by {@link stockParser#morada}.
	 * @param ctx the parse tree
	 */
	void enterMorada(stockParser.MoradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link stockParser#morada}.
	 * @param ctx the parse tree
	 */
	void exitMorada(stockParser.MoradaContext ctx);
}