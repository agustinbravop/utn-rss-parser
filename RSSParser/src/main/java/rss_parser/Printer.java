package rss_parser;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.util.Arrays;
import java.util.List;

public class Printer {
    public static void printTokens(List<Token> tokens, Vocabulary vocab) {
        Token t;
        for (int i = 0; i < tokens.size(); i++) {
            t = tokens.get(i);
            System.out.println(i + ". " + vocab.getSymbolicName(t.getType()) + " : '" + t.getText() + "'");
        }
    }

    public static void printSyntaxTree(Parser parser, ParseTree root) {
        StringBuilder buf = new StringBuilder();
        recursive(root, buf, 0, Arrays.asList(parser.getRuleNames()));
        System.out.println(buf);
    }

    private static void recursive(ParseTree aRoot, StringBuilder buf, int offset, List<String> ruleNames) {
        buf.append("|   ".repeat(Math.max(0, offset - 1)));
        if (offset > 0) {
            buf.append("|-> ");
        }
        buf.append(Trees.getNodeText(aRoot, ruleNames)).append("\n");

        if (aRoot instanceof ParserRuleContext) {
            List<ParseTree> children = ((ParserRuleContext) aRoot).children;
            if (children != null) {
                for (ParseTree child : children) {
                    recursive(child, buf, offset + 1, ruleNames);
                }
            }
        }
    }
}
