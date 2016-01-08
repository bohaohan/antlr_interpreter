package com.company;
import com.sun.javafx.fxml.expression.Expression;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.*;
import gen.HelloLexer;
import gen.HelloParser;
import java.io.*;
import java.util.BitSet;

import gen.HelloBaseVisitor;

import static org.antlr.v4.runtime.tree.Trees.getNodeText;

public class Main extends Thread {
    ParseTree tree = null;
    public void setInput(ParseTree tree){
        this.tree = tree;
    }
    public Main(){}
    public void run(){

//        HelloLexer lexer = new HelloLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        HelloParser parser = new HelloParser(tokens);
//        ParseTreeWalker walker = new ParseTreeWalker();
////        ParseTree tree = parser.program();
////        System.out.println(tree.toStringTree(parser));
//        ParseTree tree = parser.program();
//        System.out.println(parser.errorMessage);
//        parser.getErrorHeader()
//
//        parser.getParseInfo().toString();
//        System.out.println(parser.getParseInfo().toString());
//        System.out.println(tree.toStringTree(parser));
//        CMMListener listener = new CMMListener();
        CMMVisitor loader = new CMMVisitor();
        loader.visit(tree);
    }
    private boolean suspend = false;
    private String control = "";
    public void setSuspend(boolean suspend) {
        if (!suspend) {
            synchronized (control) {
                control.notifyAll();
            }
        }
        this.suspend = suspend;
    }

    public static void main(String[] args) throws IOException {
	// write your code here




    }
}
