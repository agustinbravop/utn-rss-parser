import sys

from antlr4 import *

from HTMLWriter import HTMLWriter
from RSSErrorListener import RSSErrorListener
from grammar.RSSLexer import RSSLexer
from grammar.RSSParser import RSSParser
from printers import print_tokens, print_syntax_tree


def parse_input(input_stream):
    # Crea un lexer a partir del InputStream ingresado.
    lexer = RSSLexer(input_stream)
    # Análisis léxico, obtenemos lista de tokens.
    tokens = CommonTokenStream(lexer)
    # Crea un parser a partir de los tokens generados.
    parser = RSSParser(tokens)

    # Se eliminan los ErrorListeners por defecto en inglés.
    lexer.removeErrorListeners()
    parser.removeErrorListeners()
    # Se agrega nuestro ErrorListener personalizado en español.
    parser.addErrorListener(RSSErrorListener(lexer.symbolicNames, lexer.literalNames))

    try:
        # Análisis sintáctico, obtenemos el parse tree.
        tree = parser.document()
    except Exception as e:
        # Hubo un error al parsear (normalmente por un mal HEIGHT o WIDTH).
        print(e, file=sys.stderr)
        print("======== El documento NO cumple con el formato RSS. ========")
        sys.exit(1)

    if parser.getNumberOfSyntaxErrors() > 0:
        # Hubo al menos un error de sintaxis reportado por el RSSParser.
        # Esto significa que ErrorListener ya los reportó, solo falta terminar el proceso.
        print("======== El documento NO cumple con el formato RSS. ========")
        if "--debug" not in sys.argv:
            sys.exit(1)

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
            # Lectura. Es el prompt del user, se lee hasta que ingresa un '\n'
            line = input()
        except KeyboardInterrupt:
            # Se leyó un Ctrl+C, se debe terminar el proceso.
            print("Terminando el proceso...")
            sys.exit(1)
        except EOFError:
            # Ctrl+Z + Enter en Windows. Ctrl+D en LINUX o MacOS.
            break
        # se agrega la linea leída a la lista de lineas leídas previamente.
        lines.append(line)

    return InputStream(''.join(lines))


def main(argv):
    if len(argv) == 1:
        # Si hay un solo argumento, ese argumento es el comando '.\rss-parser.exe'.
        print("Uso: .\\rss-parser.exe <archivo.rss> [--html]")
        input_stream = modo_interactivo()
    elif argv[1] == "--html" or argv[1] == "--debug":
        # Si el segundo arg no es un <archivo.rss>, es una bandera para el modo interactivo.
        input_stream = modo_interactivo()
    else:
        # Se pasó un segundo argumento <archivo.rss>, se intentará leerlo.
        try:
            input_stream = FileStream(argv[1], "UTF-8")
        except IOError:
            print("Error al intentar leer el archivo " + argv[1] + ".", file=sys.stderr)
            sys.exit(1)

    # Parseo del input_stream. Se imprimen los tokens y el parse tree.
    tree, lexer = parse_input(input_stream)

    # Traducción y escritura a un archivo HTML.
    if "--html" in argv:
        writer = HTMLWriter(lexer.symbolicNames)
        target_path = argv[1].rsplit(".", 1)[0] + ".html"  # Se reemplaza la extensión original por '.html'.
        writer.write_to_file(tree, target_path)

    sys.exit(0)


if __name__ == '__main__':
    main(sys.argv)
