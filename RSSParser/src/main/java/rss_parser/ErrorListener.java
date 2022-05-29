package rss_parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Vocabulary;

public class ErrorListener extends BaseErrorListener {
    private final Vocabulary vocabulary;

    public ErrorListener(Vocabulary vocabulary) {
        super();
        this.vocabulary = vocabulary;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
        if (e != null) {
            System.out.println("Ctx: " + e.getCtx());
            System.out.println("Expected token: " + e.getExpectedTokens().toString(vocabulary));
            System.out.println("Offending token: " + e.getOffendingToken().getText());
        }
    }
}
