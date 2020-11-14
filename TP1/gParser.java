// Generated from g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Lista=3, Palavra=4, Num=5, WS=6;
	public static final int
		RULE_s = 0, RULE_lista = 1, RULE_elems = 2, RULE_elem = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "lista", "elems", "elem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Lista", "Palavra", "Num", "WS"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int comprimento = 0;
	    int quantiNumeros = 0;
	    int palavras = 0;
	    int somatorio = 0;
	    int soma = 0;
	    int momento = 0;
	    int maior = -1;

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				lista();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Lista );
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode Lista() { return getToken(gParser.Lista, 0); }
		public ElemsContext elems() {
			return getRuleContext(ElemsContext.class,0);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(Lista);
			setState(14);
			elems();
			setState(15);
			match(T__0);
			System.out.println("Tamanho da lista : " + comprimento);
			                     System.out.println("Quantidade de Números: " + quantiNumeros);
			                     System.out.println("Somatório dos números: " + somatorio);
			                     System.out.println("Número maior: " +maior);
			                     System.out.println("A média dos núemros presentes é:" +(soma/quantiNumeros));
			                     if(quantiNumeros==palavras) System.out.println("Núemro de palavras é igual ao número de números");
			                     else System.out.println("O núumero de palavras e números são diferentes.");
			                     quantiNumeros = 0; palavras = 0; momento = 0; maior = -1; soma = 0;
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

	public static class ElemsContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public ElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElems(this);
		}
	}

	public final ElemsContext elems() throws RecognitionException {
		ElemsContext _localctx = new ElemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			elem();
			comprimento = 1; 
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(20);
				match(T__1);
				setState(21);
				elem();
				comprimento++;
				}
				}
				setState(28);
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

	public static class ElemContext extends ParserRuleContext {
		public Token Palavra;
		public Token Num;
		public TerminalNode Palavra() { return getToken(gParser.Palavra, 0); }
		public TerminalNode Num() { return getToken(gParser.Num, 0); }
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElem(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elem);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Palavra:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((ElemContext)_localctx).Palavra = match(Palavra);
				palavras++; if((((ElemContext)_localctx).Palavra!=null?((ElemContext)_localctx).Palavra.getText():null).equals("agora")) momento = 1; else if(momento == 1 && (((ElemContext)_localctx).Palavra!=null?((ElemContext)_localctx).Palavra.getText():null).equals("fim")) momento = 0;
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((ElemContext)_localctx).Num = match(Num);
				 soma += (((ElemContext)_localctx).Num!=null?Integer.valueOf(((ElemContext)_localctx).Num.getText()):0) ; quantiNumeros++; if (momento ==1) somatorio += (((ElemContext)_localctx).Num!=null?Integer.valueOf(((ElemContext)_localctx).Num.getText()):0);
				              if (maior < (((ElemContext)_localctx).Num!=null?Integer.valueOf(((ElemContext)_localctx).Num.getText()):0)) maior = (((ElemContext)_localctx).Num!=null?Integer.valueOf(((ElemContext)_localctx).Num.getText()):0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\5\3\5\3\5\3\5\5\5$\n"+
		"\5\3\5\2\2\6\2\4\6\b\2\2\2$\2\13\3\2\2\2\4\17\3\2\2\2\6\24\3\2\2\2\b#"+
		"\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2"+
		"\2\16\3\3\2\2\2\17\20\7\5\2\2\20\21\5\6\4\2\21\22\7\3\2\2\22\23\b\3\1"+
		"\2\23\5\3\2\2\2\24\25\5\b\5\2\25\34\b\4\1\2\26\27\7\4\2\2\27\30\5\b\5"+
		"\2\30\31\b\4\1\2\31\33\3\2\2\2\32\26\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\7\3\2\2\2\36\34\3\2\2\2\37 \7\6\2\2 $\b\5\1\2!\"\7"+
		"\7\2\2\"$\b\5\1\2#\37\3\2\2\2#!\3\2\2\2$\t\3\2\2\2\5\r\34#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}