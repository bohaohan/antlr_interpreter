package com.company;
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

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        InputStream input1 = null;
        try {
            input1 = new FileInputStream("/Users/bohaohan/IdeaProjects/CMM/antlr_interpreter/annl_antlr/测试脚本/error2_array2.cmm");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ANTLRInputStream input = new ANTLRInputStream(input1);
        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
//        System.out.println(tree.toStringTree(parser));
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        CMMListener listener = new CMMListener();
        CMMVisitor loader = new CMMVisitor();
        loader.visit(tree);
//        walker.walk(listener, tree);
//        tree.toStringTree(parser)
//        System.out.println("Syntax Error(s): "+parser.getNumberOfSyntaxErrors());
//        for (Token t : tokens.getTokens()) {
//            System.out.println(t.getTokenIndex() +
//                    " " + t.getText() +
//                    " " + lexer.getVocabulary().getSymbolicName(t.getType())+
//                    " line "+t.getLine()+":" + t.getCharPositionInLine());
//        }

    }
}
