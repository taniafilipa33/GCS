// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gramáticas na Compreensão de Software/GCS/TP3\exercicio2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exercicio2Parser}.
 */
public interface exercicio2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exercicio2Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(exercicio2Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio2Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(exercicio2Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio2Parser#turma}.
	 * @param ctx the parse tree
	 */
	void enterTurma(exercicio2Parser.TurmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio2Parser#turma}.
	 * @param ctx the parse tree
	 */
	void exitTurma(exercicio2Parser.TurmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio2Parser#alunos}.
	 * @param ctx the parse tree
	 */
	void enterAlunos(exercicio2Parser.AlunosContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio2Parser#alunos}.
	 * @param ctx the parse tree
	 */
	void exitAlunos(exercicio2Parser.AlunosContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio2Parser#aluno}.
	 * @param ctx the parse tree
	 */
	void enterAluno(exercicio2Parser.AlunoContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio2Parser#aluno}.
	 * @param ctx the parse tree
	 */
	void exitAluno(exercicio2Parser.AlunoContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio2Parser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(exercicio2Parser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio2Parser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(exercicio2Parser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio2Parser#notas}.
	 * @param ctx the parse tree
	 */
	void enterNotas(exercicio2Parser.NotasContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio2Parser#notas}.
	 * @param ctx the parse tree
	 */
	void exitNotas(exercicio2Parser.NotasContext ctx);
}