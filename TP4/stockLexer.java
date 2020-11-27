// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gramáticas na Compreensão de Software/GCS/TP4\stock.g4 by ANTLR 4.8

        import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stockLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STOCK=4, FATURA=5, MOVIMENTOS=6, CLIENTE=7, FORNECEDOR=8, 
		VENDAS=9, NUM=10, STRING=11, VIRG=12, PONTO=13, PONTVIRG=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STOCK", "FATURA", "MOVIMENTOS", "CLIENTE", "FORNECEDOR", 
			"VENDAS", "NUM", "STRING", "VIRG", "PONTO", "PONTVIRG", "WS"
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


	    class Produto{
	           int referencia;
	           String descricao;
	           int preco;
	           int quantidade;
	    }


	public stockLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "stock.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\6\13[\n\13\r\13\16\13\\\3\f\6\f`\n\f\r\f\16\fa\3\f\7\fe\n\f\f\f\16"+
		"\fh\13\f\3\f\6\fk\n\f\r\f\16\fl\7\fo\n\f\f\f\16\fr\13\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\5\20{\n\20\3\20\3\20\6\20\177\n\20\r\20\16\20\u0080"+
		"\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\25\4\2UUuu\4\2VVvv\4\2QQqq\4\2EEee\4\2MMmm\4"+
		"\2HHhh\4\2CCcc\4\2WWww\4\2TTtt\4\2OOoo\4\2XXxx\4\2KKkk\4\2GGgg\4\2PPp"+
		"p\4\2NNnn\4\2FFff\3\2\62;\4\2C\\c|\4\2\13\13\"\"\2\u008b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2"+
		"\t\'\3\2\2\2\13-\3\2\2\2\r\64\3\2\2\2\17?\3\2\2\2\21G\3\2\2\2\23R\3\2"+
		"\2\2\25Z\3\2\2\2\27_\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37~\3"+
		"\2\2\2!\"\7<\2\2\"\4\3\2\2\2#$\7}\2\2$\6\3\2\2\2%&\7\177\2\2&\b\3\2\2"+
		"\2\'(\t\2\2\2()\t\3\2\2)*\t\4\2\2*+\t\5\2\2+,\t\6\2\2,\n\3\2\2\2-.\t\7"+
		"\2\2./\t\b\2\2/\60\t\3\2\2\60\61\t\t\2\2\61\62\t\n\2\2\62\63\t\b\2\2\63"+
		"\f\3\2\2\2\64\65\t\13\2\2\65\66\t\4\2\2\66\67\t\f\2\2\678\t\r\2\289\t"+
		"\13\2\29:\t\16\2\2:;\t\17\2\2;<\t\3\2\2<=\t\4\2\2=>\t\2\2\2>\16\3\2\2"+
		"\2?@\t\5\2\2@A\t\20\2\2AB\t\r\2\2BC\t\16\2\2CD\t\17\2\2DE\t\3\2\2EF\t"+
		"\16\2\2F\20\3\2\2\2GH\t\7\2\2HI\t\4\2\2IJ\t\n\2\2JK\t\17\2\2KL\t\16\2"+
		"\2LM\t\5\2\2MN\t\16\2\2NO\t\21\2\2OP\t\4\2\2PQ\t\n\2\2Q\22\3\2\2\2RS\t"+
		"\f\2\2ST\t\16\2\2TU\t\17\2\2UV\t\21\2\2VW\t\b\2\2WX\t\2\2\2X\24\3\2\2"+
		"\2Y[\t\22\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\26\3\2\2\2^"+
		"`\t\23\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bp\3\2\2\2ce\7\"\2\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ik\t\23\2"+
		"\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nf\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2q\30\3\2\2\2rp\3\2\2\2st\7.\2\2t\32\3\2\2\2uv\7"+
		"\60\2\2v\34\3\2\2\2wx\7=\2\2x\36\3\2\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2"+
		"\2{|\3\2\2\2|\177\7\f\2\2}\177\t\24\2\2~z\3\2\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\b\20\2\2\u0083 \3\2\2\2\13\2\\aflpz~\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}