package rss_parser;

import antlr4_files.RSSLexer;
import antlr4_files.RSSParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CharStream input;
        try {
            input = CharStreams.fromFileName(args[0]);
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println(Arrays.toString(args));
            return;
        }
        RSSLexer lexer = new RSSLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RSSParser parser = new RSSParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener(lexer.getVocabulary()));
        ParseTree tree = parser.document();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Errores de sintaxis detectados: " + parser.getNumberOfSyntaxErrors());
            System.out.println("=== El documento no es RSS valido. ===");
            return;
        }
        System.out.println("\nTokens leidos en el documento:");
        Printer.printTokens(tokens.getTokens(), lexer.getVocabulary());
        System.out.println("\nParse tree generado:");
        Printer.printSyntaxTree(parser, tree);
    }
}
