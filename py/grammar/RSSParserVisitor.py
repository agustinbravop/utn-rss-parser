# Generated from C:/Users/anbra/Desktop/UTN/2doNivel/Sintaxis y Semántica de los Lenguajes/RSSParser/RSSParser/py/grammar\RSSParser.g4 by ANTLR 4.10.1
from antlr4 import *

if __name__ is not None and "." in __name__:
    from .RSSParser import RSSParser
else:
    from RSSParser import RSSParser


# This class defines a complete generic visitor for a parse tree produced by RSSParser.

class RSSParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by RSSParser#document.
    def visitDocument(self, ctx: RSSParser.DocumentContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#xml.
    def visitXml(self, ctx: RSSParser.XmlContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#xml_version.
    def visitXml_version(self, ctx: RSSParser.Xml_versionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#xml_encoding.
    def visitXml_encoding(self, ctx: RSSParser.Xml_encodingContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#rss.
    def visitRss(self, ctx: RSSParser.RssContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#channel.
    def visitChannel(self, ctx: RSSParser.ChannelContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#img.
    def visitImg(self, ctx: RSSParser.ImgContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#item.
    def visitItem(self, ctx: RSSParser.ItemContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#in_item.
    def visitIn_item(self, ctx: RSSParser.In_itemContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#title.
    def visitTitle(self, ctx: RSSParser.TitleContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#desc.
    def visitDesc(self, ctx: RSSParser.DescContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#link.
    def visitLink(self, ctx: RSSParser.LinkContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#categ.
    def visitCateg(self, ctx: RSSParser.CategContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#copyr.
    def visitCopyr(self, ctx: RSSParser.CopyrContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#url.
    def visitUrl(self, ctx: RSSParser.UrlContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#height.
    def visitHeight(self, ctx: RSSParser.HeightContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#width.
    def visitWidth(self, ctx: RSSParser.WidthContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by RSSParser#txt.
    def visitTxt(self, ctx: RSSParser.TxtContext):
        return self.visitChildren(ctx)


del RSSParser
