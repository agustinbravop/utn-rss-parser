import sys

from antlr4 import *

from HTMLWriter import HTMLWriter
from RSSErrorListener import RSSErrorListener
from grammar.RSSLexer import RSSLexer
from grammar.RSSParser import RSSParser
from printers import print_tokens, print_syntax_tree


def parse_input(input_stream):
    lexer = RSSLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = RSSParser(tokens)

    lexer.removeErrorListeners()
    parser.removeErrorListeners()
    parser.addErrorListener(RSSErrorListener(lexer.symbolicNames, lexer.literalNames))

    try:
        tree = parser.document()
    except Exception as e:
        print(e)
        sys.exit(1)

    if parser.getNumberOfSyntaxErrors() > 0:
        print("Total de errores de sintaxis detectados: " + str(parser.getNumberOfSyntaxErrors()))
        print("======== El documento NO cumple con el formato RSS. ========")
        if "--debug" not in sys.argv:
            sys.exit(0)

    print("\nTokens leidos en el documento: ")
    print_tokens(tokens.tokens, lexer.symbolicNames)

    print("\nParse tree generado: ")
    print_syntax_tree(tree, parser.ruleNames)
    return tree, lexer


def modo_interactivo():
    lines = []
    while True:
        try:
            print("> ", end='')
            line = input()
        except KeyboardInterrupt:
            print("Terminando el proceso...")
            sys.exit(1)
        except EOFError:
            break
        lines.append(line)

    return InputStream(''.join(lines))


def main(argv):
    if len(argv) == 1:
        print("Uso: .\\rss-parser.exe <archivo.rss> [--html]")
        print("Entrando en modo interactivo. Ctrl+D (o Ctrl+Z + Enter en Windows) para salir.")
        input_stream = modo_interactivo()
    else:
        try:
            input_stream = FileStream(argv[1])
        except IOError:
            print("Error al intentar leer el archivo " + argv[1] + ".")
            sys.exit(1)

    tree, lexer = parse_input(input_stream)

    if "--html" in argv:
        writer = HTMLWriter(tree, lexer.symbolicNames)
        target_path = argv[1].rsplit(".", 1)[0] + ".html"
        writer.writeToFile(target_path)

    sys.exit(0)


if __name__ == '__main__':
    main(sys.argv)
