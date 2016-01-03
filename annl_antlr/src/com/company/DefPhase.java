package com.company;

import gen.HelloBaseListener;
import gen.HelloParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;

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

    public void exitVarDecl(HelloParser.VarDeclContext ctx) {
        Symbol.Type type;
        VariableSymbol var;
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
            var = new VariableSymbol(ctx.value().getText(), type);
            var.name = var.name.substring(0, var.name.indexOf("["));
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
            var = new VariableSymbol(ctx.value().getText(), type);
        }

        currentScope.define(var);
    }

    public void exitListVar(HelloParser.ListVarContext ctx) {
        Symbol.Type type;
        List varList = ctx.sub_var();
        VariableSymbol var;
        for (int i=0; i<varList.size(); i++) {
            if (((HelloParser.Sub_varContext)varList.get(i)).value().getText().contains("[")) {
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
                var = new VariableSymbol(((HelloParser.Sub_varContext)varList.get(i)).value().getText(), type);
                var.name = var.name.substring(0, var.name.indexOf("["));
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
                var = new VariableSymbol(((HelloParser.Sub_varContext)varList.get(i)).value().getText(), type);
            }
            currentScope.define(var);
        }
    }

    public void enterProgram(HelloParser.ProgramContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    public void exitProgram(HelloParser.ProgramContext ctx) {
        System.out.println(globals);
    }

    public void enterStmtBlock(HelloParser.StmtBlockContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitStmtBlock(HelloParser.StmtBlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        System.out.println(currentScope);
    }


    public void enterWhileStmt(HelloParser.WhileStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitWhileStmt(HelloParser.WhileStmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        System.out.println(currentScope);
    }

    public void enterForStmt(HelloParser.ForStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitForStmt(HelloParser.ForStmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        System.out.println(currentScope);

    }


}
