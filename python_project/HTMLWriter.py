import sys
from typing import List

from antlr4.tree.Tree import TerminalNodeImpl as TerminalNode, ParseTree, RuleNode

from grammar.RSSParser import RSSParser
from grammar.RSSParserVisitor import RSSParserVisitor


class HTMLWriter(RSSParserVisitor):

    def __init__(self, symbolic_names: List[str]):
        self.symbolic_names = symbolic_names  # nombres simbólicos de los tokens según archivo grammar/RSSParser.interp.
        self.offset = 0  # nivel de identación, para escribir el HTML con identación correcta.
        self.buffer = []  # lista de strings que se luego se unirán y serán escritos al archivo destino.

    # gestiona el manejo de archivos (open and close).
    def write_to_file(self, tree: ParseTree, target_path: str):
        self.visitDocument(tree)
        try:
            file = open(target_path, "w", encoding="UTF-8")
            file.write(''.join(self.buffer))  # junta la lista de strings en un solo string final.
            file.close()
        except IOError:
            print("Error al intentar escribir al archivo " + target_path, file=sys.stderr)

    # gestiona agregar strings al buffer teniendo en cuenta la identación del archivo HTML destino.
    def append_with_offset(self, string: str):
        self.offset = self.offset + 1
        self.buffer.append("\n" + "  " * self.offset + string)
        self.offset = self.offset - 1

    # por cada hijo del nodo, se lo visita y si devuelve un string, se agrega el string al buffer.
    def visit_child_nodes(self, node: ParseTree):
        for child in node.getChildren():
            # child.accept(self) visita a cada hijo
            result = child.accept(self)
            if result is not None:
                self.buffer.append(result)

    # visitChildren es un método heredado. Es ejecutado cada vez que se visita a un nodo no terminal que no hayamos
    # implementado su correspondiente visitRule.
    # Ej: al visitar un <item>, se ejecuta visitChildren por no haber implementado un visitItem,
    # pero al visitar un <img>, se ejecuta visitImg, ya que sí está implementado un poco más debajo.
    def visitChildren(self, node: RuleNode):
        if (isinstance(node, RSSParser.ChannelContext)
                or isinstance(node, RSSParser.TxtContext)
                or isinstance(node, RSSParser.RssContext)
                or isinstance(node, RSSParser.In_itemContext)):
            self.visit_child_nodes(node)
        else:
            self.append_with_offset("")
            self.offset += 1
            self.visit_child_nodes(node)
            self.offset -= 1

    # visitTerminal se ejecuta cada vez que se visita a un nodo terminal del parse tree.
    # un nodo terminal es siempre un token. Cada token devuelve su propia nueva representación en HTML.
    def visitTerminal(self, node: TerminalNode):
        token_type = self.symbolic_names[node.symbol.type]  # según el tipo, se obtiene su nombre simbólico.
        match token_type:  # según su nombre simbólico, retornar su correspondiente traducción a HTML.
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
            case "O_COPYR":
                return "<small title=\"copyright\">"
            case "O_CATEG":
                return "<small title=\"category\">"
            case "C_CATEG" | "C_COPYR":
                return "</small>"
            case _:
                return None

    # caso personalizado para cuando se visita a un nodo no terminal document.
    def visitDocument(self, ctx: RSSParser.DocumentContext):
        self.buffer.append("<!DOCTYPE html>\n<html lang=\"en\">\n")
        self.visitXml(ctx.xml())
        self.visitRss(ctx.rss())
        self.buffer.append("\n</html>")

    # caso personalizado para cuando se visita a un nodo no terminal xml.
    # En HTML esto serían etiquetas <meta> que van en el head.
    def visitXml(self, ctx: RSSParser.XmlContext):
        self.buffer.append("<head>")
        encoding_node = ctx.xml_encoding()

        if encoding_node is not None:
            self.append_with_offset("<meta charset=" + encoding_node.XML_ENCODING().getText() + ">")

    # caso personalizado para cuando se visita a un nodo no terminal rss.
    # un documento HTML tiene una etiqueta <title> en el head.
    # Por el orden de recorrido, conviene agregarlo al buffer al visitar la regla rss.
    def visitRss(self, ctx: RSSParser.RssContext):
        self.append_with_offset("<title>" + ctx.channel().title().txt().getText() + "</title>\n</head>")
        self.visitChildren(ctx)

    # caso personalizado para cuando se visita a un nodo no terminal title.
    # Si title es hijo de un <channel>, va como <h1>. Si es hijo de un <item> va como <h3>.
    def visitTitle(self, ctx: RSSParser.TitleContext):
        if isinstance(ctx.parentCtx, RSSParser.ChannelContext):
            self.append_with_offset("<h1>" + ctx.txt().getText() + "</h1>")
        else:
            self.append_with_offset("<h3>" + ctx.txt().getText() + "</h3>")

    # caso personalizado para cuando se visita a un nodo no terminal img.
    # En HTML una img no tiene contenido, asi que lo que en RSS eran etiquetas hijas, en HTML son atributos.
    def visitImg(self, ctx: RSSParser.ImgContext):
        self.append_with_offset(f"<a href=\"{ctx.link().URL().getText()}\">")

        self.offset += 1
        self.append_with_offset(f"<img src=\"{ctx.url().URL().getText()}\" ")
        self.buffer.append(f"alt=\"{ctx.title().txt().getText()}\" ")
        self.buffer.append(f"height=\"{self.visitHeight(ctx.height())}\" ")
        self.buffer.append(f"width=\"{self.visitWidth(ctx.width())}\" />")
        self.offset -= 1

        self.append_with_offset("</a>")

    # caso personalizado para cuando se visita a un nodo no terminal height.
    # Solo es llamado desde visitImg().
    def visitHeight(self, ctx: RSSParser.HeightContext):
        if ctx is None:
            return "31"  # el default es 31 según la especificación.
        else:
            return ctx.INT().getText()

    # caso personalizado para cuando se visita a un nodo no terminal width.
    # Solo es llamado desde visitWidth().
    def visitWidth(self, ctx: RSSParser.WidthContext):
        if ctx is None:
            return "88"  # el default es 88 según la especificación.
        else:
            return ctx.INT().getText()

    # caso personalizado para cuando se visita a un nodo no terminal link.
    # Esto se debe a que en HTML se necesita un atributo 'href' con el hipervínculo.
    def visitLink(self, ctx: RSSParser.LinkContext):
        self.append_with_offset(f"<a href=\"{ctx.URL()}\">{ctx.URL()}</a>")
