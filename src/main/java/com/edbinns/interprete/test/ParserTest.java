package com.edbinns.interprete.test;

import com.edbinns.interprete.functions.ErrorListener;
import generated.InterpreteParser;
import generated.InterpreteScanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;


public class ParserTest {
    public static void main(String[] args) {
        InterpreteScanner inst = null;
        InterpreteParser parser = null;
        ParseTree tree = null;
        CharStream input = null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new InterpreteScanner(input);
            inst.addErrorListener(ErrorListener.INSTANCE);
            tokens = new CommonTokenStream(inst);
            parser = new InterpreteParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ErrorListener.INSTANCE);
            InterpreteParser parser2 = parser;


            tree = parser.program();
            System.out.println("Compilación Terminada!!\n");
            java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
            treeGUI.get().setVisible(true);
        } catch (InterruptedException e) {

            e.printStackTrace();
        } catch (ExecutionException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
