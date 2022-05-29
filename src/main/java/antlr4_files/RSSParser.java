// Generated from C:/Users/anbra/Desktop/UTN/2doNivel/Sintaxis y Semántica de los Lenguajes/RSSParser/RSSParser/src/java/antlr4_files\RSSParser.g4 by ANTLR 4.10.1
package antlr4_files;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RSSParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            COMMENT = 1, WS = 2, URL = 3, INT = 4, TXT = 5, O_RSS = 6, O_CHANNEL = 7, O_IMG = 8, O_ITEM = 9,
            O_TITLE = 10, O_DESC = 11, O_LINK = 12, O_CATEG = 13, O_COPYR = 14, O_URL = 15, O_HEIGHT = 16,
            O_WIDTH = 17, C_RSS = 18, C_CHANNEL = 19, C_IMG = 20, C_ITEM = 21, C_TITLE = 22, C_DESC = 23,
            C_LINK = 24, C_CATEG = 25, C_COPYR = 26, C_URL = 27, C_HEIGHT = 28, C_WIDTH = 29,
            RSS_VERSION = 30, OPEN_XML = 31, CLOSE_XML = 32, XML_WS = 33, ATT_VERSION = 34,
            ATT_ENCODING = 35, XML_VERSION = 36, XML_ENCODING = 37;
    public static final int
            RULE_document = 0, RULE_xml = 1, RULE_xml_version = 2, RULE_xml_encoding = 3,
            RULE_rss = 4, RULE_channel = 5, RULE_img = 6, RULE_item = 7, RULE_in_item = 8,
            RULE_title = 9, RULE_desc = 10, RULE_link = 11, RULE_categ = 12, RULE_copyr = 13,
            RULE_url = 14, RULE_height = 15, RULE_width = 16, RULE_txt = 17;

    private static String[] makeRuleNames() {
        return new String[]{
                "document", "xml", "xml_version", "xml_encoding", "rss", "channel", "img",
                "item", "in_item", "title", "desc", "link", "categ", "copyr", "url",
                "height", "width", "txt"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, "'<?xml'", "'?>'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "COMMENT", "WS", "URL", "INT", "TXT", "O_RSS", "O_CHANNEL", "O_IMG",
                "O_ITEM", "O_TITLE", "O_DESC", "O_LINK", "O_CATEG", "O_COPYR", "O_URL",
                "O_HEIGHT", "O_WIDTH", "C_RSS", "C_CHANNEL", "C_IMG", "C_ITEM", "C_TITLE",
                "C_DESC", "C_LINK", "C_CATEG", "C_COPYR", "C_URL", "C_HEIGHT", "C_WIDTH",
                "RSS_VERSION", "OPEN_XML", "CLOSE_XML", "XML_WS", "ATT_VERSION", "ATT_ENCODING",
                "XML_VERSION", "XML_ENCODING"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "RSSParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public RSSParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class DocumentContext extends ParserRuleContext {
        public XmlContext xml() {
            return getRuleContext(XmlContext.class, 0);
        }

        public RssContext rss() {
            return getRuleContext(RssContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(RSSParser.EOF, 0);
        }

        public DocumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_document;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor)
                return ((RSSParserVisitor<? extends T>) visitor).visitDocument(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DocumentContext document() throws RecognitionException {
        DocumentContext _localctx = new DocumentContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_document);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                xml();
                setState(37);
                rss();
                setState(38);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class XmlContext extends ParserRuleContext {
        public TerminalNode OPEN_XML() {
            return getToken(RSSParser.OPEN_XML, 0);
        }

        public Xml_versionContext xml_version() {
            return getRuleContext(Xml_versionContext.class, 0);
        }

        public TerminalNode CLOSE_XML() {
            return getToken(RSSParser.CLOSE_XML, 0);
        }

        public Xml_encodingContext xml_encoding() {
            return getRuleContext(Xml_encodingContext.class, 0);
        }

        public XmlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_xml;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitXml(this);
            else return visitor.visitChildren(this);
        }
    }

    public final XmlContext xml() throws RecognitionException {
        XmlContext _localctx = new XmlContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_xml);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(40);
                match(OPEN_XML);
                setState(41);
                xml_version();
                setState(43);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ATT_ENCODING) {
                    {
                        setState(42);
                        xml_encoding();
                    }
                }

                setState(45);
                match(CLOSE_XML);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xml_versionContext extends ParserRuleContext {
        public TerminalNode ATT_VERSION() {
            return getToken(RSSParser.ATT_VERSION, 0);
        }

        public TerminalNode XML_VERSION() {
            return getToken(RSSParser.XML_VERSION, 0);
        }

        public Xml_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_xml_version;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor)
                return ((RSSParserVisitor<? extends T>) visitor).visitXml_version(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Xml_versionContext xml_version() throws RecognitionException {
        Xml_versionContext _localctx = new Xml_versionContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_xml_version);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                match(ATT_VERSION);
                setState(48);
                match(XML_VERSION);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xml_encodingContext extends ParserRuleContext {
        public TerminalNode ATT_ENCODING() {
            return getToken(RSSParser.ATT_ENCODING, 0);
        }

        public TerminalNode XML_ENCODING() {
            return getToken(RSSParser.XML_ENCODING, 0);
        }

        public Xml_encodingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_xml_encoding;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor)
                return ((RSSParserVisitor<? extends T>) visitor).visitXml_encoding(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Xml_encodingContext xml_encoding() throws RecognitionException {
        Xml_encodingContext _localctx = new Xml_encodingContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_xml_encoding);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(50);
                match(ATT_ENCODING);
                setState(51);
                match(XML_ENCODING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RssContext extends ParserRuleContext {
        public TerminalNode O_RSS() {
            return getToken(RSSParser.O_RSS, 0);
        }

        public ChannelContext channel() {
            return getRuleContext(ChannelContext.class, 0);
        }

        public TerminalNode C_RSS() {
            return getToken(RSSParser.C_RSS, 0);
        }

        public RssContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rss;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitRss(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RssContext rss() throws RecognitionException {
        RssContext _localctx = new RssContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_rss);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                match(O_RSS);
                setState(54);
                channel();
                setState(55);
                match(C_RSS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ChannelContext extends ParserRuleContext {
        public TerminalNode O_CHANNEL() {
            return getToken(RSSParser.O_CHANNEL, 0);
        }

        public TitleContext title() {
            return getRuleContext(TitleContext.class, 0);
        }

        public LinkContext link() {
            return getRuleContext(LinkContext.class, 0);
        }

        public DescContext desc() {
            return getRuleContext(DescContext.class, 0);
        }

        public TerminalNode C_CHANNEL() {
            return getToken(RSSParser.C_CHANNEL, 0);
        }

        public List<ItemContext> item() {
            return getRuleContexts(ItemContext.class);
        }

        public ItemContext item(int i) {
            return getRuleContext(ItemContext.class, i);
        }

        public CategContext categ() {
            return getRuleContext(CategContext.class, 0);
        }

        public CopyrContext copyr() {
            return getRuleContext(CopyrContext.class, 0);
        }

        public ImgContext img() {
            return getRuleContext(ImgContext.class, 0);
        }

        public ChannelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_channel;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor)
                return ((RSSParserVisitor<? extends T>) visitor).visitChannel(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ChannelContext channel() throws RecognitionException {
        ChannelContext _localctx = new ChannelContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_channel);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(57);
                match(O_CHANNEL);
                setState(61);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == O_ITEM) {
                    {
                        {
                            setState(58);
                            item();
                        }
                    }
                    setState(63);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(64);
                title();
                setState(68);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == O_ITEM) {
                    {
                        {
                            setState(65);
                            item();
                        }
                    }
                    setState(70);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(71);
                link();
                setState(75);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == O_ITEM) {
                    {
                        {
                            setState(72);
                            item();
                        }
                    }
                    setState(77);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(78);
                desc();
                setState(82);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(79);
                                item();
                            }
                        }
                    }
                    setState(84);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                }
                setState(86);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == O_CATEG) {
                    {
                        setState(85);
                        categ();
                    }
                }

                setState(91);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(88);
                                item();
                            }
                        }
                    }
                    setState(93);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
                setState(95);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == O_COPYR) {
                    {
                        setState(94);
                        copyr();
                    }
                }

                setState(100);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(97);
                                item();
                            }
                        }
                    }
                    setState(102);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
                setState(104);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == O_IMG) {
                    {
                        setState(103);
                        img();
                    }
                }

                setState(109);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == O_ITEM) {
                    {
                        {
                            setState(106);
                            item();
                        }
                    }
                    setState(111);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(112);
                match(C_CHANNEL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ImgContext extends ParserRuleContext {
        public TerminalNode O_IMG() {
            return getToken(RSSParser.O_IMG, 0);
        }

        public UrlContext url() {
            return getRuleContext(UrlContext.class, 0);
        }

        public TitleContext title() {
            return getRuleContext(TitleContext.class, 0);
        }

        public LinkContext link() {
            return getRuleContext(LinkContext.class, 0);
        }

        public TerminalNode C_IMG() {
            return getToken(RSSParser.C_IMG, 0);
        }

        public HeightContext height() {
            return getRuleContext(HeightContext.class, 0);
        }

        public WidthContext width() {
            return getRuleContext(WidthContext.class, 0);
        }

        public ImgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_img;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitImg(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ImgContext img() throws RecognitionException {
        ImgContext _localctx = new ImgContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_img);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                match(O_IMG);
                setState(115);
                url();
                setState(116);
                title();
                setState(117);
                link();
                setState(119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == O_HEIGHT) {
                    {
                        setState(118);
                        height();
                    }
                }

                setState(122);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == O_WIDTH) {
                    {
                        setState(121);
                        width();
                    }
                }

                setState(124);
                match(C_IMG);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ItemContext extends ParserRuleContext {
        public TerminalNode O_ITEM() {
            return getToken(RSSParser.O_ITEM, 0);
        }

        public In_itemContext in_item() {
            return getRuleContext(In_itemContext.class, 0);
        }

        public TerminalNode C_ITEM() {
            return getToken(RSSParser.C_ITEM, 0);
        }

        public ItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_item;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ItemContext item() throws RecognitionException {
        ItemContext _localctx = new ItemContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_item);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(126);
                match(O_ITEM);
                setState(127);
                in_item();
                setState(128);
                match(C_ITEM);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class In_itemContext extends ParserRuleContext {
        public TitleContext title() {
            return getRuleContext(TitleContext.class, 0);
        }

        public DescContext desc() {
            return getRuleContext(DescContext.class, 0);
        }

        public LinkContext link() {
            return getRuleContext(LinkContext.class, 0);
        }

        public CategContext categ() {
            return getRuleContext(CategContext.class, 0);
        }

        public In_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_in_item;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor)
                return ((RSSParserVisitor<? extends T>) visitor).visitIn_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public final In_itemContext in_item() throws RecognitionException {
        In_itemContext _localctx = new In_itemContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_in_item);
        int _la;
        try {
            setState(282);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(130);
                    title();
                    setState(132);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_DESC) {
                        {
                            setState(131);
                            desc();
                        }
                    }

                    setState(135);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_LINK) {
                        {
                            setState(134);
                            link();
                        }
                    }

                    setState(138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_CATEG) {
                        {
                            setState(137);
                            categ();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(140);
                    desc();
                    setState(142);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_TITLE) {
                        {
                            setState(141);
                            title();
                        }
                    }

                    setState(145);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_LINK) {
                        {
                            setState(144);
                            link();
                        }
                    }

                    setState(148);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_CATEG) {
                        {
                            setState(147);
                            categ();
                        }
                    }

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(150);
                    link();
                    setState(151);
                    title();
                    setState(153);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_DESC) {
                        {
                            setState(152);
                            desc();
                        }
                    }

                    setState(156);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_CATEG) {
                        {
                            setState(155);
                            categ();
                        }
                    }

                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(158);
                    link();
                    setState(159);
                    desc();
                    setState(161);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_TITLE) {
                        {
                            setState(160);
                            title();
                        }
                    }

                    setState(164);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_CATEG) {
                        {
                            setState(163);
                            categ();
                        }
                    }

                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(166);
                    categ();
                    setState(167);
                    title();
                    setState(169);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_DESC) {
                        {
                            setState(168);
                            desc();
                        }
                    }

                    setState(172);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_LINK) {
                        {
                            setState(171);
                            link();
                        }
                    }

                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(174);
                    categ();
                    setState(175);
                    desc();
                    setState(177);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_TITLE) {
                        {
                            setState(176);
                            title();
                        }
                    }

                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_LINK) {
                        {
                            setState(179);
                            link();
                        }
                    }

                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(182);
                    title();
                    setState(183);
                    link();
                    setState(184);
                    desc();
                    setState(186);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_CATEG) {
                        {
                            setState(185);
                            categ();
                        }
                    }

                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(188);
                    title();
                    setState(189);
                    categ();
                    setState(190);
                    desc();
                    setState(192);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_LINK) {
                        {
                            setState(191);
                            link();
                        }
                    }

                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(194);
                    title();
                    setState(195);
                    categ();
                    setState(196);
                    link();
                    setState(198);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_DESC) {
                        {
                            setState(197);
                            desc();
                        }
                    }

                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(200);
                    desc();
                    setState(201);
                    link();
                    setState(202);
                    title();
                    setState(204);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_CATEG) {
                        {
                            setState(203);
                            categ();
                        }
                    }

                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(206);
                    desc();
                    setState(207);
                    categ();
                    setState(208);
                    title();
                    setState(210);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_LINK) {
                        {
                            setState(209);
                            link();
                        }
                    }

                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(212);
                    desc();
                    setState(213);
                    categ();
                    setState(214);
                    link();
                    setState(216);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_TITLE) {
                        {
                            setState(215);
                            title();
                        }
                    }

                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(218);
                    link();
                    setState(219);
                    categ();
                    setState(220);
                    title();
                    setState(222);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_DESC) {
                        {
                            setState(221);
                            desc();
                        }
                    }

                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(224);
                    link();
                    setState(225);
                    categ();
                    setState(226);
                    desc();
                    setState(228);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_TITLE) {
                        {
                            setState(227);
                            title();
                        }
                    }

                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(230);
                    categ();
                    setState(231);
                    link();
                    setState(232);
                    title();
                    setState(234);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_DESC) {
                        {
                            setState(233);
                            desc();
                        }
                    }

                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(236);
                    categ();
                    setState(237);
                    link();
                    setState(238);
                    desc();
                    setState(240);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == O_TITLE) {
                        {
                            setState(239);
                            title();
                        }
                    }

                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(242);
                    title();
                    setState(243);
                    desc();
                    setState(244);
                    categ();
                    setState(245);
                    link();
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(247);
                    title();
                    setState(248);
                    link();
                    setState(249);
                    categ();
                    setState(250);
                    desc();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(252);
                    desc();
                    setState(253);
                    title();
                    setState(254);
                    categ();
                    setState(255);
                    link();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(257);
                    desc();
                    setState(258);
                    link();
                    setState(259);
                    categ();
                    setState(260);
                    title();
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(262);
                    link();
                    setState(263);
                    title();
                    setState(264);
                    categ();
                    setState(265);
                    desc();
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(267);
                    link();
                    setState(268);
                    desc();
                    setState(269);
                    categ();
                    setState(270);
                    title();
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(272);
                    categ();
                    setState(273);
                    title();
                    setState(274);
                    link();
                    setState(275);
                    desc();
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(277);
                    categ();
                    setState(278);
                    desc();
                    setState(279);
                    link();
                    setState(280);
                    title();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TitleContext extends ParserRuleContext {
        public TerminalNode O_TITLE() {
            return getToken(RSSParser.O_TITLE, 0);
        }

        public TxtContext txt() {
            return getRuleContext(TxtContext.class, 0);
        }

        public TerminalNode C_TITLE() {
            return getToken(RSSParser.C_TITLE, 0);
        }

        public TitleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_title;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitTitle(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TitleContext title() throws RecognitionException {
        TitleContext _localctx = new TitleContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_title);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(284);
                match(O_TITLE);
                setState(285);
                txt();
                setState(286);
                match(C_TITLE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DescContext extends ParserRuleContext {
        public TerminalNode O_DESC() {
            return getToken(RSSParser.O_DESC, 0);
        }

        public TxtContext txt() {
            return getRuleContext(TxtContext.class, 0);
        }

        public TerminalNode C_DESC() {
            return getToken(RSSParser.C_DESC, 0);
        }

        public DescContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_desc;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitDesc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DescContext desc() throws RecognitionException {
        DescContext _localctx = new DescContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_desc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(288);
                match(O_DESC);
                setState(289);
                txt();
                setState(290);
                match(C_DESC);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LinkContext extends ParserRuleContext {
        public TerminalNode O_LINK() {
            return getToken(RSSParser.O_LINK, 0);
        }

        public TerminalNode URL() {
            return getToken(RSSParser.URL, 0);
        }

        public TerminalNode C_LINK() {
            return getToken(RSSParser.C_LINK, 0);
        }

        public LinkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_link;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitLink(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LinkContext link() throws RecognitionException {
        LinkContext _localctx = new LinkContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_link);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(292);
                match(O_LINK);
                setState(293);
                match(URL);
                setState(294);
                match(C_LINK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CategContext extends ParserRuleContext {
        public TerminalNode O_CATEG() {
            return getToken(RSSParser.O_CATEG, 0);
        }

        public TxtContext txt() {
            return getRuleContext(TxtContext.class, 0);
        }

        public TerminalNode C_CATEG() {
            return getToken(RSSParser.C_CATEG, 0);
        }

        public CategContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_categ;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitCateg(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CategContext categ() throws RecognitionException {
        CategContext _localctx = new CategContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_categ);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(296);
                match(O_CATEG);
                setState(297);
                txt();
                setState(298);
                match(C_CATEG);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CopyrContext extends ParserRuleContext {
        public TerminalNode O_COPYR() {
            return getToken(RSSParser.O_COPYR, 0);
        }

        public TxtContext txt() {
            return getRuleContext(TxtContext.class, 0);
        }

        public TerminalNode C_COPYR() {
            return getToken(RSSParser.C_COPYR, 0);
        }

        public CopyrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_copyr;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitCopyr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CopyrContext copyr() throws RecognitionException {
        CopyrContext _localctx = new CopyrContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_copyr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(O_COPYR);
                setState(301);
                txt();
                setState(302);
                match(C_COPYR);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UrlContext extends ParserRuleContext {
        public TerminalNode O_URL() {
            return getToken(RSSParser.O_URL, 0);
        }

        public TerminalNode URL() {
            return getToken(RSSParser.URL, 0);
        }

        public TerminalNode C_URL() {
            return getToken(RSSParser.C_URL, 0);
        }

        public UrlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_url;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitUrl(this);
            else return visitor.visitChildren(this);
        }
    }

    public final UrlContext url() throws RecognitionException {
        UrlContext _localctx = new UrlContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_url);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(304);
                match(O_URL);
                setState(305);
                match(URL);
                setState(306);
                match(C_URL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HeightContext extends ParserRuleContext {
        public Token INT;

        public TerminalNode O_HEIGHT() {
            return getToken(RSSParser.O_HEIGHT, 0);
        }

        public TerminalNode INT() {
            return getToken(RSSParser.INT, 0);
        }

        public TerminalNode C_HEIGHT() {
            return getToken(RSSParser.C_HEIGHT, 0);
        }

        public HeightContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_height;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitHeight(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HeightContext height() throws RecognitionException {
        HeightContext _localctx = new HeightContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_height);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(308);
                match(O_HEIGHT);
                setState(309);
                ((HeightContext) _localctx).INT = match(INT);
                setState(310);
                match(C_HEIGHT);
                if (Integer.parseInt((((HeightContext) _localctx).INT != null ? ((HeightContext) _localctx).INT.getText() : null)) > 400) {
                    throw new RuntimeException("height " + (((HeightContext) _localctx).INT != null ? ((HeightContext) _localctx).INT.getText() : null) + " no debe ser mayor a 400.");
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WidthContext extends ParserRuleContext {
        public Token INT;

        public TerminalNode O_WIDTH() {
            return getToken(RSSParser.O_WIDTH, 0);
        }

        public TerminalNode INT() {
            return getToken(RSSParser.INT, 0);
        }

        public TerminalNode C_WIDTH() {
            return getToken(RSSParser.C_WIDTH, 0);
        }

        public WidthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_width;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitWidth(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WidthContext width() throws RecognitionException {
        WidthContext _localctx = new WidthContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_width);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                match(O_WIDTH);
                setState(314);
                ((WidthContext) _localctx).INT = match(INT);
                setState(315);
                match(C_WIDTH);
                if (Integer.parseInt((((WidthContext) _localctx).INT != null ? ((WidthContext) _localctx).INT.getText() : null)) > 144) {
                    throw new RuntimeException("width " + (((WidthContext) _localctx).INT != null ? ((WidthContext) _localctx).INT.getText() : null) + " no debe ser mayor a 144.");
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TxtContext extends ParserRuleContext {
        public TerminalNode TXT() {
            return getToken(RSSParser.TXT, 0);
        }

        public TerminalNode URL() {
            return getToken(RSSParser.URL, 0);
        }

        public TerminalNode INT() {
            return getToken(RSSParser.INT, 0);
        }

        public TxtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_txt;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RSSParserVisitor) return ((RSSParserVisitor<? extends T>) visitor).visitTxt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TxtContext txt() throws RecognitionException {
        TxtContext _localctx = new TxtContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_txt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(318);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << URL) | (1L << INT) | (1L << TXT))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001%\u0141\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001" +
                    ",\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005<\b\u0005\n\u0005\f\u0005" +
                    "?\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005C\b\u0005\n\u0005\f\u0005" +
                    "F\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005J\b\u0005\n\u0005\f\u0005" +
                    "M\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005Q\b\u0005\n\u0005\f\u0005" +
                    "T\t\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0001\u0005\u0005\u0005Z\b" +
                    "\u0005\n\u0005\f\u0005]\t\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001" +
                    "\u0005\u0005\u0005c\b\u0005\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0003" +
                    "\u0005i\b\u0005\u0001\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0003\b\u0088\b\b\u0001\b\u0003\b" +
                    "\u008b\b\b\u0001\b\u0001\b\u0003\b\u008f\b\b\u0001\b\u0003\b\u0092\b\b" +
                    "\u0001\b\u0003\b\u0095\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u009a\b\b\u0001" +
                    "\b\u0003\b\u009d\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0001\b" +
                    "\u0003\b\u00a5\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00aa\b\b\u0001\b\u0003" +
                    "\b\u00ad\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b2\b\b\u0001\b\u0003\b" +
                    "\u00b5\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bb\b\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0003\b\u00c1\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003" +
                    "\b\u00c7\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cd\b\b\u0001\b" +
                    "\u0001\b\u0001\b\u0001\b\u0003\b\u00d3\b\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0003\b\u00d9\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00df\b\b" +
                    "\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e5\b\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0003\b\u00eb\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f1" +
                    "\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u011b\b\b\u0001\t\u0001\t\u0001" +
                    "\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001" +
                    "\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014" +
                    "\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\u0003\u0005" +
                    "\u016a\u0000$\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004" +
                    "/\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b5\u0001\u0000" +
                    "\u0000\u0000\n9\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e" +
                    "~\u0001\u0000\u0000\u0000\u0010\u011a\u0001\u0000\u0000\u0000\u0012\u011c" +
                    "\u0001\u0000\u0000\u0000\u0014\u0120\u0001\u0000\u0000\u0000\u0016\u0124" +
                    "\u0001\u0000\u0000\u0000\u0018\u0128\u0001\u0000\u0000\u0000\u001a\u012c" +
                    "\u0001\u0000\u0000\u0000\u001c\u0130\u0001\u0000\u0000\u0000\u001e\u0134" +
                    "\u0001\u0000\u0000\u0000 \u0139\u0001\u0000\u0000\u0000\"\u013e\u0001" +
                    "\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0003\b\u0004\u0000&\'" +
                    "\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0005\u001f" +
                    "\u0000\u0000)+\u0003\u0004\u0002\u0000*,\u0003\u0006\u0003\u0000+*\u0001" +
                    "\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000" +
                    "-.\u0005 \u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\"\u0000\u0000" +
                    "01\u0005$\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005#\u0000\u0000" +
                    "34\u0005%\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005\u0006\u0000" +
                    "\u000067\u0003\n\u0005\u000078\u0005\u0012\u0000\u00008\t\u0001\u0000" +
                    "\u0000\u00009=\u0005\u0007\u0000\u0000:<\u0003\u000e\u0007\u0000;:\u0001" +
                    "\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000" +
                    "=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000" +
                    "\u0000@D\u0003\u0012\t\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000\u0000" +
                    "\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000" +
                    "\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GK\u0003" +
                    "\u0016\u000b\u0000HJ\u0003\u000e\u0007\u0000IH\u0001\u0000\u0000\u0000" +
                    "JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000" +
                    "\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NR\u0003\u0014" +
                    "\n\u0000OQ\u0003\u000e\u0007\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000" +
                    "\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SV\u0001" +
                    "\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0003\u0018\f\u0000VU\u0001" +
                    "\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W[\u0001\u0000\u0000\u0000" +
                    "XZ\u0003\u000e\u0007\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000" +
                    "\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000" +
                    "\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0003\u001a\r\u0000_^\u0001\u0000" +
                    "\u0000\u0000_`\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000\u0000ac\u0003" +
                    "\u000e\u0007\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000" +
                    "db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000" +
                    "\u0000fd\u0001\u0000\u0000\u0000gi\u0003\f\u0006\u0000hg\u0001\u0000\u0000" +
                    "\u0000hi\u0001\u0000\u0000\u0000im\u0001\u0000\u0000\u0000jl\u0003\u000e" +
                    "\u0007\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001" +
                    "\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000" +
                    "om\u0001\u0000\u0000\u0000pq\u0005\u0013\u0000\u0000q\u000b\u0001\u0000" +
                    "\u0000\u0000rs\u0005\b\u0000\u0000st\u0003\u001c\u000e\u0000tu\u0003\u0012" +
                    "\t\u0000uw\u0003\u0016\u000b\u0000vx\u0003\u001e\u000f\u0000wv\u0001\u0000" +
                    "\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000y{\u0003" +
                    " \u0010\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001" +
                    "\u0000\u0000\u0000|}\u0005\u0014\u0000\u0000}\r\u0001\u0000\u0000\u0000" +
                    "~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080\u0081" +
                    "\u0005\u0015\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000\u0082\u0084" +
                    "\u0003\u0012\t\u0000\u0083\u0085\u0003\u0014\n\u0000\u0084\u0083\u0001" +
                    "\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001" +
                    "\u0000\u0000\u0000\u0086\u0088\u0003\u0016\u000b\u0000\u0087\u0086\u0001" +
                    "\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001" +
                    "\u0000\u0000\u0000\u0089\u008b\u0003\u0018\f\u0000\u008a\u0089\u0001\u0000" +
                    "\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u011b\u0001\u0000" +
                    "\u0000\u0000\u008c\u008e\u0003\u0014\n\u0000\u008d\u008f\u0003\u0012\t" +
                    "\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000" +
                    "\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u0016\u000b" +
                    "\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000" +
                    "\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u0018\f\u0000" +
                    "\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000" +
                    "\u0095\u011b\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0016\u000b\u0000" +
                    "\u0097\u0099\u0003\u0012\t\u0000\u0098\u009a\u0003\u0014\n\u0000\u0099" +
                    "\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a" +
                    "\u009c\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0018\f\u0000\u009c\u009b" +
                    "\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u011b" +
                    "\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u0016\u000b\u0000\u009f\u00a1" +
                    "\u0003\u0014\n\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u00a0\u0001" +
                    "\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001" +
                    "\u0000\u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a3\u0001\u0000" +
                    "\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u011b\u0001\u0000" +
                    "\u0000\u0000\u00a6\u00a7\u0003\u0018\f\u0000\u00a7\u00a9\u0003\u0012\t" +
                    "\u0000\u00a8\u00aa\u0003\u0014\n\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000" +
                    "\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000" +
                    "\u00ab\u00ad\u0003\u0016\u000b\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000" +
                    "\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u011b\u0001\u0000\u0000\u0000" +
                    "\u00ae\u00af\u0003\u0018\f\u0000\u00af\u00b1\u0003\u0014\n\u0000\u00b0" +
                    "\u00b2\u0003\u0012\t\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2" +
                    "\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b5" +
                    "\u0003\u0016\u000b\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5" +
                    "\u0001\u0000\u0000\u0000\u00b5\u011b\u0001\u0000\u0000\u0000\u00b6\u00b7" +
                    "\u0003\u0012\t\u0000\u00b7\u00b8\u0003\u0016\u000b\u0000\u00b8\u00ba\u0003" +
                    "\u0014\n\u0000\u00b9\u00bb\u0003\u0018\f\u0000\u00ba\u00b9\u0001\u0000" +
                    "\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u011b\u0001\u0000" +
                    "\u0000\u0000\u00bc\u00bd\u0003\u0012\t\u0000\u00bd\u00be\u0003\u0018\f" +
                    "\u0000\u00be\u00c0\u0003\u0014\n\u0000\u00bf\u00c1\u0003\u0016\u000b\u0000" +
                    "\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000" +
                    "\u00c1\u011b\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u0012\t\u0000\u00c3" +
                    "\u00c4\u0003\u0018\f\u0000\u00c4\u00c6\u0003\u0016\u000b\u0000\u00c5\u00c7" +
                    "\u0003\u0014\n\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001" +
                    "\u0000\u0000\u0000\u00c7\u011b\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003" +
                    "\u0014\n\u0000\u00c9\u00ca\u0003\u0016\u000b\u0000\u00ca\u00cc\u0003\u0012" +
                    "\t\u0000\u00cb\u00cd\u0003\u0018\f\u0000\u00cc\u00cb\u0001\u0000\u0000" +
                    "\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u011b\u0001\u0000\u0000" +
                    "\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d0\u0003\u0018\f\u0000" +
                    "\u00d0\u00d2\u0003\u0012\t\u0000\u00d1\u00d3\u0003\u0016\u000b\u0000\u00d2" +
                    "\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3" +
                    "\u011b\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0014\n\u0000\u00d5\u00d6" +
                    "\u0003\u0018\f\u0000\u00d6\u00d8\u0003\u0016\u000b\u0000\u00d7\u00d9\u0003" +
                    "\u0012\t\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000" +
                    "\u0000\u0000\u00d9\u011b\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0016" +
                    "\u000b\u0000\u00db\u00dc\u0003\u0018\f\u0000\u00dc\u00de\u0003\u0012\t" +
                    "\u0000\u00dd\u00df\u0003\u0014\n\u0000\u00de\u00dd\u0001\u0000\u0000\u0000" +
                    "\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u011b\u0001\u0000\u0000\u0000" +
                    "\u00e0\u00e1\u0003\u0016\u000b\u0000\u00e1\u00e2\u0003\u0018\f\u0000\u00e2" +
                    "\u00e4\u0003\u0014\n\u0000\u00e3\u00e5\u0003\u0012\t\u0000\u00e4\u00e3" +
                    "\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u011b" +
                    "\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u0018\f\u0000\u00e7\u00e8\u0003" +
                    "\u0016\u000b\u0000\u00e8\u00ea\u0003\u0012\t\u0000\u00e9\u00eb\u0003\u0014" +
                    "\n\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000" +
                    "\u0000\u00eb\u011b\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003\u0018\f\u0000" +
                    "\u00ed\u00ee\u0003\u0016\u000b\u0000\u00ee\u00f0\u0003\u0014\n\u0000\u00ef" +
                    "\u00f1\u0003\u0012\t\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1" +
                    "\u0001\u0000\u0000\u0000\u00f1\u011b\u0001\u0000\u0000\u0000\u00f2\u00f3" +
                    "\u0003\u0012\t\u0000\u00f3\u00f4\u0003\u0014\n\u0000\u00f4\u00f5\u0003" +
                    "\u0018\f\u0000\u00f5\u00f6\u0003\u0016\u000b\u0000\u00f6\u011b\u0001\u0000" +
                    "\u0000\u0000\u00f7\u00f8\u0003\u0012\t\u0000\u00f8\u00f9\u0003\u0016\u000b" +
                    "\u0000\u00f9\u00fa\u0003\u0018\f\u0000\u00fa\u00fb\u0003\u0014\n\u0000" +
                    "\u00fb\u011b\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003\u0014\n\u0000\u00fd" +
                    "\u00fe\u0003\u0012\t\u0000\u00fe\u00ff\u0003\u0018\f\u0000\u00ff\u0100" +
                    "\u0003\u0016\u000b\u0000\u0100\u011b\u0001\u0000\u0000\u0000\u0101\u0102" +
                    "\u0003\u0014\n\u0000\u0102\u0103\u0003\u0016\u000b\u0000\u0103\u0104\u0003" +
                    "\u0018\f\u0000\u0104\u0105\u0003\u0012\t\u0000\u0105\u011b\u0001\u0000" +
                    "\u0000\u0000\u0106\u0107\u0003\u0016\u000b\u0000\u0107\u0108\u0003\u0012" +
                    "\t\u0000\u0108\u0109\u0003\u0018\f\u0000\u0109\u010a\u0003\u0014\n\u0000" +
                    "\u010a\u011b\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0016\u000b\u0000" +
                    "\u010c\u010d\u0003\u0014\n\u0000\u010d\u010e\u0003\u0018\f\u0000\u010e" +
                    "\u010f\u0003\u0012\t\u0000\u010f\u011b\u0001\u0000\u0000\u0000\u0110\u0111" +
                    "\u0003\u0018\f\u0000\u0111\u0112\u0003\u0012\t\u0000\u0112\u0113\u0003" +
                    "\u0016\u000b\u0000\u0113\u0114\u0003\u0014\n\u0000\u0114\u011b\u0001\u0000" +
                    "\u0000\u0000\u0115\u0116\u0003\u0018\f\u0000\u0116\u0117\u0003\u0014\n" +
                    "\u0000\u0117\u0118\u0003\u0016\u000b\u0000\u0118\u0119\u0003\u0012\t\u0000" +
                    "\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0082\u0001\u0000\u0000\u0000" +
                    "\u011a\u008c\u0001\u0000\u0000\u0000\u011a\u0096\u0001\u0000\u0000\u0000" +
                    "\u011a\u009e\u0001\u0000\u0000\u0000\u011a\u00a6\u0001\u0000\u0000\u0000" +
                    "\u011a\u00ae\u0001\u0000\u0000\u0000\u011a\u00b6\u0001\u0000\u0000\u0000" +
                    "\u011a\u00bc\u0001\u0000\u0000\u0000\u011a\u00c2\u0001\u0000\u0000\u0000" +
                    "\u011a\u00c8\u0001\u0000\u0000\u0000\u011a\u00ce\u0001\u0000\u0000\u0000" +
                    "\u011a\u00d4\u0001\u0000\u0000\u0000\u011a\u00da\u0001\u0000\u0000\u0000" +
                    "\u011a\u00e0\u0001\u0000\u0000\u0000\u011a\u00e6\u0001\u0000\u0000\u0000" +
                    "\u011a\u00ec\u0001\u0000\u0000\u0000\u011a\u00f2\u0001\u0000\u0000\u0000" +
                    "\u011a\u00f7\u0001\u0000\u0000\u0000\u011a\u00fc\u0001\u0000\u0000\u0000" +
                    "\u011a\u0101\u0001\u0000\u0000\u0000\u011a\u0106\u0001\u0000\u0000\u0000" +
                    "\u011a\u010b\u0001\u0000\u0000\u0000\u011a\u0110\u0001\u0000\u0000\u0000" +
                    "\u011a\u0115\u0001\u0000\u0000\u0000\u011b\u0011\u0001\u0000\u0000\u0000" +
                    "\u011c\u011d\u0005\n\u0000\u0000\u011d\u011e\u0003\"\u0011\u0000\u011e" +
                    "\u011f\u0005\u0016\u0000\u0000\u011f\u0013\u0001\u0000\u0000\u0000\u0120" +
                    "\u0121\u0005\u000b\u0000\u0000\u0121\u0122\u0003\"\u0011\u0000\u0122\u0123" +
                    "\u0005\u0017\u0000\u0000\u0123\u0015\u0001\u0000\u0000\u0000\u0124\u0125" +
                    "\u0005\f\u0000\u0000\u0125\u0126\u0005\u0003\u0000\u0000\u0126\u0127\u0005" +
                    "\u0018\u0000\u0000\u0127\u0017\u0001\u0000\u0000\u0000\u0128\u0129\u0005" +
                    "\r\u0000\u0000\u0129\u012a\u0003\"\u0011\u0000\u012a\u012b\u0005\u0019" +
                    "\u0000\u0000\u012b\u0019\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u000e" +
                    "\u0000\u0000\u012d\u012e\u0003\"\u0011\u0000\u012e\u012f\u0005\u001a\u0000" +
                    "\u0000\u012f\u001b\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u000f\u0000" +
                    "\u0000\u0131\u0132\u0005\u0003\u0000\u0000\u0132\u0133\u0005\u001b\u0000" +
                    "\u0000\u0133\u001d\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0010\u0000" +
                    "\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136\u0137\u0005\u001c\u0000" +
                    "\u0000\u0137\u0138\u0006\u000f\uffff\uffff\u0000\u0138\u001f\u0001\u0000" +
                    "\u0000\u0000\u0139\u013a\u0005\u0011\u0000\u0000\u013a\u013b\u0005\u0004" +
                    "\u0000\u0000\u013b\u013c\u0005\u001d\u0000\u0000\u013c\u013d\u0006\u0010" +
                    "\uffff\uffff\u0000\u013d!\u0001\u0000\u0000\u0000\u013e\u013f\u0007\u0000" +
                    "\u0000\u0000\u013f#\u0001\u0000\u0000\u0000&+=DKRV[_dhmwz\u0084\u0087" +
                    "\u008a\u008e\u0091\u0094\u0099\u009c\u00a1\u00a4\u00a9\u00ac\u00b1\u00b4" +
                    "\u00ba\u00c0\u00c6\u00cc\u00d2\u00d8\u00de\u00e4\u00ea\u00f0\u011a";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}