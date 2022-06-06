package rss_parser;

import antlr4_files.RSSLexer;
import antlr4_files.RSSParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static RSSParser parser;
    private static ParseTree tree;

    public static void main(String[] args) {
        CharStream input;

        if (args.length == 0) {
            System.out.println("Uso: rss-parser.exe <archivo.rss> [--html]");
            System.out.println("Entrando en modo interactivo (Ctrl+D para salir):");
            input = modoInteractivo();
        } else {
            try {
                input = CharStreams.fromFileName(args[0]);
            } catch (IOException e) {
                System.out.println("Error al intentar leer el archivo " + args[0] + ".");
                return;
            }
        }

        parseInput(input);

        if (Arrays.asList(args).contains("--html")) {
            HTMLWriter writer = new HTMLWriter(tree, parser.getVocabulary());
            String targetPath = args[0].replace(".rss", ".html");
            writer.writeToFile(targetPath);
        }
    }

    private static CharStream modoInteractivo() {
        Scanner console = new Scanner(System.in, StandardCharsets.UTF_8);
        String line;
        StringBuilder buffer = new StringBuilder();
        System.out.print("> ");
        while (console.hasNext() && (line = console.nextLine()) != null) {
            System.out.print("> ");
            buffer.append(line);
        }
        console.close();
        return CharStreams.fromString(buffer.toString());
    }

    private static void parseInput(CharStream input) {
        RSSLexer lexer = new RSSLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        parser = new RSSParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener(lexer.getVocabulary()));

        tree = parser.document();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Cantidad de errores de sintaxis detectados: " + parser.getNumberOfSyntaxErrors());
            System.out.println("======== El documento NO es RSS valido. ========");
            return;
        }
        System.out.println("======== El documento es RSS valido. ========");
        System.out.println("\n======== Tokens leidos en el documento ========");
        Printer.printTokens(tokens.getTokens(), lexer.getVocabulary());

        System.out.println("\n======== Parse tree generado ========");
        Printer.printSyntaxTree(parser, tree);
    }

}
