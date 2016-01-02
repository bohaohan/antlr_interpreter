package gen;// Generated from /Users/bohaohan/Documents/workspace/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(HelloParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(HelloParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(HelloParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(HelloParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#listVar}.
	 * @param ctx the parse tree
	 */
	void enterListVar(HelloParser.ListVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#listVar}.
	 * @param ctx the parse tree
	 */
	void exitListVar(HelloParser.ListVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(HelloParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(HelloParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(HelloParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(HelloParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(HelloParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(HelloParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(HelloParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(HelloParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(HelloParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(HelloParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expValue}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpValue(HelloParser.ExpValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expValue}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpValue(HelloParser.ExpValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(HelloParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(HelloParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(HelloParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(HelloParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(HelloParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(HelloParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(HelloParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(HelloParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(HelloParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(HelloParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(HelloParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(HelloParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(HelloParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(HelloParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(HelloParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(HelloParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(HelloParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(HelloParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(HelloParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(HelloParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#list_var}.
	 * @param ctx the parse tree
	 */
	void enterList_var(HelloParser.List_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#list_var}.
	 * @param ctx the parse tree
	 */
	void exitList_var(HelloParser.List_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valAV}
	 * labeled alternative in {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValAV(HelloParser.ValAVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valAV}
	 * labeled alternative in {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValAV(HelloParser.ValAVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valID}
	 * labeled alternative in {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValID(HelloParser.ValIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valID}
	 * labeled alternative in {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValID(HelloParser.ValIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(HelloParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(HelloParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(HelloParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(HelloParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#eLSE}.
	 * @param ctx the parse tree
	 */
	void enterELSE(HelloParser.ELSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#eLSE}.
	 * @param ctx the parse tree
	 */
	void exitELSE(HelloParser.ELSEContext ctx);
}