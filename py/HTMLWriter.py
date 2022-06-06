import sys
from typing import List

from antlr4.tree.Tree import TerminalNodeImpl as TerminalNode, ParseTree, RuleNode

from grammar.RSSParser import RSSParser
from grammar.RSSParserVisitor import RSSParserVisitor


class HTMLWriter(RSSParserVisitor):

    def __init__(self, tree: ParseTree, symbolic_names: List[str]):
        self.tree = tree
        self.symbolic_names = symbolic_names
        self.offset = 0
        self.buf = []

    def writeToFile(self, target_path: str):
        self.visitDocument(self.tree)
        try:
            file = open(target_path, "w")
            file.write(''.join(self.buf))
            file.close()
        except IOError:
            print("Error al intentar escribir al archivo " + target_path, file=sys.stderr)

    def appendWithOffset(self, string: str):
        self.offset = self.offset + 1
        self.buf.append("\n" + "  " * self.offset + string)
        self.offset = self.offset - 1
        return self.buf

    def visitRangeOfChildren(self, node: RuleNode):
        for child in node.getChildren():
            result = child.accept(self)
            if result is not None:
                self.buf.append(result)

    def visitChildren(self, node: RuleNode):
        if isinstance(node, RSSParser.ImgContext):
            self.visitImg(node)
        elif isinstance(node, RSSParser.TitleContext):
            self.visitTitle(node)
        elif (isinstance(node, RSSParser.ChannelContext)
              or isinstance(node, RSSParser.TxtContext)
              or isinstance(node, RSSParser.RssContext)
              or isinstance(node, RSSParser.In_itemContext)):
            self.visitRangeOfChildren(node)
        else:
            self.appendWithOffset("")
            self.offset += 1
            self.visitRangeOfChildren(node)
            self.offset -= 1

        return None

    def visitTerminal(self, node: TerminalNode):
        token_type = self.symbolic_names[node.symbol.type]
        match token_type:
            case "XML_ENCODING" | "INT" | "URL" | "TXT":
                return node.getText()
            case "O_RSS":
                return "\n<body>"
            case "C_RSS":
                return "\n</body>"
            case "C_IMG":
                return "</img>"
            case "O_ITEM":
                return "<article>"
            case "C_ITEM":
                return "\n" + "  " * self.offset + "</article>"
            case "O_DESC":
                return "<p>"
            case "C_DESC":
                return "</p>"
            case "O_LINK" | "O_URL":
                return "<a>"
            case "C_LINK" | "C_URL":
                return "</a>"
            case "O_COPYR":
                return "<small title=\"copyright\">"
            case "O_CATEG":
                return "<small title=\"category\">"
            case "C_CATEG" | "C_COPYR":
                return "</small>"
            case _:
                return None

    def visitDocument(self, ctx: RSSParser.DocumentContext):
        self.buf.append("<!DOCTYPE html>\n<html lang=\"en\">\n")
        self.visitXml(ctx.xml())
        self.visitRss(ctx.rss())
        self.buf.append("\n</html>")
        return None

    def visitXml(self, ctx: RSSParser.XmlContext):
        self.buf.append("<head>")
        encoding_node = ctx.xml_encoding()

        if encoding_node is not None:
            self.appendWithOffset("<meta charset=" + encoding_node.XML_ENCODING().getText() + ">")

        return None

    def visitRss(self, ctx: RSSParser.RssContext):
        self.appendWithOffset("<title>" + ctx.channel().title().txt().getText() + "</title>\n</head>")
        self.visitChildren(ctx)
        return None

    def visitTitle(self, ctx: RSSParser.TitleContext):
        if isinstance(ctx.parentCtx, RSSParser.ChannelContext):
            self.appendWithOffset("<h1>" + ctx.txt().getText() + "</h1>")
        else:
            self.appendWithOffset("<h3>" + ctx.txt().getText() + "</h3>")

        return None

    def visitImg(self, ctx: RSSParser.ImgContext):
        self.appendWithOffset("<img src=\"" + ctx.url().URL().getText() + "\" ")
        self.buf.append("alt=\"" + ctx.title().txt().getText() + "\" ")
        self.buf.append("height=\"" + self.visitHeight(ctx.height()) + "\" ")
        self.buf.append("width=\"" + self.visitWidth(ctx.width()) + "\" />")

        return None

    def visitHeight(self, ctx: RSSParser.HeightContext):
        if ctx is None:
            return "31"  # el default es 31 según la especificación
        else:
            return ctx.INT().getText()

    def visitWidth(self, ctx: RSSParser.WidthContext):
        if ctx is None:
            return "88"  # el default es 88 según la especificación
        else:
            return ctx.INT().getText()
