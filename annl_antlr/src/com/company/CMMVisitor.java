package com.company;
import gen.HelloBaseListener;
import gen.HelloBaseVisitor;
import gen.HelloParser;
import org.antlr.v4.misc.OrderedHashMap;

import java.util.Map;

/**
 * Created by bohaohan on 1/1/16.
 */
public class CMMVisitor extends HelloBaseVisitor<String>{
    static Map<String,String> props = new OrderedHashMap<String, String>();
    @Override
    public String visitExpr(HelloParser.ExprContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public String visitVarDecl(HelloParser.VarDeclContext ctx) {
        if (ctx.getChild(0).getText().equals("int")) {
//            System.out.println(ctx.getChild(1).getText());
//            System.out.println(ctx.expr().get(0).getText());
            props.put(ctx.getChild(1).getText(),ctx.expr().get(0).getText());
        }
        return visitChildren(ctx);
    }
    public String visitWriteStmt(HelloParser.WriteStmtContext ctx) {
        System.out.println(props.get(ctx.getChild(2).getText()));
//        System.out.println(ctx.expr().getText().equals(c));
//        System.out.println(c);
//        System.out.println(ctxD.getChild(2).getText().equals(c));
        return visitChildren(ctx);
    }
}
