package rss_parser;

import antlr4_files.RSSParser;
import antlr4_files.RSSParserBaseVisitor;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;

public class HTMLWriter extends RSSParserBaseVisitor<String> {
    private final ParseTree tree;
    private final Vocabulary vocabulary;
    private final StringBuilder buf;
    private int offset;

    public HTMLWriter(ParseTree tree, Vocabulary vocabulary) {
        this.tree = tree;
        this.buf = new StringBuilder();
        this.vocabulary = vocabulary;
        this.offset = 0;
    }

    public void writeToFile(String targetPath) {
        visitDocument((RSSParser.DocumentContext) tree);
        try {
            FileWriter writer = new FileWriter(targetPath, false);
            System.out.println("String a escribir en " + targetPath + ": " + buf);

            writer.write(buf.toString());
            writer.close();
        } catch (IOException e) {
            System.err.println("Error al intentar escribir al archivo " + targetPath);
        }
    }

    private StringBuilder appendWithOffset(String str) {
        offset++;
        buf.append("\n").append("  ".repeat(offset)).append(str);
        offset--;
        return buf;
    }

    private void visitRangeOfChildren(RuleNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree c = node.getChild(i);
            String result = c.accept(this);
            if (result != null) buf.append(result);
        }
    }

    public String visitChildren(RuleNode node) {
        if (node instanceof RSSParser.ImgContext) {
            visitImg((RSSParser.ImgContext) node);
        } else if (node instanceof RSSParser.TitleContext) {
            visitTitle((RSSParser.TitleContext) node);
        } else if (node instanceof RSSParser.In_itemContext) {
            visitRangeOfChildren(node);
        } else if (node instanceof RSSParser.ChannelContext) {
            visitRangeOfChildren(node);
        } else if (node instanceof RSSParser.TxtContext) {
            visitRangeOfChildren(node);
        } else if (node instanceof RSSParser.RssContext) {
            visitRangeOfChildren(node);
        } else {
            appendWithOffset("");
            offset++;
            visitRangeOfChildren(node);
            offset--;
        }
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        String type = vocabulary.getSymbolicName(node.getSymbol().getType());
        switch (type) {
            case "XML_ENCODING":
            case "INT":
            case "URL":
            case "TXT":
                return node.getText();
            case "O_RSS":
                return "\n<body>";
            case "C_RSS":
                return "\n</body>";
            case "C_IMG":
                return "</img>";
            case "O_ITEM":
                return "<article>";
            case "C_ITEM":
                return "\n" + "  ".repeat(offset) + "</article>";
            case "O_DESC":
                return "<p>";
            case "C_DESC":
                return "</p>";
            case "O_LINK":
            case "O_URL":
                return "<a>";
            case "C_URL":
            case "C_LINK":
                return "</a>";
            case "O_COPYR":
                return "<small title=\"copyright\">";
            case "O_CATEG":
                return "<small title=\"category\">";
            case "C_CATEG":
            case "C_COPYR":
                return "</small>";
            default:
                return null;
        }
    }

    @Override
    public String visitDocument(RSSParser.DocumentContext ctx) {
        buf.append("<!DOCTYPE html>\n<html lang=\"en\">\n");
        visitXml(ctx.xml());
        visitRss(ctx.rss());
        buf.append("\n</html>");
        return null;
    }

    @Override
    public String visitXml(RSSParser.XmlContext ctx) {
        buf.append("<head>");
        RSSParser.Xml_encodingContext childEnc = ctx.xml_encoding();
        if (childEnc != null) {
            appendWithOffset("<meta charset=")
                    .append(childEnc.XML_ENCODING())
                    .append(">");
        }
        return null;
    }

    @Override
    public String visitRss(RSSParser.RssContext ctx) {
        appendWithOffset("<title>")
                .append(ctx.channel().title().txt().getText())
                .append("</title>\n</head>");
        visitChildren(ctx);
        return null;
    }

    @Override
    public String visitTitle(RSSParser.TitleContext ctx) {
        if (ctx.getParent() instanceof RSSParser.ChannelContext) {
            appendWithOffset("<h1>" + ctx.txt().getText() + "</h1>");
        } else {
            appendWithOffset("<h3>" + ctx.txt().getText() + "</h3>");
        }
        return null;
    }

    @Override
    public String visitImg(RSSParser.ImgContext ctx) {
        appendWithOffset("<img ");
        buf.append("src=\"").append(ctx.url().URL().getText()).append("\" ");
        buf.append("alt=\"").append(ctx.title().txt().getText()).append("\" ");

        buf.append("height=\"").append(visitWidth(ctx.width())).append("\" ");
        buf.append("width=\"").append(visitWidth(ctx.width())).append("\"");

        buf.append("/>");
        return null;
    }

    @Override
    public String visitHeight(RSSParser.HeightContext ctx) {
        if (ctx == null) {
            return "31";            // el default es 31 según especificación
        } else {
            return ctx.INT.getText();
        }
    }

    @Override
    public String visitWidth(RSSParser.WidthContext ctx) {
        if (ctx == null) {
            return "88";            // el default es 88 según especificación
        } else {
            return ctx.INT.getText();
        }
    }
}
