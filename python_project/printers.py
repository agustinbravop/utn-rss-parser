from typing import List

from antlr4 import *
from antlr4.tree.Trees import *


def print_tokens(tokens: List[Token], symbolic_names: List[str]):
    i: int = 0
    for token in tokens[:-1]:  # se itera sobre todos los tokens excepto el último.
        print(f'{i}. {symbolic_names[token.type]}: \'{token.text}\'')
        i = i + 1

    # Se trata distinto a EOF porque es un token nativo de ANTLR, no definido por nosotros.
    # Es el último token de la lista, por ende se accede con tokens[-1].
    print(f'{i}. EOF: \'{tokens[-1].text}\'')


def print_syntax_tree(root: ParseTree, rule_names: List[str]):
    buffer = []
    recursive(root, buffer, 0, rule_names)
    print(''.join(buffer))


def recursive(node: ParseTree, buffer: List[str], offset: int, rule_names: List[str]):
    buffer.append("|  " * max(0, offset - 1))
    if offset > 0:
        buffer.append("|- ")

    # Se agrega el texto matcheado por la regla.
    buffer.append(Trees.getNodeText(node, rule_names))
    buffer.append("\n")

    # Chequea que el nodo sea un no terminal o regla del parser.
    # Si es un nodo terminal o token, ya no hay nada más profundo para recorrer.
    if isinstance(node, ParserRuleContext):
        # Por cada hijo, se lo recorre con un nivel de profunidad más.
        for child in node.children:
            recursive(child, buffer, offset + 1, rule_names)
