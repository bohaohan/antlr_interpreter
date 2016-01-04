package com.company;
import gen.HelloBaseListener;
import gen.HelloBaseVisitor;
import gen.HelloParser;
import org.antlr.v4.misc.OrderedHashMap;
import com.company.Variable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by bohaohan on 1/1/16.
 */
public class CMMVisitor extends HelloBaseVisitor<Variable>{
    static Map<String,String> props = new OrderedHashMap<String, String>();
    ParseTreeProperty<String> values = new ParseTreeProperty<String>();
    Map<String, Variable> memory = new HashMap<String, Variable>();
    public void setValue(ParseTree node, String value) { values.put(node, value); }
    public String getValue(ParseTree node) { return values.get(node); }

    @Override
    public Variable visitVarDecl(HelloParser.VarDeclContext ctx) {
//        System.out.println(ctx.expr().size());
        String type = ctx.getChild(0).getText();
//        System.out.println(type);
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
                value = ctx.value().getText();
            }else if  (type.equals("bool")) {
                value = ctx.value().getText();
            }
        }catch (Exception e){
            value = null;
        }
        try {
//            System.out.println(ctx.value().getChild(0).getChild(2).getText());
            if (ctx.value().getChild(0).getChild(1).getText().equals("[")) {
                if (!ctx.value().getChild(0).getChild(2).getText().equals("]")) {
                    int num = Integer.valueOf(visit(ctx.value().getChild(0).getChild(2)).getValue());
//                    System.out.println(num);
                    for (int i = 0; i < num; i++) {
                        String d = ctx.value().getChild(0).getChild(0).getText();
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
//                            System.out.println(id);
                            variable.setId(id);
                            memory.put(d + "[" + String.valueOf(i) + "]", variable);
                        } catch (Exception e) {
                            id = d + "[" + String.valueOf(i) + "]";
//                            System.out.println(id);
                            memory.put(d + "[" + String.valueOf(i) + "]", new Variable("id", type, id));
                        }
                    }
                } else {
//                    System.out.println("heyhey");
                    int num = ctx.expr().size();
                    for (int i = 0; i < num ; i++){
                        String d = ctx.value().getChild(0).getChild(0).getText();
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
//                            System.out.print(id);
//                            System.out.println(variable.getValue());
                            variable.setId(id);
                            memory.put(d + "[" + String.valueOf(i) + "]", variable);
                        } catch (Exception e) {
                            id = d + "[" + String.valueOf(i) + "]";
//                            System.out.println(id);
                            memory.put(d + "[" + String.valueOf(i) + "]", new Variable("id", type, id));
                        }
                    }

                }
            }else {
                Variable variable = new Variable();
                variable.setValue(value);
                variable.setType(type);
                variable.setVarType("id");
                variable.setId(id);
                memory.put(id, variable); // store it in our memory
            }
        } catch (Exception e){
            Variable variable = new Variable();
            variable.setValue(value);
            variable.setVarType("id");
            variable.setId(id);
            variable.setType(ctx.getChild(0).getText());
            memory.put(id, variable); // store it in our memory
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
//        System.out.println(ctx.getChildCount());
        String type = getValue(ctx.getParent());
//        System.out.println(type);
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
//                            System.out.print(id);
//                            System.out.println(variable.getValue());
                        variable.setId(id);
//                        System.out.println(id);
                        memory.put(d + "[" + String.valueOf(i) + "]", variable);
                    } catch (Exception e) {
                        id = d + "[" + String.valueOf(i) + "]";
//                        System.out.println(id);
                        memory.put(d + "[" + String.valueOf(i) + "]", new Variable("id", type, id));
                    }
                }
            } else {
                Variable variable = new Variable();
                variable.setType(type);
                variable.setVarType("id");
                variable.setId(id);
                memory.put(id, variable);
//                System.out.println(id);
            }
