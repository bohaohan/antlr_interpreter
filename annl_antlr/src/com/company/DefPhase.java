package com.company;

import gen.HelloBaseListener;
import gen.HelloParser;
import org.antlr.v4.runtime.ParserRuleContext;
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
//    void defineVar()


}
