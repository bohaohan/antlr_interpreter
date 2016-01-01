package com.company;
import gen.HelloBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by bohaohan on 1/1/16.
 */
public class CMMListener extends HelloBaseListener{
    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println(node.getText());
    }
}
