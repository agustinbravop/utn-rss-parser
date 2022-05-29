// Generated from C:/Users/anbra/Desktop/UTN/2doNivel/Sintaxis y Semántica de los Lenguajes/RSSParser/RSSParser/src/main/java/antlr4_files\RSSParser.g4 by ANTLR 4.10.1
package antlr4_files;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RSSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RSSParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(RSSParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml(RSSParser.XmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#xml_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_version(RSSParser.Xml_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#xml_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_encoding(RSSParser.Xml_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#rss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRss(RSSParser.RssContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#channel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannel(RSSParser.ChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(RSSParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(RSSParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#in_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_item(RSSParser.In_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(RSSParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(RSSParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(RSSParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#categ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCateg(RSSParser.CategContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#copyr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyr(RSSParser.CopyrContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(RSSParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(RSSParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(RSSParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSSParser#txt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxt(RSSParser.TxtContext ctx);
}