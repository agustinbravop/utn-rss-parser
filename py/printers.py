from typing import List

from antlr4 import *
from antlr4.tree.Trees import *


def print_tokens(tokens: List[Token], symbolic_names: List[str]):
    i: int = 0
    for token in tokens[:-1]:
        print(f'{i}. {symbolic_names[token.type]}: \'{token.text}\'')
        i = i + 1

    # Se trata distinto a EOF porque es un token de ANTLR, no nuestro.
    # Es el último token, por ende tokens[-1]
    print(f'{i}. EOF: \'{tokens[-1].text}\'')


def print_syntax_tree(root: ParseTree, rule_names: List[str]):
    buffer = []
    recursive(root, buffer, 0, rule_names)
    print(''.join(buffer))


def recursive(root: ParseTree, buffer: List[str], offset: int, rule_names: List[str]):
    buffer.append("|  " * max(0, offset - 1))
    if offset > 0:
        buffer.append("|- ")

    buffer.append(Trees.getNodeText(root, rule_names))
    buffer.append("\n")

    if isinstance(root, ParserRuleContext):
        if root.children is not None:
            for child in root.children:
                recursive(child, buffer, offset + 1, rule_names)
