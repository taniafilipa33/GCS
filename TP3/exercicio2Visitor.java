// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/PLC/Gramáticas na Compreensão de Software/GCS/TP3\exercicio2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exercicio2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exercicio2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exercicio2Parser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(exercicio2Parser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link exercicio2Parser#turma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurma(exercicio2Parser.TurmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link exercicio2Parser#alunos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlunos(exercicio2Parser.AlunosContext ctx);
	/**
	 * Visit a parse tree produced by {@link exercicio2Parser#aluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAluno(exercicio2Parser.AlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link exercicio2Parser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(exercicio2Parser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link exercicio2Parser#notas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotas(exercicio2Parser.NotasContext ctx);
}