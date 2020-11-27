// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gram·ticas na Compreens„o de Software/GCS/TP4\stock.g4 by ANTLR 4.8

        import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stockParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STOCK=4, FATURA=5, MOVIMENTOS=6, CLIENTE=7, FORNECEDOR=8, 
		VENDAS=9, NUM=10, STRING=11, VIRG=12, PONTO=13, PONTVIRG=14, WS=15;
	public static final int
		RULE_s = 0, RULE_stock = 1, RULE_faturas = 2, RULE_fatura = 3, RULE_cabecalho = 4, 
		RULE_cliente = 5, RULE_corpo = 6, RULE_linha = 7, RULE_fornecedor = 8, 
		RULE_movimentos = 9, RULE_produto = 10, RULE_ref = 11, RULE_movimento = 12, 
		RULE_descricao = 13, RULE_preco = 14, RULE_quantidade = 15, RULE_nome = 16, 
		RULE_nif = 17, RULE_nib = 18, RULE_morada = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "stock", "faturas", "fatura", "cabecalho", "cliente", "corpo", "linha", 
			"fornecedor", "movimentos", "produto", "ref", "movimento", "descricao", 
			"preco", "quantidade", "nome", "nif", "nib", "morada"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", null, null, null, null, null, null, null, 
			null, "','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STOCK", "FATURA", "MOVIMENTOS", "CLIENTE", "FORNECEDOR", 
			"VENDAS", "NUM", "STRING", "VIRG", "PONTO", "PONTVIRG", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "stock.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    class Produto{
	           int referencia;
	           String descricao;
	           int preco;
	           int quantidade;
	    }

	public stockParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public StockContext s1;
		public TerminalNode PONTVIRG() { return getToken(stockParser.PONTVIRG, 0); }
		public FaturasContext faturas() {
			return getRuleContext(FaturasContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(stockParser.PONTO, 0); }
		public StockContext stock() {
			return getRuleContext(StockContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			HashMap<Integer,Produto> prodsA = new HashMap<Integer,Produto>();
			   
			setState(41);
			((SContext)_localctx).s1 = stock(prodsA);
			setState(42);
			match(PONTVIRG);
			setState(43);
			faturas(((SContext)_localctx).s1.prods);
			setState(44);
			match(PONTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StockContext extends ParserRuleContext {
		public HashMap<Integer,Produto> prodsA;
		public HashMap<Integer,Produto> prods;
		public ProdutoContext p1;
		public ProdutoContext p2;
		public TerminalNode STOCK() { return getToken(stockParser.STOCK, 0); }
		public List<ProdutoContext> produto() {
			return getRuleContexts(ProdutoContext.class);
		}
		public ProdutoContext produto(int i) {
			return getRuleContext(ProdutoContext.class,i);
		}
		public List<TerminalNode> PONTVIRG() { return getTokens(stockParser.PONTVIRG); }
		public TerminalNode PONTVIRG(int i) {
			return getToken(stockParser.PONTVIRG, i);
		}
		public StockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StockContext(ParserRuleContext parent, int invokingState, HashMap<Integer,Produto> prodsA) {
			super(parent, invokingState);
			this.prodsA = prodsA;
		}
		@Override public int getRuleIndex() { return RULE_stock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterStock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitStock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitStock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StockContext stock(HashMap<Integer,Produto> prodsA) throws RecognitionException {
		StockContext _localctx = new StockContext(_ctx, getState(), prodsA);
		enterRule(_localctx, 2, RULE_stock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(STOCK);
			setState(47);
			match(T__0);
			setState(48);
			match(T__1);
			setState(49);
			((StockContext)_localctx).p1 = produto(_localctx.prodsA);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTVIRG) {
				{
				{
				((StockContext)_localctx).prods =  ((StockContext)_localctx).p1.prodOUT;
				setState(51);
				match(PONTVIRG);
				setState(52);
				((StockContext)_localctx).p2 = produto(_localctx.prods);
				((StockContext)_localctx).prods =  ((StockContext)_localctx).p2.prodOUT;
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaturasContext extends ParserRuleContext {
		public HashMap<Integer,Produto> prodIn;
		public HashMap<Integer,Produto> prodOut;
		public FaturaContext f1;
		public FaturaContext f2;
		public List<FaturaContext> fatura() {
			return getRuleContexts(FaturaContext.class);
		}
		public FaturaContext fatura(int i) {
			return getRuleContext(FaturaContext.class,i);
		}
		public List<TerminalNode> PONTVIRG() { return getTokens(stockParser.PONTVIRG); }
		public TerminalNode PONTVIRG(int i) {
			return getToken(stockParser.PONTVIRG, i);
		}
		public FaturasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FaturasContext(ParserRuleContext parent, int invokingState, HashMap<Integer,Produto> prodIn) {
			super(parent, invokingState);
			this.prodIn = prodIn;
		}
		@Override public int getRuleIndex() { return RULE_faturas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterFaturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitFaturas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitFaturas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaturasContext faturas(HashMap<Integer,Produto> prodIn) throws RecognitionException {
		FaturasContext _localctx = new FaturasContext(_ctx, getState(), prodIn);
		enterRule(_localctx, 4, RULE_faturas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((FaturasContext)_localctx).f1 = fatura(_localctx.prodIn);
			((FaturasContext)_localctx).prodOut =  ((FaturasContext)_localctx).f1.prodFOut;
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTVIRG) {
				{
				{
				setState(64);
				match(PONTVIRG);
				setState(65);
				((FaturasContext)_localctx).f2 = fatura(_localctx.prodOut);
				((FaturasContext)_localctx).prodOut =  ((FaturasContext)_localctx).f2.prodFOut;
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaturaContext extends ParserRuleContext {
		public HashMap<Integer,Produto> prodFIn;
		public HashMap<Integer,Produto> prodFOut;
		public CorpoContext g1;
		public TerminalNode FATURA() { return getToken(stockParser.FATURA, 0); }
		public CabecalhoContext cabecalho() {
			return getRuleContext(CabecalhoContext.class,0);
		}
		public TerminalNode VENDAS() { return getToken(stockParser.VENDAS, 0); }
		public TerminalNode MOVIMENTOS() { return getToken(stockParser.MOVIMENTOS, 0); }
		public MovimentosContext movimentos() {
			return getRuleContext(MovimentosContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public FaturaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FaturaContext(ParserRuleContext parent, int invokingState, HashMap<Integer,Produto> prodFIn) {
			super(parent, invokingState);
			this.prodFIn = prodFIn;
		}
		@Override public int getRuleIndex() { return RULE_fatura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterFatura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitFatura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitFatura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaturaContext fatura(HashMap<Integer,Produto> prodFIn) throws RecognitionException {
		FaturaContext _localctx = new FaturaContext(_ctx, getState(), prodFIn);
		enterRule(_localctx, 6, RULE_fatura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FATURA);
			setState(74);
			cabecalho();
			setState(75);
			match(VENDAS);
			setState(76);
			((FaturaContext)_localctx).g1 = corpo(_localctx.prodFIn);
			((FaturaContext)_localctx).prodFOut =  _localctx.prodFIn;
			setState(78);
			match(MOVIMENTOS);
			setState(79);
			match(T__0);
			setState(80);
			movimentos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabecalhoContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public FornecedorContext fornecedor() {
			return getRuleContext(FornecedorContext.class,0);
		}
		public ClienteContext cliente() {
			return getRuleContext(ClienteContext.class,0);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitCabecalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitCabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			ref();
			setState(83);
			fornecedor();
			setState(84);
			cliente();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClienteContext extends ParserRuleContext {
		public TerminalNode CLIENTE() { return getToken(stockParser.CLIENTE, 0); }
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<TerminalNode> VIRG() { return getTokens(stockParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(stockParser.VIRG, i);
		}
		public NifContext nif() {
			return getRuleContext(NifContext.class,0);
		}
		public MoradaContext morada() {
			return getRuleContext(MoradaContext.class,0);
		}
		public ClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cliente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClienteContext cliente() throws RecognitionException {
		ClienteContext _localctx = new ClienteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cliente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CLIENTE);
			setState(87);
			match(T__0);
			setState(88);
			nome();
			setState(89);
			match(VIRG);
			setState(90);
			nif();
			setState(91);
			match(VIRG);
			setState(92);
			morada();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public HashMap<Integer,Produto> prodCIn;
		public HashMap<Integer,Produto> prodCOut;
		public LinhaContext l1;
		public LinhaContext l2;
		public List<TerminalNode> PONTO() { return getTokens(stockParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(stockParser.PONTO, i);
		}
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CorpoContext(ParserRuleContext parent, int invokingState, HashMap<Integer,Produto> prodCIn) {
			super(parent, invokingState);
			this.prodCIn = prodCIn;
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo(HashMap<Integer,Produto> prodCIn) throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState(), prodCIn);
		enterRule(_localctx, 12, RULE_corpo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((CorpoContext)_localctx).l1 = linha(_localctx.prodCIn);
			((CorpoContext)_localctx).prodCOut =  ((CorpoContext)_localctx).l1.prodLout; 
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(PONTO);
					setState(97);
					((CorpoContext)_localctx).l2 = linha(_localctx.prodCOut);
					((CorpoContext)_localctx).prodCOut =  ((CorpoContext)_localctx).l2.prodLout;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(105);
			match(PONTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinhaContext extends ParserRuleContext {
		public HashMap<Integer,Produto> prodLin;
		public HashMap<Integer,Produto> prodLout;
		public RefContext ref;
		public QuantidadeContext quantidade;
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode VIRG() { return getToken(stockParser.VIRG, 0); }
		public QuantidadeContext quantidade() {
			return getRuleContext(QuantidadeContext.class,0);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LinhaContext(ParserRuleContext parent, int invokingState, HashMap<Integer,Produto> prodLin) {
			super(parent, invokingState);
			this.prodLin = prodLin;
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha(HashMap<Integer,Produto> prodLin) throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState(), prodLin);
		enterRule(_localctx, 14, RULE_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((LinhaContext)_localctx).ref = ref();
			setState(108);
			match(VIRG);
			setState(109);
			((LinhaContext)_localctx).quantidade = quantidade();
			if(_localctx.prodLin.get(Integer.parseInt((((LinhaContext)_localctx).ref!=null?_input.getText(((LinhaContext)_localctx).ref.start,((LinhaContext)_localctx).ref.stop):null)))==null) System.out.println("O produto n√£o existe");
			                                            else {
			                                                Produto t = _localctx.prodLin.get(Integer.parseInt((((LinhaContext)_localctx).ref!=null?_input.getText(((LinhaContext)_localctx).ref.start,((LinhaContext)_localctx).ref.stop):null)));
			                                                if(t.quantidade < Integer.parseInt((((LinhaContext)_localctx).quantidade!=null?_input.getText(((LinhaContext)_localctx).quantidade.start,((LinhaContext)_localctx).quantidade.stop):null))) System.out.println("Venda n√£o pode ser efetuada devido ao stock insuficiente");
			                                                else {t.quantidade = t.quantidade - Integer.parseInt((((LinhaContext)_localctx).quantidade!=null?_input.getText(((LinhaContext)_localctx).quantidade.start,((LinhaContext)_localctx).quantidade.stop):null));
			                                                      _localctx.prodLin.put(Integer.parseInt((((LinhaContext)_localctx).ref!=null?_input.getText(((LinhaContext)_localctx).ref.start,((LinhaContext)_localctx).ref.stop):null)),t);
			                                                      System.out.println("Venda v√°lida");
			                                                }
			                                            }
			                                            ((LinhaContext)_localctx).prodLout =  _localctx.prodLin;
			                                            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FornecedorContext extends ParserRuleContext {
		public TerminalNode FORNECEDOR() { return getToken(stockParser.FORNECEDOR, 0); }
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<TerminalNode> VIRG() { return getTokens(stockParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(stockParser.VIRG, i);
		}
		public NifContext nif() {
			return getRuleContext(NifContext.class,0);
		}
		public MoradaContext morada() {
			return getRuleContext(MoradaContext.class,0);
		}
		public NibContext nib() {
			return getRuleContext(NibContext.class,0);
		}
		public FornecedorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fornecedor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterFornecedor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitFornecedor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitFornecedor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FornecedorContext fornecedor() throws RecognitionException {
		FornecedorContext _localctx = new FornecedorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fornecedor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FORNECEDOR);
			setState(113);
			match(T__0);
			setState(114);
			nome();
			setState(115);
			match(VIRG);
			setState(116);
			nif();
			setState(117);
			match(VIRG);
			setState(118);
			morada();
			setState(119);
			match(VIRG);
			setState(120);
			nib();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovimentosContext extends ParserRuleContext {
		public List<MovimentoContext> movimento() {
			return getRuleContexts(MovimentoContext.class);
		}
		public MovimentoContext movimento(int i) {
			return getRuleContext(MovimentoContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(stockParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(stockParser.VIRG, i);
		}
		public MovimentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movimentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterMovimentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitMovimentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitMovimentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovimentosContext movimentos() throws RecognitionException {
		MovimentosContext _localctx = new MovimentosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_movimentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			movimento();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(123);
				match(VIRG);
				setState(124);
				movimento();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProdutoContext extends ParserRuleContext {
		public HashMap<Integer,Produto> prodIN;
		public HashMap<Integer,Produto> prodOUT;
		public RefContext ref;
		public DescricaoContext descricao;
		public PrecoContext preco;
		public QuantidadeContext quantidade;
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public List<TerminalNode> VIRG() { return getTokens(stockParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(stockParser.VIRG, i);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public PrecoContext preco() {
			return getRuleContext(PrecoContext.class,0);
		}
		public QuantidadeContext quantidade() {
			return getRuleContext(QuantidadeContext.class,0);
		}
		public ProdutoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ProdutoContext(ParserRuleContext parent, int invokingState, HashMap<Integer,Produto> prodIN) {
			super(parent, invokingState);
			this.prodIN = prodIN;
		}
		@Override public int getRuleIndex() { return RULE_produto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterProduto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitProduto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitProduto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProdutoContext produto(HashMap<Integer,Produto> prodIN) throws RecognitionException {
		ProdutoContext _localctx = new ProdutoContext(_ctx, getState(), prodIN);
		enterRule(_localctx, 20, RULE_produto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((ProdutoContext)_localctx).ref = ref();
			setState(131);
			match(VIRG);
			setState(132);
			((ProdutoContext)_localctx).descricao = descricao();
			setState(133);
			match(VIRG);
			setState(134);
			((ProdutoContext)_localctx).preco = preco();
			setState(135);
			match(VIRG);
			setState(136);
			((ProdutoContext)_localctx).quantidade = quantidade();


			                                                    //gera o produto novo
			                                                    Produto novo =new Produto();
			                                                    novo.descricao = (((ProdutoContext)_localctx).descricao!=null?_input.getText(((ProdutoContext)_localctx).descricao.start,((ProdutoContext)_localctx).descricao.stop):null);
			                                                    novo.referencia = Integer.parseInt((((ProdutoContext)_localctx).ref!=null?_input.getText(((ProdutoContext)_localctx).ref.start,((ProdutoContext)_localctx).ref.stop):null));
			                                                    novo.preco = Integer.parseInt((((ProdutoContext)_localctx).preco!=null?_input.getText(((ProdutoContext)_localctx).preco.start,((ProdutoContext)_localctx).preco.stop):null));
			                                                    novo.quantidade = Integer.parseInt((((ProdutoContext)_localctx).quantidade!=null?_input.getText(((ProdutoContext)_localctx).quantidade.start,((ProdutoContext)_localctx).quantidade.stop):null));


			                                                    //System.out.println("olaaaaaaa"+novo.referencia+novo.preco+novo.quantidade+novo.descricao);
			                                                    //insere ou atualiza na hash
			                                                    _localctx.prodIN.put(novo.referencia,novo);

			                                                    //clone da hash
			                                                    ((ProdutoContext)_localctx).prodOUT =  _localctx.prodIN;

			                                                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(stockParser.NUM, 0); }
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovimentoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(stockParser.STRING, 0); }
		public MovimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterMovimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitMovimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitMovimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovimentoContext movimento() throws RecognitionException {
		MovimentoContext _localctx = new MovimentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_movimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescricaoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(stockParser.STRING, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(stockParser.NUM, 0); }
		public PrecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterPreco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitPreco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitPreco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecoContext preco() throws RecognitionException {
		PrecoContext _localctx = new PrecoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_preco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantidadeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(stockParser.NUM, 0); }
		public QuantidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterQuantidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitQuantidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitQuantidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantidadeContext quantidade() throws RecognitionException {
		QuantidadeContext _localctx = new QuantidadeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quantidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(stockParser.STRING, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NifContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(stockParser.NUM, 0); }
		public NifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterNif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitNif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitNif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NifContext nif() throws RecognitionException {
		NifContext _localctx = new NifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NibContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(stockParser.NUM, 0); }
		public NibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterNib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitNib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitNib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NibContext nib() throws RecognitionException {
		NibContext _localctx = new NibContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoradaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(stockParser.STRING, 0); }
		public MoradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).enterMorada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stockListener ) ((stockListener)listener).exitMorada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stockVisitor ) return ((stockVisitor<? extends T>)visitor).visitMorada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoradaContext morada() throws RecognitionException {
		MoradaContext _localctx = new MoradaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_morada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0080\n\13\f\13\16\13\u0083\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u008f\2*\3\2\2\2\4"+
		"\60\3\2\2\2\6@\3\2\2\2\bK\3\2\2\2\nT\3\2\2\2\fX\3\2\2\2\16`\3\2\2\2\20"+
		"m\3\2\2\2\22r\3\2\2\2\24|\3\2\2\2\26\u0084\3\2\2\2\30\u008d\3\2\2\2\32"+
		"\u008f\3\2\2\2\34\u0091\3\2\2\2\36\u0093\3\2\2\2 \u0095\3\2\2\2\"\u0097"+
		"\3\2\2\2$\u0099\3\2\2\2&\u009b\3\2\2\2(\u009d\3\2\2\2*+\b\2\1\2+,\5\4"+
		"\3\2,-\7\20\2\2-.\5\6\4\2./\7\17\2\2/\3\3\2\2\2\60\61\7\6\2\2\61\62\7"+
		"\3\2\2\62\63\7\4\2\2\63;\5\26\f\2\64\65\b\3\1\2\65\66\7\20\2\2\66\67\5"+
		"\26\f\2\678\b\3\1\28:\3\2\2\29\64\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<>\3\2\2\2=;\3\2\2\2>?\7\5\2\2?\5\3\2\2\2@A\5\b\5\2AH\b\4\1\2BC\7\20"+
		"\2\2CD\5\b\5\2DE\b\4\1\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2I\7\3\2\2\2JH\3\2\2\2KL\7\7\2\2LM\5\n\6\2MN\7\13\2\2NO\5\16\b\2OP"+
		"\b\5\1\2PQ\7\b\2\2QR\7\3\2\2RS\5\24\13\2S\t\3\2\2\2TU\5\30\r\2UV\5\22"+
		"\n\2VW\5\f\7\2W\13\3\2\2\2XY\7\t\2\2YZ\7\3\2\2Z[\5\"\22\2[\\\7\16\2\2"+
		"\\]\5$\23\2]^\7\16\2\2^_\5(\25\2_\r\3\2\2\2`a\5\20\t\2ah\b\b\1\2bc\7\17"+
		"\2\2cd\5\20\t\2de\b\b\1\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\17\2\2l\17\3\2\2\2mn\5\30\r\2no\7\16\2"+
		"\2op\5 \21\2pq\b\t\1\2q\21\3\2\2\2rs\7\n\2\2st\7\3\2\2tu\5\"\22\2uv\7"+
		"\16\2\2vw\5$\23\2wx\7\16\2\2xy\5(\25\2yz\7\16\2\2z{\5&\24\2{\23\3\2\2"+
		"\2|\u0081\5\32\16\2}~\7\16\2\2~\u0080\5\32\16\2\177}\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\25\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\16\2\2\u0086\u0087\5"+
		"\34\17\2\u0087\u0088\7\16\2\2\u0088\u0089\5\36\20\2\u0089\u008a\7\16\2"+
		"\2\u008a\u008b\5 \21\2\u008b\u008c\b\f\1\2\u008c\27\3\2\2\2\u008d\u008e"+
		"\7\f\2\2\u008e\31\3\2\2\2\u008f\u0090\7\r\2\2\u0090\33\3\2\2\2\u0091\u0092"+
		"\7\r\2\2\u0092\35\3\2\2\2\u0093\u0094\7\f\2\2\u0094\37\3\2\2\2\u0095\u0096"+
		"\7\f\2\2\u0096!\3\2\2\2\u0097\u0098\7\r\2\2\u0098#\3\2\2\2\u0099\u009a"+
		"\7\f\2\2\u009a%\3\2\2\2\u009b\u009c\7\f\2\2\u009c\'\3\2\2\2\u009d\u009e"+
		"\7\r\2\2\u009e)\3\2\2\2\6;Hh\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}