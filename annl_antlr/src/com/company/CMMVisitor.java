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
        String id = ctx.value().getText(); // id is left-hand side of '='
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
            if (ctx.value().getChild(0).getChild(1).getText().equals("[")) {
                int num = Integer.valueOf(visit(ctx.value().getChild(0).getChild(2)).getValue());
//            System.out.println(num);
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
                        variable.setId(id);
                        memory.put(d + "[" + String.valueOf(i) + "]", variable);
                    } catch (Exception e) {
                        memory.put(d + "[" + String.valueOf(i) + "]", new Variable("id"));
                    }
                }
            }else {
                Variable variable = new Variable();
                variable.setValue(value);
                variable.setType(ctx.getChild(0).getText());
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
    public Variable visitAssignStmt(HelloParser.AssignStmtContext ctx) {
        String id = ctx.value(0).getText(); // id is left-hand side of '='
        String value = visit(ctx.expr(0)).getValue(); // compute value of expression on right
        Variable a = new Variable();
        a.setValue(value);
        if (!memory.containsKey(id)) System.out.println("ID not defined " + id);
        else memory.put(id, a);

        return a;
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
        String id = ctx.value().getText();
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
    //    @Override
//    public String visitExpr(HelloParser.ExprContext ctx) {
////        System.out.println(ctx.getChild(0).getParent().getChildCount());
////        System.out.println(ctx.getChildCount());
//
//        if(ctx.getChildCount() >= 3){
////            System.out.println(ctx.getChild(1).getText());
//            if (ctx.getChild(0).getText().equals("-")){
//                if (ctx.getChild(2).getText().equals("+") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a =-1 *  Double.valueOf(visit(ctx.eExpr())) + Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("-") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = -1 * Double.valueOf(visit(ctx.eExpr())) - Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("*") && !ctx.getChild(1).getText().equals("(")) {
////                System.out.println(ctx.eExpr().getText());
////                System.out.println(ctx.expr(0).getChildCount());
//                    Double a = -1 * Double.valueOf(visit(ctx.eExpr())) * Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("/") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = -1 * Double.valueOf(visit(ctx.eExpr())) / Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("%") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = -1 * Double.valueOf(visit(ctx.eExpr())) % Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if(ctx.getChild(1).getText().equals("(")){
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("+")) {
//                        Double a = -1 *Double.valueOf(visit(ctx.getChild(1))) + Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("-")) {
//                        Double a = -1 *Double.valueOf(visit(ctx.getChild(1))) - Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("*")) {
//                        Double a = -1 *Double.valueOf(visit(ctx.getChild(1))) * Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("/")) {
//                        Double a = -1 *Double.valueOf(visit(ctx.getChild(1))) / Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("%")) {
//                        Double a = -1 *Double.valueOf(visit(ctx.getChild(1))) % Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    Double a = -1 *Double.valueOf(visit(ctx.getChild(2)));
//                    return String.valueOf(a);
//                }
//            } else if (ctx.getChild(0).getText().equals("+")) {
//                if (ctx.getChild(2).getText().equals("+") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = Double.valueOf(visit(ctx.eExpr())) + Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("-") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = Double.valueOf(visit(ctx.eExpr())) - Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("*") && !ctx.getChild(1).getText().equals("(")) {
////                System.out.println(ctx.eExpr().getText());
////                System.out.println(ctx.expr(0).getChildCount());
//                    Double a = Double.valueOf(visit(ctx.eExpr())) * Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("/") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = Double.valueOf(visit(ctx.eExpr())) / Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if (ctx.getChild(2).getText().equals("%") && !ctx.getChild(1).getText().equals("(")) {
//                    Double a = Double.valueOf(visit(ctx.eExpr())) % Double.valueOf(visit(ctx.expr(0)));
//                    return String.valueOf(a);
//                }
//                if(ctx.getChild(1).getText().equals("(")){
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("+")) {
//                        Double a = Double.valueOf(visit(ctx.getChild(1))) + Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("-")) {
//                        Double a = Double.valueOf(visit(ctx.getChild(1))) - Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("*")) {
//                        Double a = Double.valueOf(visit(ctx.getChild(1))) * Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("/")) {
//                        Double a = Double.valueOf(visit(ctx.getChild(1))) / Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    if ((ctx.getChild(1).getParent().getChildCount() == ctx.getChild(4).getParent().getChildCount())
//                            &&ctx.getChild(4).getText().equals("%")) {
//                        Double a = Double.valueOf(visit(ctx.getChild(1))) % Double.valueOf(visit(ctx.getChild(4)));
//                        return String.valueOf(a);
//                    }
//                    Double a = Double.valueOf(visit(ctx.getChild(2)));
//                    return String.valueOf(a);
//                }
//            }
//
//            if (ctx.getChild(1).getText().equals("+")) {
//                Double a = Double.valueOf(visit(ctx.eExpr())) + Double.valueOf(visit(ctx.expr(0)));
//                return String.valueOf(a);
//            }
//            if (ctx.getChild(1).getText().equals("-")) {
//                Double a = Double.valueOf(visit(ctx.eExpr())) - Double.valueOf(visit(ctx.expr(0)));
//                return String.valueOf(a);
//            }
//            if (ctx.getChild(1).getText().equals("*")) {
////                System.out.println(ctx.eExpr().getText());
////                System.out.println(ctx.expr(0).getChildCount());
//                Double a = Double.valueOf(visit(ctx.eExpr())) * Double.valueOf(visit(ctx.expr(0)));
//                return String.valueOf(a);
//            }
//            if (ctx.getChild(1).getText().equals("/")) {
//                Double a = Double.valueOf(visit(ctx.eExpr())) / Double.valueOf(visit(ctx.expr(0)));
//                return String.valueOf(a);
//            }
//            if (ctx.getChild(1).getText().equals("%")) {
//                Double a = Double.valueOf(visit(ctx.eExpr())) % Double.valueOf(visit(ctx.expr(0)));
//                return String.valueOf(a);
//            }
//            if(ctx.getChildCount() > 3 && ctx.getChild(0).getText().equals("(")){
//                if ((ctx.getChild(0).getParent().getChildCount() == ctx.getChild(3).getParent().getChildCount())
//                        &&ctx.getChild(3).getText().equals("+")) {
//                    Double a = Double.valueOf(visit(ctx.getChild(1))) + Double.valueOf(visit(ctx.getChild(4)));
//                    return String.valueOf(a);
//                }
//                if ((ctx.getChild(0).getParent().getChildCount() == ctx.getChild(3).getParent().getChildCount())
//                        &&ctx.getChild(3).getText().equals("-")) {
//                    Double a = Double.valueOf(visit(ctx.getChild(1))) - Double.valueOf(visit(ctx.getChild(4)));
//                    return String.valueOf(a);
//                }
//                if ((ctx.getChild(0).getParent().getChildCount() == ctx.getChild(3).getParent().getChildCount())
//                        &&ctx.getChild(3).getText().equals("*")) {
//                    Double a = Double.valueOf(visit(ctx.getChild(1))) * Double.valueOf(visit(ctx.getChild(4)));
//                    return String.valueOf(a);
//                }
//                if ((ctx.getChild(0).getParent().getChildCount() == ctx.getChild(3).getParent().getChildCount())
//                        &&ctx.getChild(3).getText().equals("/")) {
//                    Double a = Double.valueOf(visit(ctx.getChild(1))) / Double.valueOf(visit(ctx.getChild(4)));
//                    return String.valueOf(a);
//                }
//                if ((ctx.getChild(0).getParent().getChildCount() == ctx.getChild(3).getParent().getChildCount())
//                        &&ctx.getChild(3).getText().equals("%")) {
//                    Double a = Double.valueOf(visit(ctx.getChild(1))) % Double.valueOf(visit(ctx.getChild(4)));
//                    return String.valueOf(a);
//                }
//            }
//            if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")){
//                return visit(ctx.getChild(1));
//            }
//        }
//        if(ctx.getChildCount() == 1){
//            return visit(ctx.getChild(0));
//        }
//        return visitChildren(ctx);
//    }
//    @Override
//    public String visitVarDecl(HelloParser.VarDeclContext ctx) {
//        if (ctx.getChild(0).getText().equals("int")) {
//            String value = visit(ctx.expr().get(0));
//            Double a  = Double.parseDouble(value.trim());
//            Integer b = a.intValue();
//            props.put(ctx.getChild(1).getText(),String.valueOf(b));
//        }else if (ctx.getChild(0).getText().equals("real")) {
//            String value = visit(ctx.expr().get(0));
//            Double a  = Double.parseDouble(value.trim());
////            Integer b = a.intValue();
//            props.put(ctx.getChild(1).getText(),String.valueOf(a));
//        }else if (ctx.getChild(0).getText().equals("double")) {
//            String value = visit(ctx.expr().get(0));
//            Double a  = Double.parseDouble(value.trim());
////            Integer b = a.intValue();
//            props.put(ctx.getChild(1).getText(),String.valueOf(a));
//        }else if (ctx.getChild(0).getText().equals("bool")) {
//            String value = visit(ctx.expr().get(0));
////            Double a  = Double.parseDouble(value.trim());
////            Integer b = a.intValue();
//            props.put(ctx.getChild(1).getText(),String.valueOf(value));
//        }else if (ctx.getChild(0).getText().equals("char")) {
//            String value = visit(ctx.expr().get(0));
////            Double a  = Double.parseDouble(value.trim());
////            Integer b = a.intValue();
//            props.put(ctx.getChild(1).getText(),String.valueOf(value));
//        }
//
//        return visitChildren(ctx);
//    }
    public Variable visitWriteStmt(HelloParser.WriteStmtContext ctx) {

        System.out.println(memory.get(ctx.getChild(2).getText()).getValue());
//        System.out.println(ctx.expr().getText().equals(c));
//        System.out.println(c);
//        System.out.println(ctxD.getChild(2).getText().equals(c));
        return visitChildren(ctx);
    }
}
