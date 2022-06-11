import sys

from antlr4 import RecognitionException, Token
from antlr4.error.ErrorListener import ErrorListener


class RSSErrorListener(ErrorListener):
    def __init__(self, symbolic_names, literal_names):
        self.symbolic_names = symbolic_names
        self.literal_names = literal_names

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e: RecognitionException):
        if e is not None:
            msg = f"Encontrado token {self.translateToken(e.offendingToken)} pero se esperaba token(s) " + \
                  f"{e.getExpectedTokens().toString(self.literal_names, self.symbolic_names)}"
        else:
            msg = f"Token inesperado {self.translateToken(offendingSymbol)}"
        print(f"[Error en linea {str(line)}:{str(column)}] {msg}.", file=sys.stderr)

    def translateToken(self, token: Token):
        if token.type == -1:
            return "EOF"
        else:
            return f"{self.symbolic_names[token.type]}=\"{token.text}\""
