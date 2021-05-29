package com.edbinns.InterpreteBackend.test;

import com.edbinns.InterpreteBackend.functions.ParserErrorListener;
import com.edbinns.InterpreteBackend.generated.InterpreteParser;
import com.edbinns.InterpreteBackend.generated.InterpreteScanner;
import com.edbinns.InterpreteBackend.models.Type;
import com.edbinns.InterpreteBackend.visitors.analisis_contextual.AnalisisContextualAST;
import com.edbinns.InterpreteBackend.visitors.interprete.InterpreteAST;
import com.edbinns.InterpreteBackend.visitors.interprete.models.ArrayInterpreter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;


public class ParserTest {
    static InterpreteScanner inst = null;
    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    private static final Gson GSON = new Gson();

    public static String toJson(ParseTree tree) {
        return toJson(tree, true);
    }

    public static String toJson(ParseTree tree, boolean prettyPrint) {
        return prettyPrint ? PRETTY_PRINT_GSON.toJson(toMap(tree)) : GSON.toJson(toMap(tree));
    }

    public static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    public static void traverse(ParseTree tree, Map<String, Object> map) {

        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();

            if(token.getType() > -1){

                System.out.println(token.getType());
                System.out.println(inst.getVocabulary().getLiteralName(token.getType()));
                map.put("name",  inst.getVocabulary().getSymbolicName(token.getType() ));
                map.put("text", token.getText());

            }else{
                map.put("text", "EOF" );
            }

        }
        else {
            List<Map<String, Object>> children = new ArrayList<Map<String, Object>>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                traverse(tree.getChild(i), nested);
            }
        }
    }

    public static void main(String[] args) {

        InterpreteParser parser = null;
        ParseTree tree = null;
        CharStream input = null;
        CommonTokenStream tokens = null;
        ParserErrorListener parserErrorListener = ParserErrorListener.getInstance();
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new InterpreteScanner(input);
//            inst.getTokenType()
            inst.addErrorListener(parserErrorListener);
            tokens = new CommonTokenStream(inst);
            parser = new InterpreteParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(parserErrorListener);
            InterpreteParser parser2 = parser;


            tree = parser.program();


//            System.out.println((new Gson().toJson(pp.treeItem).toString()));
//            System.out.println(toJson(tree));


            AnalisisContextualAST ac = new AnalisisContextualAST();
            ac.visit(tree);

            InterpreteAST interpreteAST = new InterpreteAST();
            interpreteAST.visit(tree);

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
