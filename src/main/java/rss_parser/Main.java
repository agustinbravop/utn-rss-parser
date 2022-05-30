package rss_parser;

import antlr4_files.RSSLexer;
import antlr4_files.RSSParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CharStream input;
        if (args.length == 0) {
            System.out.println("Uso: rss-parser.exe <archivo.rss> [--html]");
            return;
        }
        try {
            input = CharStreams.fromFileName(args[0]);
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo " + args[0] + ".");
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
            System.out.println("======== El documento NO es RSS valido. ========");
            return;
        }
        System.out.println("======== El documento es RSS valido. ========");
        System.out.println("\n======== Tokens leidos en el documento ========");
        Printer.printTokens(tokens.getTokens(), lexer.getVocabulary());
        System.out.println("\n======== Parse tree generado ========");
        Printer.printSyntaxTree(parser, tree);

        if (Arrays.asList(args).contains("--html")) {
            HTMLWriter writer = new HTMLWriter(tree, parser.getVocabulary());
            String targetPath = args[0].replace(".rss", ".html");
            writer.writeToFile(targetPath);
        }
    }
}
