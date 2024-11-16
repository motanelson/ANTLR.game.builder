// Generated from game.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gameParser}.
 */
public interface gameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gameParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gameParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gameParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(gameParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(gameParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(gameParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(gameParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(gameParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(gameParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#subrotina}.
	 * @param ctx the parse tree
	 */
	void enterSubrotina(gameParser.SubrotinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#subrotina}.
	 * @param ctx the parse tree
	 */
	void exitSubrotina(gameParser.SubrotinaContext ctx);
}