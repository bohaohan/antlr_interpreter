package com.company;

import gen.HelloLexer;
import gen.HelloParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TextEditorDemo extends JFrame {

    private static TextEditorDemo single = null;

    public static TextEditorDemo getInstance() {
        if (single == null) {
            single = new TextEditorDemo();
        }
        return single;
    }
    public RSyntaxTextArea getInputAre(){
        RTextScrollPane rr = (RTextScrollPane)this.getContentPane().getComponent(0);
        RSyntaxTextArea rt = (RSyntaxTextArea)rr.getTextArea();
        return rt;
    }
    public RSyntaxTextArea getOutputAre(){
        RTextScrollPane rr = (RTextScrollPane)this.getContentPane().getComponent(2);
        RSyntaxTextArea rt = (RSyntaxTextArea)rr.getTextArea();
        return rt;
    }
    public TextEditorDemo() {
//        this.setLayout(new FlowLayout());
        JPanel cp = new JPanel(new BorderLayout());
        JPanel buttons = new JPanel(new BorderLayout());
//        buttons.setPreferredSize(new Dimension(1, 120));
        ImageIcon icon = new ImageIcon("img/ic_run.png");
        JButton run = new JButton(icon);
        run.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TextEditorDemo td = TextEditorDemo.getInstance();
//                RTextScrollPane rr = (RTextScrollPane)td.getContentPane().getComponent(0);
                RSyntaxTextArea ot = td.getOutputAre();
                ot.removeAllLineHighlights();
                ot.setText("");

                RSyntaxTextArea rt = td.getInputAre();
                String content = rt.getText();
                ByteArrayInputStream stream = new ByteArrayInputStream(content.getBytes());
                ANTLRInputStream input = null;
                try {
                    input = new ANTLRInputStream(stream);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                HelloLexer lexer = new HelloLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                HelloParser parser = new HelloParser(tokens);
//                ParseTreeWalker walker = new ParseTreeWalker();
                ParseTree tree = parser.program();
                CMMVisitor loader = new CMMVisitor();
                loader.visit(tree);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        buttons.add(run, BorderLayout.WEST);
        RSyntaxTextArea textArea = new RSyntaxTextArea(30, 120);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea);
        sp.setFoldIndicatorEnabled(true);

        RSyntaxTextArea textArea2 = new RSyntaxTextArea(15, 120);
        textArea2.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
        textArea2.setCodeFoldingEnabled(true);
        RTextScrollPane sp2 = new RTextScrollPane(textArea2);
        sp2.setLineNumbersEnabled(false);


        cp.add(sp,BorderLayout.CENTER);


        textArea2.addKeyListener(new KeyListener() {
            String result = "";
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() != '\n'){
                    if (e.getKeyCode() == 8 && result.length() > 0) {
                        result = result.substring(0, result.length()-1);
                    }else {
                        result += e.getKeyChar();
                    }
                } else {
                    String re = result;
                    result = "";
                    System.out.println(re);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        cp.add(buttons,BorderLayout.PAGE_START);
        cp.add(sp2,BorderLayout.SOUTH);
        setContentPane(cp);



        setTitle("CMM Interpreter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        // Start all Swing applications on the EDT.
        TextEditorDemo td = TextEditorDemo.getInstance();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TextEditorDemo td = TextEditorDemo.getInstance();
                td.setVisible(true);
            }
        });
    }

}