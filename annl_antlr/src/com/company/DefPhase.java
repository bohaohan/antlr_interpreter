package com.company;

import gen.HelloBaseListener;
import gen.HelloParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by qm on 16/1/2.
 */
public class DefPhase extends HelloBaseListener {

    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    //判断类型是否合法
    void defineVar(HelloParser.VarDeclContext ctx) {
        Symbol.Type type;
        if (ctx.value().getText().contains("[")) {
            switch (ctx.start.getText()) {
                case "real":
                    type =  Symbol.Type.REAL_LIST;
                case "char":
                    type =  Symbol.Type.CHAR_LIST;
                case "bool":
                    type =  Symbol.Type.BOOL_LIST;
                case "double":
                    type =  Symbol.Type.DOUBLE_LIST;
                case "int":
                    type =  Symbol.Type.INT_LIST;
                default:
                    type =  Symbol.Type.INVALID;
            }
        } else {
            switch (ctx.start.getText()) {
                case "real":
                    type =  Symbol.Type.REAL;
                case "char":
                    type =  Symbol.Type.CHAR;
                case "bool":
                    type =  Symbol.Type.BOOL;
                case "double":
                    type =  Symbol.Type.DOUBLE;
                case "int":
                    type =  Symbol.Type.INT;
                default:
                    type =  Symbol.Type.INVALID;
            }
        }
        VariableSymbol var = new VariableSymbol(ctx.value().getText(), type);
        if (ctx.Equal() != null) {
            //有完成赋值的
        } else {

        }
        currentScope.define(var);
    }

    public void exitVarDecl(HelloParser.VarDeclContext ctx) {
        defineVar(ctx);
    }

    public void exitListVar(HelloParser.ListVarContext ctx) {

    }

    public void enterProgram(HelloParser.ProgramContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
//        System.out.println(globals);
    }

    public void exitProgram(HelloParser.ProgramContext ctx) {
//        System.out.println(globals);
    }

    public void enterStmtBlock(HelloParser.StmtBlockContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitStmtBlock(HelloParser.StmtBlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

//    public void enterIfStmt(HelloParser.IfStmtContext ctx) {
//        currentScope = new LocalScope(currentScope);
//        saveScope(ctx, currentScope);
//    }
//
//    public  void exitIfStmt(HelloParser.IfStmtContext ctx) {
//        System.out.println(currentScope);
//        currentScope = currentScope.getEnclosingScope();
//    }

    public void enterWhileStmt(HelloParser.WhileStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitWhileStmt(HelloParser.WhileStmtContext ctx) {
//        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterForStmt(HelloParser.ForStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitForStmt(HelloParser.ForStmtContext ctx) {
//        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }


//    public void enterValAV(HelloParser.ValAVContext ctx) {
//
//    }
//
//    public void enterArrayValue(HelloParser.ArrayValueContext ctx) {
//
//    }


}
