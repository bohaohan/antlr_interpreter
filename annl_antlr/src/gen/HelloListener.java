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
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#eExpr}.
	 * @param ctx the parse tree
	 */
	void enterEExpr(HelloParser.EExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#eExpr}.
	 * @param ctx the parse tree
	 */
	void exitEExpr(HelloParser.EExprContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HelloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HelloParser.ValueContext ctx);
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