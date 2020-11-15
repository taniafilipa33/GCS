// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gram�ticas na Compreens�o de Software/GCS/TP3\exercicio2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exercicio2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TURMA=3, ID=4, NOME=5, NOTA=6, VIRG=7, PONTO=8, PONTIVIRG=9, 
		WS=10;
	public static final int
		RULE_s = 0, RULE_turma = 1, RULE_alunos = 2, RULE_aluno = 3, RULE_nome = 4, 
		RULE_notas = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "turma", "alunos", "aluno", "nome", "notas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, "','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TURMA", "ID", "NOME", "NOTA", "VIRG", "PONTO", "PONTIVIRG", 
			"WS"
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
	public String getGrammarFileName() { return "exercicio2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public exercicio2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public List<TurmaContext> turma() {
			return getRuleContexts(TurmaContext.class);
		}
		public TurmaContext turma(int i) {
			return getRuleContext(TurmaContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exercicio2Visitor ) return ((exercicio2Visitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				turma();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TURMA );
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

	public static class TurmaContext extends ParserRuleContext {
		public AlunosContext alunos;
		public TerminalNode TURMA() { return getToken(exercicio2Parser.TURMA, 0); }
		public TerminalNode ID() { return getToken(exercicio2Parser.ID, 0); }
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(exercicio2Parser.PONTO, 0); }
		public TurmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).enterTurma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).exitTurma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exercicio2Visitor ) return ((exercicio2Visitor<? extends T>)visitor).visitTurma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurmaContext turma() throws RecognitionException {
		TurmaContext _localctx = new TurmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_turma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(TURMA);
			setState(18);
			match(ID);
			setState(19);
			((TurmaContext)_localctx).alunos = alunos();

			        System.out.println("numero total de alunos:"+((TurmaContext)_localctx).alunos.totalAlunos);
			            
			setState(21);
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

	public static class AlunosContext extends ParserRuleContext {
		public int totalAlunos;
		public List<AlunoContext> aluno() {
			return getRuleContexts(AlunoContext.class);
		}
		public AlunoContext aluno(int i) {
			return getRuleContext(AlunoContext.class,i);
		}
		public List<TerminalNode> PONTIVIRG() { return getTokens(exercicio2Parser.PONTIVIRG); }
		public TerminalNode PONTIVIRG(int i) {
			return getToken(exercicio2Parser.PONTIVIRG, i);
		}
		public AlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alunos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).enterAlunos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).exitAlunos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exercicio2Visitor ) return ((exercicio2Visitor<? extends T>)visitor).visitAlunos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunosContext alunos() throws RecognitionException {
		AlunosContext _localctx = new AlunosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alunos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			aluno();
			((AlunosContext)_localctx).totalAlunos =  1;
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTIVIRG) {
				{
				{
				setState(25);
				match(PONTIVIRG);
				setState(26);
				aluno();
				_localctx.totalAlunos +=1;
				}
				}
				setState(33);
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

	public static class AlunoContext extends ParserRuleContext {
		public NomeContext nome;
		public NotasContext notas;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public NotasContext notas() {
			return getRuleContext(NotasContext.class,0);
		}
		public AlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).enterAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).exitAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exercicio2Visitor ) return ((exercicio2Visitor<? extends T>)visitor).visitAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunoContext aluno() throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((AlunoContext)_localctx).nome = nome();
			setState(35);
			((AlunoContext)_localctx).notas = notas((((AlunoContext)_localctx).nome!=null?_input.getText(((AlunoContext)_localctx).nome.start,((AlunoContext)_localctx).nome.stop):null));

			            float media = ((AlunoContext)_localctx).notas.somaNotas / ((AlunoContext)_localctx).notas.totalNotas;
			            System.out.println("A media do/a " + (((AlunoContext)_localctx).nome!=null?_input.getText(((AlunoContext)_localctx).nome.start,((AlunoContext)_localctx).nome.stop):null) + " é " +media);

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
		public TerminalNode NOME() { return getToken(exercicio2Parser.NOME, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exercicio2Visitor ) return ((exercicio2Visitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NOME);
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

	public static class NotasContext extends ParserRuleContext {
		public String nomeA;
		public int somaNotas;
		public int totalNotas;
		public Token n1;
		public Token n2;
		public List<TerminalNode> NOTA() { return getTokens(exercicio2Parser.NOTA); }
		public TerminalNode NOTA(int i) {
			return getToken(exercicio2Parser.NOTA, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(exercicio2Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(exercicio2Parser.VIRG, i);
		}
		public NotasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NotasContext(ParserRuleContext parent, int invokingState, String nomeA) {
			super(parent, invokingState);
			this.nomeA = nomeA;
		}
		@Override public int getRuleIndex() { return RULE_notas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).enterNotas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio2Listener ) ((exercicio2Listener)listener).exitNotas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exercicio2Visitor ) return ((exercicio2Visitor<? extends T>)visitor).visitNotas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotasContext notas(String nomeA) throws RecognitionException {
		NotasContext _localctx = new NotasContext(_ctx, getState(), nomeA);
		enterRule(_localctx, 10, RULE_notas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			((NotasContext)_localctx).n1 = match(NOTA);
			if((((NotasContext)_localctx).n1!=null?Integer.valueOf(((NotasContext)_localctx).n1.getText()):0) > -1 && (((NotasContext)_localctx).n1!=null?Integer.valueOf(((NotasContext)_localctx).n1.getText()):0)<21) {((NotasContext)_localctx).somaNotas = (((NotasContext)_localctx).n1!=null?Integer.valueOf(((NotasContext)_localctx).n1.getText()):0);((NotasContext)_localctx).totalNotas = 1;}
			                    else System.out.println("Nota invalida");
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(43);
				match(VIRG);
				setState(44);
				((NotasContext)_localctx).n2 = match(NOTA);
				if((((NotasContext)_localctx).n1!=null?Integer.valueOf(((NotasContext)_localctx).n1.getText()):0) > -1 && (((NotasContext)_localctx).n1!=null?Integer.valueOf(((NotasContext)_localctx).n1.getText()):0)<21)
				                            {_localctx.somaNotas+=(((NotasContext)_localctx).n2!=null?Integer.valueOf(((NotasContext)_localctx).n2.getText()):0);_localctx.totalNotas+=1;}
				                            else System.out.println("Nota invalida");
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__1);

			                 if(_localctx.totalNotas >= 4 && _localctx.totalNotas <= 6 ) System.out.println("O aluno tem entre 4 e 6 notas");
			                   else System.out.println("Erro: O aluno "+ _localctx.nomeA +" não tem o numero de notas correto");
			             
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7"+
		"\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2\65\2\17\3\2\2\2\4\23\3\2\2\2"+
		"\6\31\3\2\2\2\b$\3\2\2\2\n(\3\2\2\2\f*\3\2\2\2\16\20\5\4\3\2\17\16\3\2"+
		"\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\5"+
		"\2\2\24\25\7\6\2\2\25\26\5\6\4\2\26\27\b\3\1\2\27\30\7\n\2\2\30\5\3\2"+
		"\2\2\31\32\5\b\5\2\32!\b\4\1\2\33\34\7\13\2\2\34\35\5\b\5\2\35\36\b\4"+
		"\1\2\36 \3\2\2\2\37\33\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\7\3"+
		"\2\2\2#!\3\2\2\2$%\5\n\6\2%&\5\f\7\2&\'\b\5\1\2\'\t\3\2\2\2()\7\7\2\2"+
		")\13\3\2\2\2*+\7\3\2\2+,\7\b\2\2,\62\b\7\1\2-.\7\t\2\2./\7\b\2\2/\61\b"+
		"\7\1\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2"+
		"\2\2\64\62\3\2\2\2\65\66\7\4\2\2\66\67\b\7\1\2\67\r\3\2\2\2\5\21!\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}