package com.company;
import gen.HelloBaseVisitor;
import gen.HelloParser;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bohaohan on 1/1/16.
 */
public class CMMVisitor_backup extends HelloBaseVisitor<String>{
    static Map<String,String> props = new OrderedHashMap<String, String>();
    ParseTreeProperty<String> values = new ParseTreeProperty<String>();
    Map<String, String> memory = new HashMap<String, String>();
    public void setValue(ParseTree node, String value) { values.put(node, value); }
    public String getValue(ParseTree node) { return values.get(node); }

    @Override
    public String visitVarDecl(HelloParser.VarDeclContext ctx) {
//        System.out.println(ctx.expr().size());
        String id = ctx.value().getText(); // id is left-hand side of '='
        String value = null;
        try {
            value = visit(ctx.expr(0)); // compute value of expression on right
        }catch (Exception e){
            value = null;
        }
        try {
            if (ctx.value().getChild(0).getChild(1).getText().equals("[")) {
                int num = Integer.valueOf(visit(ctx.value().getChild(0).getChild(2)));
//            System.out.println(num);
                for (int i = 0; i < num; i++) {
                    String d = ctx.value().getChild(0).getChild(0).getText();
                    try {
                        memory.put(d + "[" + String.valueOf(i) + "]", String.valueOf(visit(ctx.expr(i))));
                    } catch (Exception e) {
                        memory.put(d + "[" + String.valueOf(i) + "]", null);
                    }
                }
            }else {
                memory.put(id, value); // store it in our memory
            }
        } catch (Exception e){
            memory.put(id, value); // store it in our memory
        }
        return value;
    }
    @Override
    public String visitAssignStmt(HelloParser.AssignStmtContext ctx) {
        String id = ctx.value().getText(); // id is left-hand side of '='
        String value = visit(ctx.expr()); // compute value of expression on right
        if (!memory.containsKey(id)) System.out.println("ID not defined " + id);
        else memory.put(id, value);
        return value;
    }
    /** Double */
    @Override
    public String visitDouble(HelloParser.DoubleContext ctx) {
        if (ctx.getChild(0).getText().equals("-")) return String.valueOf(-1 * Double.valueOf(ctx.DOUBLE().getText()));
        return String.valueOf(ctx.DOUBLE().getText());
    }
    /** int */
    @Override
    public String visitInt(HelloParser.IntContext ctx) {
        if (ctx.getChild(0).getText().equals("-")) return String.valueOf(-1 * Double.valueOf(ctx.INT().getText()));
        return String.valueOf(ctx.INT().getText());
    }
    @Override
    public String visitChar(HelloParser.CharContext ctx) {

        return String.valueOf(ctx.CHAR().getText());
    }
    /** value */
    @Override
    public String visitExpValue(HelloParser.ExpValueContext ctx) {
        String id = ctx.value().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return null;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public String visitMulDiv(HelloParser.MulDivContext ctx) {
        Double left = Double.valueOf(visit(ctx.expr(0))); // get value of left subexpression
        Double right = Double.valueOf(visit(ctx.expr(1))); // get value of right subexpression
        if ( ctx.op.getText().equals("*") ) return String.valueOf(left * right);
        return String.valueOf(left / right); // must be DIV
    }
    /** expr op=('+'|'-') expr */
    @Override
    public String visitAddSub(HelloParser.AddSubContext ctx) {

        Double left = Double.valueOf(visit(ctx.expr(0))); // get value of left subexpression
        Double right = Double.valueOf(visit(ctx.expr(1))); // get value of right subexpression
//        System.out.println(left);
//        System.out.println(right);
//        result = left + right;
        if ( ctx.op.getText().equals("+")) return String.valueOf(left+right);
        return String.valueOf(left - right); // must be SUB
    }
    /** '(' expr ')' */
    @Override
    public String visitParens(HelloParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    @Override
    public String visitCompare(HelloParser.CompareContext ctx) {
        if (ctx.expr().size() == 1){
            String result = visit(ctx.expr(0));

//            if (ctx.expr(0))
        }
        return visitChildren(ctx);
    }
    @Override
    public String visitIfStmt(HelloParser.IfStmtContext ctx) {
        System.out.println(ctx.compare().size());
        String bool = visit(ctx.compare(0));
        return visitChildren(ctx);
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
    public String visitWriteStmt(HelloParser.WriteStmtContext ctx) {

        System.out.println(memory.get(ctx.getChild(2).getText()));
//        System.out.println(ctx.expr().getText().equals(c));
//        System.out.println(c);
//        System.out.println(ctxD.getChild(2).getText().equals(c));
        return visitChildren(ctx);
    }
}
