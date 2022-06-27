import sys

from antlr4 import RecognitionException, Token
from antlr4.error.ErrorListener import ErrorListener


class RSSErrorListener(ErrorListener):
    def __init__(self, symbolic_names, literal_names):
        self.symbolic_names = symbolic_names
        self.literal_names = literal_names

    # Este método es llamado automáticamente por el RSSParser cada vez que detecta un error de sintaxis.
    # A nosotros nos interesa personalizar el reportaje de ese error para hacerlo en español y no en inglés.
    def syntaxError(self, recognizer, offending_symbol, line, column, msg, e: RecognitionException):
        if e is not None:
            # Si ANTLR pasa al método una RecognitionException, se pueden reportar los tokens esperados.
            msg = f"Encontrado token {self.translate_token(e.offendingToken)} pero se esperaba token(s) " + \
                  f"{e.getExpectedTokens().toString(self.literal_names, self.symbolic_names)}"
        else:
            # Sino, solo se reportan los tokens erróneos inesperados.
            msg = f"Token inesperado {self.translate_token(offending_symbol)}"
        print(f"[Error en linea {str(line)}:{str(column)}] {msg}.", file=sys.stderr)

    def translate_token(self, token: Token):
        if token.type == -1:
            # El tipo -1 corresponde a EOF, un token nativo de ANTLR.
            return "EOF"
        else:
            # Se obtiene el nombre del no terminal representado por el número token.type.
            return f"{self.symbolic_names[token.type]}=\"{token.text}\""
