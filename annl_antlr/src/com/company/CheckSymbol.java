package com.company;

import gen.HelloParser;
import org.antlr.v4.runtime.Token;

/**
 * Created by qm on 16/1/2.
 */
public class CheckSymbol {

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(),
                t.getCharPositionInLine(), msg);
    }

}