//            System.out.println(id);
        } else  {
            String id = visit(ctx.value()).getId();
            if (visit(ctx.value()).getVarType() != null && visit(ctx.value()).getVarType().equals("array")) {
//                System.out.println(visit(ctx.value()).getVarType());
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
//                            System.out.print(id);
//                            System.out.println(variable.getValue());
                        variable.setId(id);
//                        System.out.println(id);
//                        System.out.println(variable.getValue());
                        memory.put(d + "[" + String.valueOf(i) + "]", variable);
                    } catch (Exception e) {
                        id = d + "[" + String.valueOf(i) + "]";
//                        System.out.println(id);
                        memory.put(d + "[" + String.valueOf(i) + "]", new Variable("id", type, id));
                    }
                }
            } else {
                Variable variable = new Variable();
                variable.setType(type);
                variable.setVarType("id");
                variable.setId(id);
                variable.setValue(visit(ctx.expr(0)).getValue());
//                System.out.println(variable.getId());
                memory.put(id, variable);
//                System.out.println(variable.getValue());
            }
        }
        return visitChildren(ctx);
    }
    @Override
    public Variable visitAssignStmt(HelloParser.AssignStmtContext ctx) {

//        String id = ctx.value(0).getText(); // id is left-hand side of '='
        String id = visit(ctx.value()).getId();
        if (!memory.containsKey(id)){
            System.out.println("ID not defined " + id);
            return null;
        }
//        id = String.valueOf(Double.valueOf(id).intValue());
        Variable value = visit(ctx.expr()); // compute value of expression on right
        Variable a = memory.get(id);
//        System.out.println(value.getValue());
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
//        a.setType(value.getType());
//        a.setVarType(value.getVarType());
        a.setId(id);

        if (!memory.containsKey(id)) System.out.println("ID not defined " + id);
        else memory.put(id, a);

        return a;
    }
    @Override
    public Variable visitArrayValue(HelloParser.ArrayValueContext ctx) {
        String varType = "array";
        Variable var = new Variable();
        var.setVarType(varType);
        String subId = ctx.getChild(0).getText();
        String id = "";
//        System.out.println(ctx.getChildCount());
        if (ctx.getChildCount()>3) {
            String value = visit(ctx.expr()).getValue();
            int va = Double.valueOf(value).intValue();
            if (va < 0) {
                System.out.println("Out of boundry");
            }
            value = String.valueOf(va);
            id = subId + "[" + value + "]";
        } else {
            id = subId;
        }
        var.setId(id);
//        System.out.println(id);
        return var;
    }
    @Override
    public Variable visitValAV(HelloParser.ValAVContext ctx) {
        Variable var = new Variable();
        Variable result = visit(ctx.arrayValue());
        var.setId(result.getId());
        var.setVarType(result.getVarType());
//        System.out.println(var.getId());
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
//        System.out.println(id);
        if ( memory.containsKey(id) ) {
            return memory.get(id);
        }
        return null;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Variable visitMulDiv(HelloParser.MulDivContext ctx) {
        String resultm = new String(), resultd = new String();
        Variable var = new Variable();
        if (visit(ctx.expr(0)).getType().equals("double") || visit(ctx.expr(1)).getType().equals("double")
                || visit(ctx.expr(1)).getType().equals("real")|| visit(ctx.expr(1)).getType().equals("real")) {
            Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
            Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
            resultm = String.valueOf(left * right);
            resultd = String.valueOf(left / right);
            var.setType("double");
        } else if (visit(ctx.expr(0)).getType().equals("int") && visit(ctx.expr(1)).getType().equals("int")) {
            Double left = Double.valueOf(visit(ctx.expr(0)).getValue()); // get value of left subexpression
            Double right = Double.valueOf(visit(ctx.expr(1)).getValue()); // get value of right subexpression
            Integer lt = left.intValue();
            Integer rt = right.intValue();
            resultm = String.valueOf(lt * rt);
            resultd = String.valueOf(lt / rt);
            var.setType("int");
        }
//        System.out.println(resultm + resultd);

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
        if (visit(ctx.expr(0)).getType().equals("double") || visit(ctx.expr(1)).getType().equals("double")
                || visit(ctx.expr(1)).getType().equals("real")|| visit(ctx.expr(1)).getType().equals("real")) {
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
        }
//        System.out.println(resultm + resulta);
//        System.out.println(left);
//        System.out.println(right);
//        result = left + right;
        if ( ctx.op.getText().equals("+")) {
            var.setValue(String.valueOf(resulta));
            var.setVarType("const");
            return var;
        }
        var.setValue(String.valueOf(resultm));
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
        if (ctx.expr().size() == 1){
            Variable result = visit(ctx.expr(0));
//            System.out.println(result.getType());
//            System.out.println(Double.valueOf(result.getValue()).intValue());
            if ((result.getType().equals("double") || result.getType().equals("real")
                    || result.getType().equals("int"))
                    && Double.valueOf(result.getValue()).intValue() != 0){
                bool.setValue("true");
            } else if (result.getType() != null && (result.getType().equals("char")
                    || result.getType().equals("bool")) && !result.getValue().equals("false")){
                bool.setValue("true");
            } else bool.setValue("false");
        } else {
//            System.out.println(ctx.expr(0).getText());
            Variable left = visit(ctx.expr(0));
            String lt = left.getType();
//            System.out.println(left.getType());
            Variable right = visit(ctx.expr(1));
            String rt = right.getType();
            String type = "";
//            if (!lt.equals(rt)){
//                System.out.println("Can not compare d t");
//            }
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
                    System.out.println(lv);
                    System.out.println(rv);
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
            }
        }

        return bool;
    }
    @Override
    public Variable visitIfStmt(HelloParser.IfStmtContext ctx) {
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

        return new Variable();
    }
    @Override
    public Variable visitWhileStmt(HelloParser.WhileStmtContext ctx) {
        Variable var = visit(ctx.compare());
        while (var.getValue().equals("true")){
            visit(ctx.stmtBlock());
            var = visit(ctx.compare());
        }
        return new Variable();
    }
    @Override
    public Variable visitForStmt(HelloParser.ForStmtContext ctx) {
        visit(ctx.varDecl());
        Variable var = visit(ctx.compare());
        while (var.getValue().equals("true")){
            visit(ctx.stmtBlock());
            visit(ctx.assignStmt(0));
            var = visit(ctx.compare());
        }
        return new Variable();
    }

    public Variable visitWriteStmt(HelloParser.WriteStmtContext ctx) {
        Variable var = visit(ctx.getChild(2));

//        System.out.print(var.getVarType());
        if(var.getVarType()!= null && var.getVarType().equals("const")) {
            System.out.println(var.getValue());
        } else {
            System.out.print(var.getId());
            System.out.print(": ");
            System.out.println(memory.get(var.getId()).getValue());
        }
        return visitChildren(ctx);
    }
    @Override
    public Variable visitReadStmt(HelloParser.ReadStmtContext ctx) {
        Scanner sc=new Scanner(System.in);
        String t = sc.next();
        Variable var = visit(ctx.getChild(2));
//        var.setValue(t);
//        System.out.println(var.getId());
        if (var.getType() != null) {
            if (var.getType().equals("double")) {
                var.setValue(String.valueOf(Double.valueOf(t)));
            } else if(var.getType().equals("int")) {
                var.setValue(String.valueOf(Double.valueOf(t).intValue()));
            } else if(var.getType().equals("char")) {
                var.setValue(t);
            } else if(var.getType().equals("bool")) {
                var.setValue(t);
            } else {
                var.setValue(String.valueOf(Double.valueOf(t)));
            }
        }
//        System.out.println(var.getId());
        memory.put(var.getId(),var);
        return visitChildren(ctx);
    }
}
