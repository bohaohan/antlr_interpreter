package com.company;

import java.awt.Toolkit;
import javax.swing.*;


/**
 * Standalone version of the demo.
 *
 * @author Robert Futrell
 * @version 1.0
 */
public class RSyntaxTextAreaDemoApplet extends JApplet {


    public RSyntaxTextAreaDemoApplet() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace(); // Never happens
        }
        setRootPane(new DemoRootPane());
    }


    public void start() {
        super.start();
        ((DemoRootPane)getRootPane()).focusTextArea();
    }


}