// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gramáticas na Compreensão de Software/GCS/TP4\stock.g4 by ANTLR 4.8

        import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link stockParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface stockVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link stockParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(stockParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#stock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStock(stockParser.StockContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#faturas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaturas(stockParser.FaturasContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#fatura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatura(stockParser.FaturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalho(stockParser.CabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#cliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliente(stockParser.ClienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(stockParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha(stockParser.LinhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#fornecedor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFornecedor(stockParser.FornecedorContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#movimentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovimentos(stockParser.MovimentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#produto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduto(stockParser.ProdutoContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(stockParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#movimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovimento(stockParser.MovimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(stockParser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#preco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreco(stockParser.PrecoContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#quantidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantidade(stockParser.QuantidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(stockParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#nif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNif(stockParser.NifContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#nib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNib(stockParser.NibContext ctx);
	/**
	 * Visit a parse tree produced by {@link stockParser#morada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorada(stockParser.MoradaContext ctx);
}