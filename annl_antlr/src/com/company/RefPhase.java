package com.company;

import gen.HelloBaseListener;
import gen.HelloParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Stack;

/**
 * Created by qm on 16/1/3.
 */
public class RefPhase extends HelloBaseListener{

    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;
    Stack<Symbol.Type> stack = new Stack<Symbol.Type>();

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.globals = globals;
        this.scopes = scopes;
    }

    public void enterProgram(HelloParser.ProgramContext ctx) {
        currentScope = globals;
    }

    public void enterStmtBlock(HelloParser.StmtBlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitStmtBlock(HelloParser.StmtBlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterWhileStmt(HelloParser.WhileStmtContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitWhileStmt(HelloParser.WhileStmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterForStmt(HelloParser.ForStmtContext ctx) {
        currentScope = scopes.get(ctx);
    }

    public void exitForStmt(HelloParser.ForStmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

//    expr: expr op=('*'|'/') expr # MulDiv
//    | expr op=('+'|'-') expr # AddSub
//    | ('-')?INT # int
//    | ('-')?DOUBLE # double
//    | CHAR #char
//    | value # expValue
//    | '(' expr ')' # parens

//    varDecl : Type (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))? Semi;
//    listVar : Type sub_var (Comma sub_var)+ Semi;
//    sub_var : (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))?;

    public void exitInt(HelloParser.IntContext ctx) {
        stack.push();
    }

    public void exitValAV(HelloParser.ValAVContext ctx) {
        String name = ctx.getText().substring(0, ctx.getText().indexOf("["));
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            String msg;
            if (name.contains("[")) {
                msg = name.substring(0, 1);
            } else {
                msg = name;
            }
            CheckSymbol.error(ctx.getStart(), "no such variable:" + msg);
        }
    }

    public void exitValID(HelloParser.ValIDContext ctx) {
        String name = ctx.getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CheckSymbol.error(ctx.getStart(), "no such variable:" + name);
        }
    }



}
