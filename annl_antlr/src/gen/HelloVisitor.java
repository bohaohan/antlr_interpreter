package gen;// Generated from /Users/qm/IdeaProjects/CMM/antlr_interpreter/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(HelloParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(HelloParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#listVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListVar(HelloParser.ListVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sub_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_var(HelloParser.Sub_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmtBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(HelloParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(HelloParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(HelloParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBool}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBool(HelloParser.ExpBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(HelloParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(HelloParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(HelloParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(HelloParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(HelloParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expValue}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpValue(HelloParser.ExpValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(HelloParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(HelloParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(HelloParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(HelloParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(HelloParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(HelloParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(HelloParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#list_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_var(HelloParser.List_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valAV}
	 * labeled alternative in {@link HelloParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValAV(HelloParser.ValAVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valID}
	 * labeled alternative in {@link HelloParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValID(HelloParser.ValIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(HelloParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HelloParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HelloParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#eLSE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELSE(HelloParser.ELSEContext ctx);
}