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
        System.err.println("Error de sintaxis en linea " + line + ":" + charPositionInLine);
        if (e != null) {
            System.err.println("Token(s) esperado(s): " + e.getExpectedTokens().toString(vocabulary));
            System.err.println("Token encontrado: " + vocabulary.getSymbolicName(e.getOffendingToken().getType()) + " : '" + e.getOffendingToken().getText() + "'");
        }
    }
}
