package com.company;

import gen.HelloBaseListener;
import gen.HelloParser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;
import java.util.Stack;

/**
 * Created by qm on 16/1/3.
 */
public class RefPhase extends HelloBaseListener{

    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;
    Stack<Symbol.Type> stack = new Stack<Symbol.Type>();
    ParseTreeProperty<Symbol.Type> types;
    boolean error = false;

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes, ParseTreeProperty<Symbol.Type> types) {
        this.globals = globals;
        this.scopes = scopes;
        this.types = types;
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

    public void exitAssignStmt(HelloParser.AssignStmtContext ctx) {
        HelloParser.ExprContext expr = ctx.expr();
        HelloParser.ValueContext value = ctx.value();
        Symbol symbol;
        String name = value.getText();
        if (name.contains("[")) {
            name = name.substring(0, name.indexOf("["));
        }
        symbol = currentScope.resolve(name);
        Symbol.Type type = types.get(expr);
        if (symbol != null && type!= null) {
            if (symbol.type != type) {
                if ((symbol.type == Symbol.Type.INT || symbol.type == Symbol.Type.DOUBLE || symbol.type == Symbol.Type.REAL)
                        && (type == Symbol.Type.DOUBLE || type ==Symbol.Type.INT || type == Symbol.Type.REAL) ) {

                } else {
                    String typeL;
                    String typeR;
                    typeL = checkType(symbol.type);
                    typeR = checkType(type);
                    error = true;
                    CheckSymbol.error(expr.start, "can not match type " + typeL + " and " + typeR);
                }
            }
        }
    }

    public String checkType(Symbol.Type type) {
        String typeName;
        switch (type) {
            case BOOL:
                typeName = "bool";
                break;
            case REAL:
                typeName = "real";
                break;
            case CHAR:
                typeName = "char";
                break;
            case INT:
                typeName = "int";
                break;
            case DOUBLE:
                typeName = "bool";
                break;
            default:
                typeName = "unknown";
                break;
        }
        return typeName;
    }

    public void exitCompare(HelloParser.CompareContext ctx) {
        HelloParser.ExprContext exprL = ctx.expr(0);
        HelloParser.ExprContext exprR;
        if (ctx.expr().size() > 1) {
            exprR = ctx.expr(1);
            if (exprL != null && exprR != null) {
                Symbol.Type typeL = types.get(exprL);
                Symbol.Type typeR = types.get(exprR);
                if (typeL == typeR && ((typeL == Symbol.Type.BOOL && typeR == Symbol.Type.BOOL) || (typeL == Symbol.Type.INT && typeR == Symbol.Type.INT))) {
                    // 类型符合
                } else {
                    error = true;
                    CheckSymbol.error(exprL.start, "variable must be bool type");
                }
            } else {
                // 表达式为空
            }
        } else {
//            System.out.println(types.get(exprL));
            if (exprL != null) {
                if (types.get(exprL) == Symbol.Type.BOOL || types.get(exprL) == Symbol.Type.INT) {
                    // 类型符合
                } else {
                    error = true;
                    CheckSymbol.error(ctx.expr(0).start, "variable must be bool type");
                }
            } else {
                //表达式为空
            }
        }
    }

    public void exitVarDecl(HelloParser.VarDeclContext ctx) {
        Symbol.Type type;
        String tag;
        if (ctx.expr() != null) {
            type = types.get(ctx.expr(0));
            if (type != null) {
                //比较类别,不同就报错
                switch (type) {
                    case BOOL:
                        tag = "bool";
                        break;
                    case REAL:
                        tag = "real";
                        break;
                    case CHAR:
                        tag = "char";
                        break;
                    case INT:
                        tag = "int";
                        break;
                    case DOUBLE:
                        tag = "bool";
                        break;
                    default:
                        tag = "unknown";
                        break;
                }
                if (!ctx.Type().getText().equals(tag)) {
                    CheckSymbol.error(ctx.expr(0).start, "can not match type " + ctx.Type().getText() + " and " + tag);
                    error = true;
                }
            } else {
                //类型未知?
            }
        }
    }

    public void exitListVar(HelloParser.ListVarContext ctx) {
        String tag;
        Symbol.Type type;
        List sub_varList = ctx.sub_var();
        if (sub_varList == null) return;
        for (int i=0; i<sub_varList.size(); i++) {
            HelloParser.Sub_varContext sub = (HelloParser.Sub_varContext) sub_varList.get(i);
            if (sub == null) continue;
            List exprList = sub.expr();
            if (exprList == null) return;
            for (int j=0; j<exprList.size(); j++) {
                HelloParser.ExprContext expr = (HelloParser.ExprContext) exprList.get(j);
                if (expr == null) continue;
                type = types.get(expr);
                if (type != null) {
                    //比较类别,不同就报错
                    switch (type) {
                        case BOOL:
                            tag = "bool";
                            break;
                        case REAL:
                            tag = "real";
                            break;
                        case CHAR:
                            tag = "char";
                            break;
                        case INT:
                            tag = "int";
                            break;
                        case DOUBLE:
                            tag = "bool";
                            break;
                        default:
                            tag = "unknown";
                            break;
                    }
                    if (!ctx.Type().getText().equals(tag)) {
                        error = true;
                        CheckSymbol.error(expr.start, "can not match type " + ctx.Type().getText() + " and " + tag);
                    }
                } else {
                    //类型未知?
                }
                tag = null;
            }
        }
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
            error = true;
        }
        HelloParser.ExprContext expr = ctx.arrayValue().expr();
        if (expr != null) {
            Symbol.Type type = types.get(expr);
            if (type != null) {
                if (type != Symbol.Type.INT) {
                    CheckSymbol.error(expr.start, "array index can only be int type");
                    error = true;
                }
            } else {
                //未知类型
            }
        }
    }

    public void exitValID(HelloParser.ValIDContext ctx) {
        String name = ctx.getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CheckSymbol.error(ctx.getStart(), "no such variable:" + name);
            error = true;
        }
    }


}
