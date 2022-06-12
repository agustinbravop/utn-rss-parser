import sys

from antlr4 import *

from HTMLWriter import HTMLWriter
from RSSErrorListener import RSSErrorListener
from grammar.RSSLexer import RSSLexer
from grammar.RSSParser import RSSParser
from printers import print_tokens, print_syntax_tree


def parse_input(input_stream):
    lexer = RSSLexer(input_stream)  # Crea lexer a partir de InputStream.
    tokens = CommonTokenStream(lexer)  # Análisis léxico, obtenemos lista de tokens.
    parser = RSSParser(tokens)

    lexer.removeErrorListeners()
    parser.removeErrorListeners()
    parser.addErrorListener(RSSErrorListener(lexer.symbolicNames, lexer.literalNames))

    try:
        tree = parser.document()  # Análisis sintáctico, obtenemos el parse tree.
    except Exception as e:
        print(e, file=sys.stderr)  # Hubo error al parsear (normalmente por un mal HEIGHT o WIDTH).
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
    print("Entrando en modo interactivo. Ctrl+D (o Ctrl+Z + Enter en Windows) para EOF.")
    lines = []
    while True:
        try:
            print("> ", end='')
            line = input()
        except KeyboardInterrupt:  # Ctrl+C
            print("Terminando el proceso...")
            sys.exit(1)
        except EOFError:  # Ctrl+Z + Enter en Windows. Ctrl+D en LINUX o MacOS.
            break
        lines.append(line)  # se agrega la linea leída a la lista de lineas leídas previamente.

    return InputStream(''.join(lines))


def main(argv):
    if len(argv) == 1:  # Si hay un solo argumento, ese argumento es '.\rss-parser.exe'.
        print("Uso: .\\rss-parser.exe <archivo.rss> [--html]")
        input_stream = modo_interactivo()
    elif argv[1] == "--html" or argv[1] == "--debug":  # El segundo arg no es <archivo.rss>.
        input_stream = modo_interactivo()
    else:  # Se pasó un segundo argumento <archivo.rss>, se intentará leerlo.
        try:
            input_stream = FileStream(argv[1], "UTF-8")
        except IOError:
            print("Error al intentar leer el archivo " + argv[1] + ".", file=sys.stderr)
            sys.exit(1)

    tree, lexer = parse_input(input_stream)

    if "--html" in argv:
        writer = HTMLWriter(lexer.symbolicNames)
        target_path = argv[1].rsplit(".", 1)[0] + ".html"  # reemplaza la extensión original por '.html'.
        writer.write_to_file(tree, target_path)

    sys.exit(0)


if __name__ == '__main__':
    main(sys.argv)
