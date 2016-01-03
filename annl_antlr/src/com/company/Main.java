package com.company;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.HelloLexer;
import gen.HelloParser;
import java.io.*;

import static org.antlr.v4.runtime.tree.Trees.getNodeText;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        InputStream input1 = null;
        try {
            input1 = new FileInputStream("/Users/qm/IdeaProjects/CMM/antlr_interpreter/annl_antlr/测试脚本/test.cmm");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ANTLRInputStream input = new ANTLRInputStream(input1);
        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree tree = parser.program();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
        RefPhase ref = new RefPhase(def.globals, def.scopes);
        walker.walk(ref, tree);

    }
}
