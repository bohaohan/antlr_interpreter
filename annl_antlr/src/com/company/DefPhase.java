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
    ParseTreeProperty<Symbol.Type> types = new ParseTreeProperty<>();
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

//    expr: expr op=('*'|'/') expr # MulDiv
//    | expr op=('+'|'-') expr # AddSub
//    | ('-')?INT # int
//    | ('-')?DOUBLE # double
//    | CHAR #char
//    | value # ex\\\\\\\\\\
//
// pValue
//    | '(' expr ')' # parens

//    varDecl : Type (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))? Semi;
//    listVar : Type sub_var (Comma sub_var)+ Semi;
//    sub_var : (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))?;

    public void saveType(ParserRuleContext ctx, Symbol.Type type) {
        types.put(ctx, type);
    }

    public void exitExpValue(HelloParser.ExpValueContext ctx) {
        String name = ctx.value().getText();
        if (name.contains("[")) {
            name = name.substring(0, name.indexOf("["));
        }
        Symbol.Type type;
        Symbol var = currentScope.resolve(name);
        if (var != null) {
            switch (var.type) {
                case BOOL_LIST:
                    type = Symbol.Type.BOOL;
                    break;
                case CHAR_LIST:
                    type = Symbol.Type.CHAR;
                    break;
                case DOUBLE_LIST:
                    type = Symbol.Type.DOUBLE;
                    break;
                case REAL_LIST:
                    type = Symbol.Type.REAL;
                    break;
                case INT_LIST:
                    type = Symbol.Type.INT;
                    break;
                case INVALID:
                    type = Symbol.Type.INVALID;
                    break;
                default:
                    type = var.type;
                    break;
            }
            saveType(ctx, type);
        }
    }

    public void exitAddSub(HelloParser.AddSubContext ctx) {
        if (ctx.expr(0) != null && ctx.expr(1) != null) {
            if (types.get(ctx.expr(0)) != null && types.get(ctx.expr(1)) != null) {
                if (types.get(ctx.expr(0)) != types.get(ctx.expr(1))) {
                    saveType(ctx, Symbol.Type.INVALID);
                } else {
                    saveType(ctx, types.get(ctx.expr(0)));
                }
            } else {
                saveType(ctx, Symbol.Type.INVALID);
            }
        } else {
            saveType(ctx, Symbol.Type.INVALID);
        }
    }

    public void exitMulDiv(HelloParser.MulDivContext ctx) {
        if (ctx.expr(0) != null && ctx.expr(1) != null) {
            if (types.get(ctx.expr(0)) != null && types.get(ctx.expr(1)) != null) {
                if (types.get(ctx.expr(0)) != types.get(ctx.expr(1))) {
                    saveType(ctx, Symbol.Type.INVALID);
                } else {
                    saveType(ctx, types.get(ctx.expr(0)));
                }
            } else {
                saveType(ctx, Symbol.Type.INVALID);
            }
        } else {
            saveType(ctx, Symbol.Type.INVALID);
        }
    }

    public void exitInt(HelloParser.IntContext ctx) {
        types.put(ctx, Symbol.Type.INT);
    }

    public void exitChar(HelloParser.CharContext ctx) {
        types.put(ctx, Symbol.Type.CHAR);
    }

    public void exitDouble(HelloParser.DoubleContext ctx) {
        types.put(ctx, Symbol.Type.DOUBLE);
    }

    public void exitParens(HelloParser.ParensContext ctx) {
        if (ctx.expr()!=null) {
            if (types.get(ctx.expr()) != null) {
                saveType(ctx, types.get(ctx.expr()));
            } else {
                saveType(ctx, Symbol.Type.INVALID);
            }
        } else {
            saveType(ctx, Symbol.Type.INVALID);
        }
    }


}
