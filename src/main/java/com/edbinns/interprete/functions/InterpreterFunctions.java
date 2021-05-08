package com.edbinns.interprete.functions;

import com.edbinns.interprete.generated.InterpreteParser;
import com.edbinns.interprete.generated.InterpreteScanner;
import com.edbinns.interprete.visitors.analisis_contextual.AnalisisContextualAST;
import com.edbinns.interprete.visitors.analisis_contextual.TablesSingleton;
import com.edbinns.interprete.visitors.analisis_contextual.utils.AContextualErrorListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InterpreterFunctions {

    private InterpreteScanner inst = null;

    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    private static final Gson GSON = new Gson();

    private String toJson(ParseTree tree) {
        return toJson(tree, true);
    }

    private String toJson(ParseTree tree, boolean prettyPrint) {
        return prettyPrint ? PRETTY_PRINT_GSON.toJson(toMap(tree)) : GSON.toJson(toMap(tree));
    }

    private Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    private void traverse(ParseTree tree, Map<String, Object> map) {

        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            if (token.getType() > -1) {
                map.put("name", inst.getVocabulary().getSymbolicName(token.getType()));
                map.put("text", token.getText());

            } else {
                map.put("text", "EOF");
            }

        } else {
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

    public ArrayList<String> validateSnippet(String snippet) {
        InterpreteParser parser = null;
        ArrayList<String> messages = new ArrayList<String>();
        ParseTree tree = null;
        CharStream input = null;
        CommonTokenStream tokens = null;
        ParserErrorListener parserErrorListener = ParserErrorListener.getInstance();
        input = CharStreams.fromString(snippet);
        inst = new InterpreteScanner(input);

        tokens = new CommonTokenStream(inst);
        parser = new InterpreteParser(tokens);

        inst.removeErrorListeners();
        inst.addErrorListener(parserErrorListener);

        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);



        tree = parser.program();

        if(parserErrorListener.getExistError()){
            parserErrorListener.setExistError(false);
            messages.add("error");
            messages.add(parserErrorListener.getMessageError());
            return  messages;
        }

        AnalisisContextualAST ac = new AnalisisContextualAST();
        ac.visit(tree);
        AContextualErrorListener aContextualErrorListener = AContextualErrorListener.getInstance();
        if(aContextualErrorListener.getExistError()){
            aContextualErrorListener.setExistError(false);
            messages.add("error");
            messages.add(aContextualErrorListener.getMessageError());
            return  messages;
        }

        TablesSingleton tables = TablesSingleton.getInstance();
        String finalMessage = tables.classTable.showTable("Clases");
        finalMessage += "\n" + tables.functionsTable.showTable("Funciones");
        finalMessage += "\n" +  tables.variableTable.showTable("Variables");

        System.out.println("Compilación Terminada!!\n");

        messages.add("success");
        messages.add(finalMessage);
        return  messages;

    }
}
