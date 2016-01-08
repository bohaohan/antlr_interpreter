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

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        InputStream input1 = null;
        try {
            input1 = new FileInputStream("/Users/bohaohan/iss/编译原理/解释器/测试脚本/error2_array2.cmm");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ANTLRInputStream input = new ANTLRInputStream(input1);

        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
//        ParseTree tree = parser.program();
//        System.out.println(tree.toStringTree(parser));
        ParseTree tree = parser.program();
//        System.out.println(parser.errorMessage);
//        parser.getErrorHeader()

//        parser.getParseInfo().toString();
//        System.out.println(parser.getParseInfo().toString());
//        System.out.println(tree.toStringTree(parser));
//        CMMListener listener = new CMMListener();
        CMMVisitor loader = new CMMVisitor();
        loader.visit(tree);


    }
}
