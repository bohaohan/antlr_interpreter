package com.company;
import gen.HelloBaseListener;
import gen.HelloBaseVisitor;
import gen.HelloParser;
import org.antlr.v4.misc.OrderedHashMap;
import com.company.Variable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.xml.soap.Text;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by bohaohan on 1/1/16.
 */
public class CMMVisitor extends HelloBaseVisitor<Variable>{
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;
    boolean hasError = false;
    static WaitInput wi = new WaitInput();
    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    ParseTreeProperty<String> values = new ParseTreeProperty<String>();


    public void setValue(ParseTree node, String value) { values.put(node, value); }
    public String getValue(ParseTree node) { return values.get(node); }


    @Override
    public Variable visitProgram(HelloParser.ProgramContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
        return visitChildren(ctx);
    }


    @Override
    public Variable visitVarDecl(HelloParser.VarDeclContext ctx) {
        String type = ctx.getChild(0).getText();
        String id = visit(ctx.value()).getId(); // id is left-hand side of '='

        String value = null;
        try {
            Variable result = visit(ctx.expr(0)); // compute value of expression on right
            value = result.getValue();
            if (type.equals("double")){
                value = String.valueOf(Double.valueOf(result.getValue()));
            } else if  (type.equals("int")) {
                value = String.valueOf(Double.valueOf(result.getValue()).intValue());
            }else if  (type.equals("real")) {
                value = String.valueOf(Double.valueOf(result.getValue()));
            }else if  (type.equals("char")) {
                value = ctx.expr(0).getText();
            }else if  (type.equals("bool")) {
                value = ctx.expr(0).getText();
            }
        }catch (Exception e){
            value = null;
        }
        try {
            String d = ctx.value().getChild(0).getChild(0).getText();
            if (ctx.value().getChild(0).getChild(1).getText().equals("[")) {
                if (!ctx.value().getChild(0).getChild(2).getText().equals("]")) {
                    int num = Integer.valueOf(visit(ctx.value().getChild(0).getChild(2)).getValue());
                    currentScope.define(new Variable(String.valueOf(num), "arrayp", d));

                    for (int i = 0; i < num; i++) {
                        try {
                            Variable variable = new Variable();
                            if (type.equals("double")){
                                Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                                String cT = visit(ctx.expr(i)).getType();
                                if (!cT.equals("double") && !cT.equals("int")){

                                } else {
                                    variable.setValue(String.valueOf(dd));
                                }
                            } else if  (type.equals("int")) {
                                Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                                Integer in = dd.intValue();
                                variable.setValue(String.valueOf(in));
                            }else if  (type.equals("real")) {
                                Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                                Integer in = dd.intValue();
                                variable.setValue(String.valueOf(in));
                            }else if  (type.equals("char")) {
                                String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                                variable.setValue(String.valueOf(dd));
                            }else if  (type.equals("bool")) {
                                String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                                variable.setValue(String.valueOf(dd));
                            }
                            variable.setType(type);
                            variable.setVarType("id");
                            id = d + "[" + String.valueOf(i) + "]";
                            variable.setId(id);
                            currentScope.define(variable);
                        } catch (Exception e) {
                            id = d + "[" + String.valueOf(i) + "]";
                            currentScope.define(new Variable("id", type, id));
                        }
                    }
                } else {
                    int num = ctx.expr().size();
                    currentScope.define(new Variable(String.valueOf(num), "arrayp", d));
                    for (int i = 0; i < num ; i++){
                        try {
                            Variable variable = new Variable();
                            if (type.equals("double")){
                                Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());

                                variable.setValue(String.valueOf(dd));
                            } else if  (type.equals("int")) {
                                Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                                Integer in = dd.intValue();
                                variable.setValue(String.valueOf(in));
                            }else if  (type.equals("real")) {
                                Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                                Integer in = dd.intValue();
                                variable.setValue(String.valueOf(in));
                            }else if  (type.equals("char")) {
                                String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                                //                            Integer in = dd.intValue();
                                variable.setValue(String.valueOf(dd));
                            }else if  (type.equals("bool")) {
                                String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                                variable.setValue(String.valueOf(dd));
                            }
                            variable.setType(type);
                            variable.setVarType("id");
                            id = d + "[" + String.valueOf(i) + "]";
                            variable.setId(id);
                            currentScope.define(variable);
                        } catch (Exception e) {
                            id = d + "[" + String.valueOf(i) + "]";
                            currentScope.define(new Variable("id", type, id));
                        }
                    }

                }
            }else {
                Variable variable = new Variable();
                variable.setValue(value);
                variable.setType(type);
                variable.setVarType("id");
                variable.setId(id);
                currentScope.define(variable);
            }
        } catch (Exception e){
            Variable variable = new Variable();
            variable.setValue(value);
            variable.setVarType("id");
            variable.setId(id);
            variable.setType(ctx.getChild(0).getText());
            currentScope.define(variable);
        }
        Variable a = new Variable();
        a.setValue(value);
        a.setType(ctx.getChild(0).getText());
        a.setVarType("id");
        a.setId(id);
        return a;
    }


    @Override
    public Variable visitListVar(HelloParser.ListVarContext ctx) {
        String type = ctx.getChild(0).getText();
        setValue(ctx, type);
        return visitChildren(ctx);
    }


    @Override public Variable visitSub_var(HelloParser.Sub_varContext ctx) {
        String type = getValue(ctx.getParent());
        Variable var = new Variable();
        if (ctx.getChildCount() == 1){
            String id = visit(ctx.value()).getId();
            if (visit(ctx.value()).getVarType() != null && visit(ctx.value()).getVarType().equals("array")) {
                String d = ctx.value().getChild(0).getChild(0).getText();
                Integer num = Double.valueOf(ctx.value().getChild(0).getChild(2).getText()).intValue();
                for (int i = 0; i < num ; i++){
                    try {
                        Variable variable = new Variable();
                        if (type.equals("double")){
                            Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                            variable.setValue(String.valueOf(dd));
                        } else if  (type.equals("int")) {
                            Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                            Integer in = dd.intValue();
                            variable.setValue(String.valueOf(in));
                        }else if  (type.equals("real")) {
                            Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                            Integer in = dd.intValue();
                            variable.setValue(String.valueOf(in));
                        }else if  (type.equals("char")) {
                            String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                            //                            Integer in = dd.intValue();
                            variable.setValue(String.valueOf(dd));
                        }else if  (type.equals("bool")) {
                            String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                            variable.setValue(String.valueOf(dd));
                        }
                        variable.setType(type);
                        variable.setVarType("id");
                        id = d + "[" + String.valueOf(i) + "]";
                        variable.setId(id);
                        currentScope.define(variable);
                    } catch (Exception e) {
                        id = d + "[" + String.valueOf(i) + "]";
                        currentScope.define(new Variable("id", type, id));
                    }
                }
            } else {
                Variable variable = new Variable();
                variable.setType(type);
                variable.setVarType("id");
                variable.setId(id);
                currentScope.define(variable);
            }
        } else  {
            String id = visit(ctx.value()).getId();
            if (visit(ctx.value()).getVarType() != null && visit(ctx.value()).getVarType().equals("array")) {
                String d = ctx.value().getChild(0).getChild(0).getText();
                Integer num = Double.valueOf(ctx.value().getChild(0).getChild(2).getText()).intValue();
                for (int i = 0; i < num ; i++) {
                    try {
                        Variable variable = new Variable();
                        if (type.equals("double")) {
                            Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                            variable.setValue(String.valueOf(dd));
                        } else if (type.equals("int")) {
                            Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                            Integer in = dd.intValue();
                            variable.setValue(String.valueOf(in));
                        } else if (type.equals("real")) {
                            Double dd = Double.valueOf(visit(ctx.expr(i)).getValue());
                            Integer in = dd.intValue();
                            variable.setValue(String.valueOf(in));
                        } else if (type.equals("char")) {
                            String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                            //                            Integer in = dd.intValue();
                            variable.setValue(String.valueOf(dd));
                        } else if (type.equals("bool")) {
                            String dd = String.valueOf(visit(ctx.expr(i)).getValue());
                            variable.setValue(String.valueOf(dd));
                        }
                        variable.setType(type);
                        variable.setVarType("id");
                        id = d + "[" + String.valueOf(i) + "]";
                        variable.setId(id);
                        currentScope.define(variable);
                    } catch (Exception e) {
                        id = d + "[" + String.valueOf(i) + "]";
                        currentScope.define(new Variable("id", type, id));
                    }
                }
            } else {
                Variable variable = new Variable();
                variable.setType(type);
                variable.setVarType("id");
                variable.setId(id);
                variable.setValue(visit(ctx.expr(0)).getValue());
                currentScope.define(variable);
            }
        }
        return visitChildren(ctx);
    }
    @Override
    public Variable visitAssignStmt(HelloParser.AssignStmtContext ctx) {

        String id = visit(ctx.value()).getId();
        if (!hasError && currentScope.resolve(id) == null){
            hasError = true;
            logError("Variable " + id + " does not exit! " + ctx.getText());
            return null;
        }
        Variable value = visit(ctx.expr()); // compute value of expression on right
        Variable a = (Variable) currentScope.resolve(id);
        if (!hasError) {
            try {
                if (a.getType() != null) {
                    if (a.getType().equals("double")) {
                        a.setValue(String.valueOf(Double.valueOf(value.getValue())));
                    } else if (a.getType().equals("int")) {
                        a.setValue(String.valueOf(Double.valueOf(value.getValue()).intValue()));
                    } else if (a.getType().equals("char")) {
                        a.setValue(value.getValue());
                    } else if (a.getType().equals("bool")) {
                        a.setValue(value.getValue());
                    } else {
                        a.setValue(String.valueOf(Double.valueOf(value.getValue())));
                    }
                }
            } catch (Exception e) {
                System.out.println("Unknown value");
            }
            a.setId(id);
        }
        return a;
    }
    @Override
    public Variable visitArrayValue(HelloParser.ArrayValueContext ctx) {
        String varType = "array";
        Variable var = new Variable();
        if (!hasError){
            var.setVarType(varType);
            String subId = ctx.getChild(0).getText();
            String id = "";
    //        System.out.println(subId);
            Variable arr = (Variable) currentScope.resolve(subId);
    //        System.out.println(subId);

    //        if (arr == null) {
    //            hasError = true;
    //            logError("Variable"+ subId +" out of boundry! " + ctx.getText());
    //        }
    //        int length = Integer.parseInt(arr.getVarType());
    //        System.out.println(ctx.getChildCount());
            if (ctx.getChildCount()>3) {
                String value = visit(ctx.expr()).getValue();
                int va = Double.valueOf(value).intValue();
                if (arr != null && arr.getType().equals("arrayp")){
                    int length = Integer.parseInt(arr.getVarType());
                    if (va > length -1){
                        hasError = true;
//                        logError("Array Index out of boundry! " + ctx.getText());
                        CheckSymbol.error(ctx.start, "Array Index out of boundry! " + ctx.getText());
                        return null;
                    }
                }
                if (va < 0) {
                    hasError = true;
//                    logError("Array Index out of boundry! " + ctx.getText());
                    CheckSymbol.error(ctx.start, "Array Index out of boundry! " + ctx.getText());
                    return null;
                }
                value = String.valueOf(va);
                id = subId + "[" + value + "]";
            } else {
                id = subId;
            }
            var.setId(id);
        }
        return var;
    }
    @Override
    public Variable visitValAV(HelloParser.ValAVContext ctx) {
        Variable var = new Variable();
        Variable result = visit(ctx.arrayValue());
        if(!hasError) {
            var.setId(result.getId());
            var.setVarType(result.getVarType());
        }
        return var;
    }
    @Override
    public Variable visitValID(HelloParser.ValIDContext ctx) {
        Variable var = new Variable();
        var.setId(ctx.getText());
        return var;
    }
    /** Double */
    @Override
    public Variable visitDouble(HelloParser.DoubleContext ctx) {
        Variable var = new Variable();
        String result;
        if (ctx.getChild(0).getText().equals("-")){
            result =  String.valueOf(-1 * Double.valueOf(ctx.DOUBLE().getText()));
            var.setValue(result);
            var.setType("double");
            var.setVarType("const");
            return var;
        }
        result = String.valueOf(ctx.DOUBLE().getText());
        var.setValue(result);
        var.setType("double");
        var.setVarType("const");
        return var;
    }
    /** int */
    @Override
    public Variable visitInt(HelloParser.IntContext ctx) {
        Variable var = new Variable();
        String result;
        if (ctx.getChild(0).getText().equals("-")){
            result =  String.valueOf(-1 * Double.valueOf(ctx.INT().getText()));
            var.setValue(result);
            var.setType("int");
            var.setVarType("const");
            return var;
        }
        result = String.valueOf(ctx.INT().getText());
        var.setValue(result);
        var.setType("int");
        var.setVarType("const");
        return var;
    }

    @Override
    public Variable visitExpBool(HelloParser.ExpBoolContext ctx) {
        Variable var = new Variable();
        String result;
        result = String.valueOf(ctx.bool().getText());
//        System.out.println(result);
        var.setValue(result);
        var.setType("bool");
        var.setVarType("const");
        return var;
    }
    @Override
    public Variable visitChar(HelloParser.CharContext ctx) {
        Variable var = new Variable();
        String result;
        if (ctx.getChild(0).getText().equals("-")){
            result =  String.valueOf(-1 * Double.valueOf(ctx.CHAR().getText()));
            var.setValue(result);
            var.setType("char");
            var.setVarType("const");
            return var;
        }
        result = String.valueOf(ctx.CHAR().getText());
        var.setValue(result);
        var.setType("char");
        var.setVarType("const");
        return var;
    }
    /** value */
    @Override
    public Variable visitExpValue(HelloParser.ExpValueContext ctx) {
        String id = visit(ctx.value()).getId();
        if (!hasError){
            if (currentScope.resolve(id) != null) {
                return (Variable)currentScope.resolve(id);
            } else {
                hasError = true;
                CheckSymbol.error(ctx.start, "Variable " + id + " does not exist! " + ctx.getParent().getText());
            }
        }
        return null;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Variable visitMulDiv(HelloParser.MulDivContext ctx) {
        String resultm = "", resultd = new String();
        Variable var = new Variable();
        String lType = visit(ctx.expr(0)).getType();
        String rType = visit(ctx.expr(1)).getType();
        if ((!hasError) && (lType.equals(rType) && lType.equals("double"))
                || (lType.equals("int") && rType.equals("double"))
                || (rType.equals("int") && lType.equals("double"))) {
            Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
            Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
            resultm = String.valueOf(left * right);
            if (right.equals(0.0) || (rType.equals("int") && right.intValue() == 0)){
                hasError = true;
                CheckSymbol.error(ctx.start, "Can not divide by 0! " + ctx.getParent().getText());
                resultd = null;
            }else {
                resultd = String.valueOf(left / right);
            }
            var.setType("double");
        } else if ((!hasError) && visit(ctx.expr(0)).getType().equals("int") && visit(ctx.expr(1)).getType().equals("int")) {
            Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
            Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
            Integer lt = left.intValue();
            Integer rt = right.intValue();
            resultm = String.valueOf(lt * rt);
            if (rt.equals(0)) {
                hasError = true;
                CheckSymbol.error(ctx.start, "Can not divide by 0! " + ctx.getParent().getText());
                resultd = null;
            }else {
                resultd = String.valueOf(lt / rt);
            }
            var.setType("int");
        } else {
            hasError = true;
            CheckSymbol.error(ctx.start, "Can not divide " + lType + " with " + rType);
        }
        if ( ctx.op.getText().equals("*") ){
            var.setVarType("const");
            var.setValue(String.valueOf(resultm));
            return var;
        }
        var.setVarType("const");
        var.setValue(String.valueOf(resultd));
        return var; // must be DIV
    }
    /** expr op=('+'|'-') expr */
    @Override
    public Variable visitAddSub(HelloParser.AddSubContext ctx) {
        String resulta = new String(), resultm = new String();
        Variable var = new Variable();
        if (!hasError){
            String typeL = visit(ctx.expr(0)).getType();
            String typeR = visit(ctx.expr(1)).getType();
            if ((visit(ctx.expr(0)).getType().equals("double") && visit(ctx.expr(1)).getType().equals("double"))
                    || (typeL.equals("int") && typeR.equals("double"))
                    || (typeR.equals("int") && typeL.equals("double")) ) {
                Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
                Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
                resultm = String.valueOf(left - right);
                resulta = String.valueOf(left + right);
                var.setType("double");
            } else if (visit(ctx.expr(0)).getType().equals("int") && visit(ctx.expr(1)).getType().equals("int")) {
                Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
                Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
                Integer lt = left.intValue();
                Integer rt = right.intValue();
                resultm = String.valueOf(lt - rt);
                resulta = String.valueOf(lt + rt);
                var.setType("int");
            } else if ((typeL.equals("double") && typeR.equals("int")) || (typeR.equals("double") && typeL.equals("int"))){
                Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
                Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
                resultm = String.valueOf(left - right);
                resulta = String.valueOf(left + right);
                var.setType("double");
            }else {
                if ((visit(ctx.expr(0)).getType() != null &&  visit(ctx.expr(0)).getType().equals("char"))
                        ||(visit(ctx.expr(1)).getType() != null &&  visit(ctx.expr(1)).getType().equals("char")) ) {
                    hasError = true;
                    CheckSymbol.error(ctx.expr(0).start, "Can not add char! " + ctx.getParent().getText());
                }
                if ((visit(ctx.expr(0)).getType() != null &&  visit(ctx.expr(0)).getType().equals("bool"))
                        ||(visit(ctx.expr(1)).getType() != null &&  visit(ctx.expr(1)).getType().equals("char")) ) {
                    hasError = true;
                    CheckSymbol.error(ctx.expr(0).start, "Can not add char! " + ctx.getParent().getText());
                }
            }
            if ( ctx.op.getText().equals("+")) {
                var.setValue(String.valueOf(resulta));
                var.setVarType("const");
                return var;
            }
            var.setValue(String.valueOf(resultm));
        }
        var.setVarType("const");
        return var;// must be SUB
    }
    /** '(' expr ')' */
    @Override
    public Variable visitParens(HelloParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    @Override
    public Variable visitCompare(HelloParser.CompareContext ctx) {
//        System.out.println(ctx.expr().size());
        Variable bool = new Variable();
        bool.setVarType("const");
        bool.setType("bool");
        if (!hasError && ctx.expr().size() == 1){
            Variable result = visit(ctx.expr(0));
            if (result.getType() != null &&(result.getType().equals("double") || result.getType().equals("real"))
                    && !Double.valueOf(result.getValue()).equals(0)){
                bool.setValue("true");
            }else if (result.getType() != null &&result.getType().equals("int")&& Double.valueOf(result.getValue()).intValue() != 0){
                bool.setValue("true");
            } else if (result.getType() != null && (result.getType().equals("char")
                    || result.getType().equals("bool")) && !result.getValue().equals("false")){
                bool.setValue("true");
            } else bool.setValue("false");
        } else if (!hasError) {
//            System.out.println(ctx.expr(0).getText());
            Variable left = visit(ctx.expr(0));
            String lt = left.getType();
//            System.out.println(left.getType());
            Variable right = visit(ctx.expr(1));
            String rt = right.getType();
            String type = "";
            if ((lt.equals("int")&&lt.equals(rt))){
                type = "int";
            }else if (lt.equals(rt) && lt.equals("double")) {
                type = "double";
            }else if (lt.equals(rt) && lt.equals("real")) {
                type = "real";
            }else if (lt.equals(rt) && lt.equals("char")) {
                type = "char";
            }else if ((lt.equals("int")&&rt.equals("double"))
                    ||(lt.equals("double")&&rt.equals("int"))) {
                type = "double";
            }
            boolean result = false;
//            System.out.println(right.getValue());
            if(ctx.Relation().getText().equals(">")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = li > ri;
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv > rv;
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv > rv;
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = lv.charAt(0) > rv.charAt(0);
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            } else if(ctx.Relation().getText().equals("<")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = li < ri;
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv < rv;
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv < rv;
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = lv.charAt(0) < rv.charAt(0);
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            } else if(ctx.Relation().getText().equals("<=")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = li <= ri;
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv <= rv;
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv <= rv;
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = lv.charAt(0) <= rv.charAt(0);
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            }else if(ctx.Relation().getText().equals(">=")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = li >= ri;
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv >= rv;
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv >= rv;
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = lv.charAt(0) >= rv.charAt(0);
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            }else if(ctx.Relation().getText().equals("==")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = li.equals(ri);
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv.equals(rv);
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = lv.equals(rv);
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = lv.charAt(0) == rv.charAt(0);
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            }else if(ctx.Relation().getText().equals("!=")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = !li.equals(ri);
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = !lv.equals(rv);
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = !lv.equals(rv);
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = !(lv.charAt(0) == rv.charAt(0));
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            }else if(ctx.Relation().getText().equals("<>")){
                if(type.equals("int")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    Integer li = lv.intValue();
                    Integer ri = rv.intValue();
                    result = !li.equals(ri);
                } else if (type.equals("double")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = !lv.equals(rv);
                } else if (type.equals("real")){
                    Double lv = Double.valueOf(left.getValue());
                    Double rv = Double.valueOf(right.getValue());
                    result = !lv.equals(rv);
                } else if (type.equals("char")){
                    String lv = String.valueOf(left.getValue());
                    String rv = String.valueOf(right.getValue());
                    result = !(lv.charAt(0) == rv.charAt(0));
                }
                if (result) bool.setValue("true");
                else bool.setValue("false");
            } else {

            }
        }
        return bool;
    }


    @Override
    public Variable visitIfStmt(HelloParser.IfStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);

        int num_c = ctx.compare().size();
        boolean f = false;
        for (int i = 0; i < num_c; i++){
            Variable bool = visit(ctx.compare(i));
//            System.out.println(bool.getValue());
            if (bool.getValue().equals("true")) {
                visit(ctx.stmtBlock(i));
                f = true;
                break;
            }
        }
        if (!f){
            if (ctx.stmtBlock().size() > num_c) {
                visit(ctx.stmtBlock(num_c));
            }
        }
        currentScope = currentScope.getEnclosingScope();
        return new Variable();
    }
    @Override
    public Variable visitWhileStmt(HelloParser.WhileStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        Variable var = visit(ctx.compare());
        while (var.getValue().equals("true")){
            visit(ctx.stmtBlock());
            var = visit(ctx.compare());
        }
        currentScope = currentScope.getEnclosingScope();
        return new Variable();
    }
    @Override
    public Variable visitForStmt(HelloParser.ForStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        visit(ctx.varDecl());
        Variable var = visit(ctx.compare());
        while (var.getValue().equals("true")){
            visit(ctx.stmtBlock());
            visit(ctx.assignStmt(0));
            var = visit(ctx.compare());
        }
        currentScope = currentScope.getEnclosingScope();
        return new Variable();
    }
    @Override
    public Variable visitStmtBlock(HelloParser.StmtBlockContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Variable visitString(HelloParser.StringContext ctx) {
        ctx.getChildCount();
        Variable var = new Variable();
        String result = ctx.getChild(0).getText();
        for (int i = 1; i < ctx.getChildCount()-1; i++){
            if (ctx.getChild(i).getText().equals("\\")) {
                result += ctx.getChild(i).getText();
            } else {
                result += ctx.getChild(i).getText() + " ";
            }
        }
        var.setType("string");
        var.setVarType("const");
        var.setValue(result);
        return var;
    }
    @Override
    public Variable visitWriteStmt(HelloParser.WriteStmtContext ctx) {
        Variable var = visit(ctx.getChild(2));
        if (!hasError){
//        System.out.print(var.getVarType());
            if (ctx.string() != null){
                TextEditorDemo te = TextEditorDemo.getInstance();
                RSyntaxTextArea ta = te.getOutputAre();
//                String s = ctx.string().getText();
                String s = visit(ctx.string()).getValue();
                s = s.substring(1, s.length()-1);
                s = s.replace("\\n", "\n");
                ta.append(s + "\n");
            }else if(var.getVarType()!= null && var.getVarType().equals("const")) {
                String s = var.getValue();
                if (var.getType() != null && var.getType().equals("char")){
                    s = s.substring(1, s.length()-1);
                }
                TextEditorDemo te = TextEditorDemo.getInstance();
                RSyntaxTextArea ta = te.getOutputAre();
                ta.append(s + "\n");

            } else {
                TextEditorDemo te = TextEditorDemo.getInstance();
                RSyntaxTextArea ta = te.getOutputAre();
                if (currentScope.resolve(var.getId())==null){
                    hasError = true;
                    logError("Variable " + var.getId() + " does not exit! " + ctx.getText());
                    return null;
                }
                String s = ((Variable)currentScope.resolve(var.getId())).getValue();
                if (var.getType() != null && var.getType().equals("char")){
                    s = s.substring(1, s.length()-1);
                }
//                System.out.print(var.getId());
//                ta.append(var.getId());
//                System.out.print(": ");
//                ta.append(": ");
    //            System.out.println(memory.get(var.getId()).getValue());
//                System.out.println(s);
                ta.append(s + "\n");
            }
        }
        return visitChildren(ctx);
    }
    public void logError(String msg) {
        TextEditorDemo te = TextEditorDemo.getInstance();
        RSyntaxTextArea ta = te.getOutputAre();
        ta.append("Error: "+msg+"\n");
        try {
            ta.addLineHighlight(ta.getLineCount() - 2, Color.RED);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
//        System.out.println(ta.getLineCount());
    }
    @Override
    public Variable visitReadStmt(HelloParser.ReadStmtContext ctx) {
//        Scanner sc=new Scanner(System.in);
//        TextEditorDemo.main.setSuspend(true);
//        try {
//            TextEditorDemo.main.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        TextEditorDemo.main.suspend();

        Variable v = visit(ctx.getChild(2));
        Variable var = (Variable) currentScope.resolve(v.getId());
        if (!hasError && var == null){
            hasError = true;
            logError("Variable " + v.getId() + " does not exit! " + ctx.getText());
        }
        JOptionPane jp = new JOptionPane();
        ImageIcon icon = new ImageIcon("img/input.png");
        jp.setIcon(icon);
        
        String msg = "Input value :";
        if (var != null && var.getId() != null) {
            msg = "Input value for " + var.getId() + " :";
        }
        String t = "";

        if (!hasError)
//            t = jp.showInputDialog(null, msg);
            t  = TextEditorDemo.ri;
//        TextEditorDemo.waitI();
//        String t = TextEditorDemo.ri;

//        String t = sc.next();

//        var.setValue(t);
//        System.out.println(var.getId());

        if (!hasError && var.getType() != null) {
            if (var.getType().equals("double")) {
                if (!isNum(t)) {
                    hasError = true;
                    CheckSymbol.error(ctx.start, "Input " + t + " must be double type! " + ctx.getText());
                }else {
                    var.setValue(String.valueOf(Double.valueOf(t)));
                }
            } else if(var.getType().equals("int")) {
                if (!isInt(t)) {
                    hasError = true;
                    CheckSymbol.error(ctx.start, "Input " + t + " must be int type! " + ctx.getText());
                }else {
                    var.setValue(String.valueOf(Double.valueOf(t).intValue()));
                }
            } else if(var.getType().equals("char")) {
                if (t.length() > 1) {
                    hasError = true;
                    CheckSymbol.error(ctx.start, "Input " + t + " must be char type! " + ctx.getText());
                }else {
                    var.setValue( "\'" + t + "\'");
                }
            } else if(var.getType().equals("bool")) {
                if (!t.equals("true") && !t.equals("false")) {
                    hasError = true;
                    CheckSymbol.error(ctx.start, "Input " + t + " must be bool type! " + ctx.getText());
                }else {
                    var.setValue(t);
                }
            } else {
                var.setValue(String.valueOf(Double.valueOf(t)));
            }
        }
        TextEditorDemo.ri = "";
        return visitChildren(ctx);
    }
    public static boolean isNum(String str){
        return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }
    public static boolean isInt(String str){
        return str.matches("^[-+]?(([0-9]+)([.]([0]+))?|([.]([0]+))?)$");
    }
}
