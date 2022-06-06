# Generated from C:/Users/anbra/Desktop/UTN/2doNivel/Sintaxis y Sem�ntica de los Lenguajes/RSSParser/RSSParser/py/grammar\RSSParser.g4 by ANTLR 4.10.1
# encoding: utf-8
import sys

from antlr4 import *

if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,37,321,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,1,0,1,0,1,0,1,1,1,1,
        1,1,3,1,44,8,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,
        5,1,5,5,5,60,8,5,10,5,12,5,63,9,5,1,5,1,5,5,5,67,8,5,10,5,12,5,70,
        9,5,1,5,1,5,5,5,74,8,5,10,5,12,5,77,9,5,1,5,1,5,5,5,81,8,5,10,5,
        12,5,84,9,5,1,5,3,5,87,8,5,1,5,5,5,90,8,5,10,5,12,5,93,9,5,1,5,3,
        5,96,8,5,1,5,5,5,99,8,5,10,5,12,5,102,9,5,1,5,3,5,105,8,5,1,5,5,
        5,108,8,5,10,5,12,5,111,9,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,3,6,120,
        8,6,1,6,3,6,123,8,6,1,6,1,6,1,7,1,7,1,7,1,7,1,8,1,8,3,8,133,8,8,
        1,8,3,8,136,8,8,1,8,3,8,139,8,8,1,8,1,8,3,8,143,8,8,1,8,3,8,146,
        8,8,1,8,3,8,149,8,8,1,8,1,8,1,8,3,8,154,8,8,1,8,3,8,157,8,8,1,8,
        1,8,1,8,3,8,162,8,8,1,8,3,8,165,8,8,1,8,1,8,1,8,3,8,170,8,8,1,8,
        3,8,173,8,8,1,8,1,8,1,8,3,8,178,8,8,1,8,3,8,181,8,8,1,8,1,8,1,8,
        1,8,3,8,187,8,8,1,8,1,8,1,8,1,8,3,8,193,8,8,1,8,1,8,1,8,1,8,3,8,
        199,8,8,1,8,1,8,1,8,1,8,3,8,205,8,8,1,8,1,8,1,8,1,8,3,8,211,8,8,
        1,8,1,8,1,8,1,8,3,8,217,8,8,1,8,1,8,1,8,1,8,3,8,223,8,8,1,8,1,8,
        1,8,1,8,3,8,229,8,8,1,8,1,8,1,8,1,8,3,8,235,8,8,1,8,1,8,1,8,1,8,
        3,8,241,8,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
        1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
        1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,283,8,8,1,9,1,9,
        1,9,1,9,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,
        12,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,
        15,1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,17,0,0,18,0,2,4,6,8,10,12,
        14,16,18,20,22,24,26,28,30,32,34,0,1,1,0,3,5,362,0,36,1,0,0,0,2,
        40,1,0,0,0,4,47,1,0,0,0,6,50,1,0,0,0,8,53,1,0,0,0,10,57,1,0,0,0,
        12,114,1,0,0,0,14,126,1,0,0,0,16,282,1,0,0,0,18,284,1,0,0,0,20,288,
        1,0,0,0,22,292,1,0,0,0,24,296,1,0,0,0,26,300,1,0,0,0,28,304,1,0,
        0,0,30,308,1,0,0,0,32,313,1,0,0,0,34,318,1,0,0,0,36,37,3,2,1,0,37,
        38,3,8,4,0,38,39,5,0,0,1,39,1,1,0,0,0,40,41,5,31,0,0,41,43,3,4,2,
        0,42,44,3,6,3,0,43,42,1,0,0,0,43,44,1,0,0,0,44,45,1,0,0,0,45,46,
        5,32,0,0,46,3,1,0,0,0,47,48,5,34,0,0,48,49,5,36,0,0,49,5,1,0,0,0,
        50,51,5,35,0,0,51,52,5,37,0,0,52,7,1,0,0,0,53,54,5,6,0,0,54,55,3,
        10,5,0,55,56,5,18,0,0,56,9,1,0,0,0,57,61,5,7,0,0,58,60,3,14,7,0,
        59,58,1,0,0,0,60,63,1,0,0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,64,1,
        0,0,0,63,61,1,0,0,0,64,68,3,18,9,0,65,67,3,14,7,0,66,65,1,0,0,0,
        67,70,1,0,0,0,68,66,1,0,0,0,68,69,1,0,0,0,69,71,1,0,0,0,70,68,1,
        0,0,0,71,75,3,22,11,0,72,74,3,14,7,0,73,72,1,0,0,0,74,77,1,0,0,0,
        75,73,1,0,0,0,75,76,1,0,0,0,76,78,1,0,0,0,77,75,1,0,0,0,78,82,3,
        20,10,0,79,81,3,14,7,0,80,79,1,0,0,0,81,84,1,0,0,0,82,80,1,0,0,0,
        82,83,1,0,0,0,83,86,1,0,0,0,84,82,1,0,0,0,85,87,3,24,12,0,86,85,
        1,0,0,0,86,87,1,0,0,0,87,91,1,0,0,0,88,90,3,14,7,0,89,88,1,0,0,0,
        90,93,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,95,1,0,0,0,93,91,1,
        0,0,0,94,96,3,26,13,0,95,94,1,0,0,0,95,96,1,0,0,0,96,100,1,0,0,0,
        97,99,3,14,7,0,98,97,1,0,0,0,99,102,1,0,0,0,100,98,1,0,0,0,100,101,
        1,0,0,0,101,104,1,0,0,0,102,100,1,0,0,0,103,105,3,12,6,0,104,103,
        1,0,0,0,104,105,1,0,0,0,105,109,1,0,0,0,106,108,3,14,7,0,107,106,
        1,0,0,0,108,111,1,0,0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,112,
        1,0,0,0,111,109,1,0,0,0,112,113,5,19,0,0,113,11,1,0,0,0,114,115,
        5,8,0,0,115,116,3,28,14,0,116,117,3,18,9,0,117,119,3,22,11,0,118,
        120,3,30,15,0,119,118,1,0,0,0,119,120,1,0,0,0,120,122,1,0,0,0,121,
        123,3,32,16,0,122,121,1,0,0,0,122,123,1,0,0,0,123,124,1,0,0,0,124,
        125,5,20,0,0,125,13,1,0,0,0,126,127,5,9,0,0,127,128,3,16,8,0,128,
        129,5,21,0,0,129,15,1,0,0,0,130,132,3,18,9,0,131,133,3,20,10,0,132,
        131,1,0,0,0,132,133,1,0,0,0,133,135,1,0,0,0,134,136,3,22,11,0,135,
        134,1,0,0,0,135,136,1,0,0,0,136,138,1,0,0,0,137,139,3,24,12,0,138,
        137,1,0,0,0,138,139,1,0,0,0,139,283,1,0,0,0,140,142,3,20,10,0,141,
        143,3,18,9,0,142,141,1,0,0,0,142,143,1,0,0,0,143,145,1,0,0,0,144,
        146,3,22,11,0,145,144,1,0,0,0,145,146,1,0,0,0,146,148,1,0,0,0,147,
        149,3,24,12,0,148,147,1,0,0,0,148,149,1,0,0,0,149,283,1,0,0,0,150,
        151,3,22,11,0,151,153,3,18,9,0,152,154,3,20,10,0,153,152,1,0,0,0,
        153,154,1,0,0,0,154,156,1,0,0,0,155,157,3,24,12,0,156,155,1,0,0,
        0,156,157,1,0,0,0,157,283,1,0,0,0,158,159,3,22,11,0,159,161,3,20,
        10,0,160,162,3,18,9,0,161,160,1,0,0,0,161,162,1,0,0,0,162,164,1,
        0,0,0,163,165,3,24,12,0,164,163,1,0,0,0,164,165,1,0,0,0,165,283,
        1,0,0,0,166,167,3,24,12,0,167,169,3,18,9,0,168,170,3,20,10,0,169,
        168,1,0,0,0,169,170,1,0,0,0,170,172,1,0,0,0,171,173,3,22,11,0,172,
        171,1,0,0,0,172,173,1,0,0,0,173,283,1,0,0,0,174,175,3,24,12,0,175,
        177,3,20,10,0,176,178,3,18,9,0,177,176,1,0,0,0,177,178,1,0,0,0,178,
        180,1,0,0,0,179,181,3,22,11,0,180,179,1,0,0,0,180,181,1,0,0,0,181,
        283,1,0,0,0,182,183,3,18,9,0,183,184,3,22,11,0,184,186,3,20,10,0,
        185,187,3,24,12,0,186,185,1,0,0,0,186,187,1,0,0,0,187,283,1,0,0,
        0,188,189,3,18,9,0,189,190,3,24,12,0,190,192,3,20,10,0,191,193,3,
        22,11,0,192,191,1,0,0,0,192,193,1,0,0,0,193,283,1,0,0,0,194,195,
        3,18,9,0,195,196,3,24,12,0,196,198,3,22,11,0,197,199,3,20,10,0,198,
        197,1,0,0,0,198,199,1,0,0,0,199,283,1,0,0,0,200,201,3,20,10,0,201,
        202,3,22,11,0,202,204,3,18,9,0,203,205,3,24,12,0,204,203,1,0,0,0,
        204,205,1,0,0,0,205,283,1,0,0,0,206,207,3,20,10,0,207,208,3,24,12,
        0,208,210,3,18,9,0,209,211,3,22,11,0,210,209,1,0,0,0,210,211,1,0,
        0,0,211,283,1,0,0,0,212,213,3,20,10,0,213,214,3,24,12,0,214,216,
        3,22,11,0,215,217,3,18,9,0,216,215,1,0,0,0,216,217,1,0,0,0,217,283,
        1,0,0,0,218,219,3,22,11,0,219,220,3,24,12,0,220,222,3,18,9,0,221,
        223,3,20,10,0,222,221,1,0,0,0,222,223,1,0,0,0,223,283,1,0,0,0,224,
        225,3,22,11,0,225,226,3,24,12,0,226,228,3,20,10,0,227,229,3,18,9,
        0,228,227,1,0,0,0,228,229,1,0,0,0,229,283,1,0,0,0,230,231,3,24,12,
        0,231,232,3,22,11,0,232,234,3,18,9,0,233,235,3,20,10,0,234,233,1,
        0,0,0,234,235,1,0,0,0,235,283,1,0,0,0,236,237,3,24,12,0,237,238,
        3,22,11,0,238,240,3,20,10,0,239,241,3,18,9,0,240,239,1,0,0,0,240,
        241,1,0,0,0,241,283,1,0,0,0,242,243,3,18,9,0,243,244,3,20,10,0,244,
        245,3,24,12,0,245,246,3,22,11,0,246,283,1,0,0,0,247,248,3,18,9,0,
        248,249,3,22,11,0,249,250,3,24,12,0,250,251,3,20,10,0,251,283,1,
        0,0,0,252,253,3,20,10,0,253,254,3,18,9,0,254,255,3,24,12,0,255,256,
        3,22,11,0,256,283,1,0,0,0,257,258,3,20,10,0,258,259,3,22,11,0,259,
        260,3,24,12,0,260,261,3,18,9,0,261,283,1,0,0,0,262,263,3,22,11,0,
        263,264,3,18,9,0,264,265,3,24,12,0,265,266,3,20,10,0,266,283,1,0,
        0,0,267,268,3,22,11,0,268,269,3,20,10,0,269,270,3,24,12,0,270,271,
        3,18,9,0,271,283,1,0,0,0,272,273,3,24,12,0,273,274,3,18,9,0,274,
        275,3,22,11,0,275,276,3,20,10,0,276,283,1,0,0,0,277,278,3,24,12,
        0,278,279,3,20,10,0,279,280,3,22,11,0,280,281,3,18,9,0,281,283,1,
        0,0,0,282,130,1,0,0,0,282,140,1,0,0,0,282,150,1,0,0,0,282,158,1,
        0,0,0,282,166,1,0,0,0,282,174,1,0,0,0,282,182,1,0,0,0,282,188,1,
        0,0,0,282,194,1,0,0,0,282,200,1,0,0,0,282,206,1,0,0,0,282,212,1,
        0,0,0,282,218,1,0,0,0,282,224,1,0,0,0,282,230,1,0,0,0,282,236,1,
        0,0,0,282,242,1,0,0,0,282,247,1,0,0,0,282,252,1,0,0,0,282,257,1,
        0,0,0,282,262,1,0,0,0,282,267,1,0,0,0,282,272,1,0,0,0,282,277,1,
        0,0,0,283,17,1,0,0,0,284,285,5,10,0,0,285,286,3,34,17,0,286,287,
        5,22,0,0,287,19,1,0,0,0,288,289,5,11,0,0,289,290,3,34,17,0,290,291,
        5,23,0,0,291,21,1,0,0,0,292,293,5,12,0,0,293,294,5,3,0,0,294,295,
        5,24,0,0,295,23,1,0,0,0,296,297,5,13,0,0,297,298,3,34,17,0,298,299,
        5,25,0,0,299,25,1,0,0,0,300,301,5,14,0,0,301,302,3,34,17,0,302,303,
        5,26,0,0,303,27,1,0,0,0,304,305,5,15,0,0,305,306,5,3,0,0,306,307,
        5,27,0,0,307,29,1,0,0,0,308,309,5,16,0,0,309,310,5,4,0,0,310,311,
        5,28,0,0,311,312,6,15,-1,0,312,31,1,0,0,0,313,314,5,17,0,0,314,315,
        5,4,0,0,315,316,5,29,0,0,316,317,6,16,-1,0,317,33,1,0,0,0,318,319,
        7,0,0,0,319,35,1,0,0,0,38,43,61,68,75,82,86,91,95,100,104,109,119,
        122,132,135,138,142,145,148,153,156,161,164,169,172,177,180,186,
        192,198,204,210,216,222,228,234,240,282
    ]

class RSSParser ( Parser ):

    grammarFileName = "RSSParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'<?xml'", "'?>'" ]

    symbolicNames = [ "<INVALID>", "COMMENT", "WS", "URL", "INT", "TXT", 
                      "O_RSS", "O_CHANNEL", "O_IMG", "O_ITEM", "O_TITLE", 
                      "O_DESC", "O_LINK", "O_CATEG", "O_COPYR", "O_URL", 
                      "O_HEIGHT", "O_WIDTH", "C_RSS", "C_CHANNEL", "C_IMG", 
                      "C_ITEM", "C_TITLE", "C_DESC", "C_LINK", "C_CATEG", 
                      "C_COPYR", "C_URL", "C_HEIGHT", "C_WIDTH", "RSS_VERSION", 
                      "OPEN_XML", "CLOSE_XML", "XML_WS", "ATT_VERSION", 
                      "ATT_ENCODING", "XML_VERSION", "XML_ENCODING" ]

    RULE_document = 0
    RULE_xml = 1
    RULE_xml_version = 2
    RULE_xml_encoding = 3
    RULE_rss = 4
    RULE_channel = 5
    RULE_img = 6
    RULE_item = 7
    RULE_in_item = 8
    RULE_title = 9
    RULE_desc = 10
    RULE_link = 11
    RULE_categ = 12
    RULE_copyr = 13
    RULE_url = 14
    RULE_height = 15
    RULE_width = 16
    RULE_txt = 17

    ruleNames =  [ "document", "xml", "xml_version", "xml_encoding", "rss", 
                   "channel", "img", "item", "in_item", "title", "desc", 
                   "link", "categ", "copyr", "url", "height", "width", "txt" ]

    EOF = Token.EOF
    COMMENT=1
    WS=2
    URL=3
    INT=4
    TXT=5
    O_RSS=6
    O_CHANNEL=7
    O_IMG=8
    O_ITEM=9
    O_TITLE=10
    O_DESC=11
    O_LINK=12
    O_CATEG=13
    O_COPYR=14
    O_URL=15
    O_HEIGHT=16
    O_WIDTH=17
    C_RSS=18
    C_CHANNEL=19
    C_IMG=20
    C_ITEM=21
    C_TITLE=22
    C_DESC=23
    C_LINK=24
    C_CATEG=25
    C_COPYR=26
    C_URL=27
    C_HEIGHT=28
    C_WIDTH=29
    RSS_VERSION=30
    OPEN_XML=31
    CLOSE_XML=32
    XML_WS=33
    ATT_VERSION=34
    ATT_ENCODING=35
    XML_VERSION=36
    XML_ENCODING=37

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def xml(self):
            return self.getTypedRuleContext(RSSParser.XmlContext,0)


        def rss(self):
            return self.getTypedRuleContext(RSSParser.RssContext,0)


        def EOF(self):
            return self.getToken(RSSParser.EOF, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_document

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocument" ):
                listener.enterDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocument" ):
                listener.exitDocument(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDocument" ):
                return visitor.visitDocument(self)
            else:
                return visitor.visitChildren(self)




    def document(self):

        localctx = RSSParser.DocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_document)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.xml()
            self.state = 37
            self.rss()
            self.state = 38
            self.match(RSSParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class XmlContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_XML(self):
            return self.getToken(RSSParser.OPEN_XML, 0)

        def xml_version(self):
            return self.getTypedRuleContext(RSSParser.Xml_versionContext,0)


        def CLOSE_XML(self):
            return self.getToken(RSSParser.CLOSE_XML, 0)

        def xml_encoding(self):
            return self.getTypedRuleContext(RSSParser.Xml_encodingContext,0)


        def getRuleIndex(self):
            return RSSParser.RULE_xml

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterXml" ):
                listener.enterXml(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitXml" ):
                listener.exitXml(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitXml" ):
                return visitor.visitXml(self)
            else:
                return visitor.visitChildren(self)




    def xml(self):

        localctx = RSSParser.XmlContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_xml)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(RSSParser.OPEN_XML)
            self.state = 41
            self.xml_version()
            self.state = 43
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RSSParser.ATT_ENCODING:
                self.state = 42
                self.xml_encoding()


            self.state = 45
            self.match(RSSParser.CLOSE_XML)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Xml_versionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ATT_VERSION(self):
            return self.getToken(RSSParser.ATT_VERSION, 0)

        def XML_VERSION(self):
            return self.getToken(RSSParser.XML_VERSION, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_xml_version

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterXml_version" ):
                listener.enterXml_version(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitXml_version" ):
                listener.exitXml_version(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitXml_version" ):
                return visitor.visitXml_version(self)
            else:
                return visitor.visitChildren(self)




    def xml_version(self):

        localctx = RSSParser.Xml_versionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_xml_version)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(RSSParser.ATT_VERSION)
            self.state = 48
            self.match(RSSParser.XML_VERSION)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Xml_encodingContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ATT_ENCODING(self):
            return self.getToken(RSSParser.ATT_ENCODING, 0)

        def XML_ENCODING(self):
            return self.getToken(RSSParser.XML_ENCODING, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_xml_encoding

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterXml_encoding" ):
                listener.enterXml_encoding(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitXml_encoding" ):
                listener.exitXml_encoding(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitXml_encoding" ):
                return visitor.visitXml_encoding(self)
            else:
                return visitor.visitChildren(self)




    def xml_encoding(self):

        localctx = RSSParser.Xml_encodingContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_xml_encoding)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(RSSParser.ATT_ENCODING)
            self.state = 51
            self.match(RSSParser.XML_ENCODING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RssContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_RSS(self):
            return self.getToken(RSSParser.O_RSS, 0)

        def channel(self):
            return self.getTypedRuleContext(RSSParser.ChannelContext,0)


        def C_RSS(self):
            return self.getToken(RSSParser.C_RSS, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_rss

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRss" ):
                listener.enterRss(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRss" ):
                listener.exitRss(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRss" ):
                return visitor.visitRss(self)
            else:
                return visitor.visitChildren(self)




    def rss(self):

        localctx = RSSParser.RssContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_rss)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(RSSParser.O_RSS)
            self.state = 54
            self.channel()
            self.state = 55
            self.match(RSSParser.C_RSS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ChannelContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_CHANNEL(self):
            return self.getToken(RSSParser.O_CHANNEL, 0)

        def title(self):
            return self.getTypedRuleContext(RSSParser.TitleContext,0)


        def link(self):
            return self.getTypedRuleContext(RSSParser.LinkContext,0)


        def desc(self):
            return self.getTypedRuleContext(RSSParser.DescContext,0)


        def C_CHANNEL(self):
            return self.getToken(RSSParser.C_CHANNEL, 0)

        def item(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RSSParser.ItemContext)
            else:
                return self.getTypedRuleContext(RSSParser.ItemContext,i)


        def categ(self):
            return self.getTypedRuleContext(RSSParser.CategContext,0)


        def copyr(self):
            return self.getTypedRuleContext(RSSParser.CopyrContext,0)


        def img(self):
            return self.getTypedRuleContext(RSSParser.ImgContext,0)


        def getRuleIndex(self):
            return RSSParser.RULE_channel

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterChannel" ):
                listener.enterChannel(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitChannel" ):
                listener.exitChannel(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitChannel" ):
                return visitor.visitChannel(self)
            else:
                return visitor.visitChildren(self)




    def channel(self):

        localctx = RSSParser.ChannelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_channel)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(RSSParser.O_CHANNEL)
            self.state = 61
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==RSSParser.O_ITEM:
                self.state = 58
                self.item()
                self.state = 63
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 64
            self.title()
            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==RSSParser.O_ITEM:
                self.state = 65
                self.item()
                self.state = 70
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 71
            self.link()
            self.state = 75
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==RSSParser.O_ITEM:
                self.state = 72
                self.item()
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 78
            self.desc()
            self.state = 82
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 79
                    self.item() 
                self.state = 84
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 86
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RSSParser.O_CATEG:
                self.state = 85
                self.categ()


            self.state = 91
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 88
                    self.item() 
                self.state = 93
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

            self.state = 95
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RSSParser.O_COPYR:
                self.state = 94
                self.copyr()


            self.state = 100
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 97
                    self.item() 
                self.state = 102
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

            self.state = 104
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RSSParser.O_IMG:
                self.state = 103
                self.img()


            self.state = 109
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==RSSParser.O_ITEM:
                self.state = 106
                self.item()
                self.state = 111
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 112
            self.match(RSSParser.C_CHANNEL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_IMG(self):
            return self.getToken(RSSParser.O_IMG, 0)

        def url(self):
            return self.getTypedRuleContext(RSSParser.UrlContext,0)


        def title(self):
            return self.getTypedRuleContext(RSSParser.TitleContext,0)


        def link(self):
            return self.getTypedRuleContext(RSSParser.LinkContext,0)


        def C_IMG(self):
            return self.getToken(RSSParser.C_IMG, 0)

        def height(self):
            return self.getTypedRuleContext(RSSParser.HeightContext,0)


        def width(self):
            return self.getTypedRuleContext(RSSParser.WidthContext,0)


        def getRuleIndex(self):
            return RSSParser.RULE_img

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImg" ):
                listener.enterImg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImg" ):
                listener.exitImg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImg" ):
                return visitor.visitImg(self)
            else:
                return visitor.visitChildren(self)




    def img(self):

        localctx = RSSParser.ImgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_img)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(RSSParser.O_IMG)
            self.state = 115
            self.url()
            self.state = 116
            self.title()
            self.state = 117
            self.link()
            self.state = 119
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RSSParser.O_HEIGHT:
                self.state = 118
                self.height()


            self.state = 122
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RSSParser.O_WIDTH:
                self.state = 121
                self.width()


            self.state = 124
            self.match(RSSParser.C_IMG)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ItemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_ITEM(self):
            return self.getToken(RSSParser.O_ITEM, 0)

        def in_item(self):
            return self.getTypedRuleContext(RSSParser.In_itemContext,0)


        def C_ITEM(self):
            return self.getToken(RSSParser.C_ITEM, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_item

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterItem" ):
                listener.enterItem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitItem" ):
                listener.exitItem(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitItem" ):
                return visitor.visitItem(self)
            else:
                return visitor.visitChildren(self)




    def item(self):

        localctx = RSSParser.ItemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_item)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            self.match(RSSParser.O_ITEM)
            self.state = 127
            self.in_item()
            self.state = 128
            self.match(RSSParser.C_ITEM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class In_itemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def title(self):
            return self.getTypedRuleContext(RSSParser.TitleContext,0)


        def desc(self):
            return self.getTypedRuleContext(RSSParser.DescContext,0)


        def link(self):
            return self.getTypedRuleContext(RSSParser.LinkContext,0)


        def categ(self):
            return self.getTypedRuleContext(RSSParser.CategContext,0)


        def getRuleIndex(self):
            return RSSParser.RULE_in_item

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIn_item" ):
                listener.enterIn_item(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIn_item" ):
                listener.exitIn_item(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIn_item" ):
                return visitor.visitIn_item(self)
            else:
                return visitor.visitChildren(self)




    def in_item(self):

        localctx = RSSParser.In_itemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_in_item)
        self._la = 0 # Token type
        try:
            self.state = 282
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 130
                self.title()
                self.state = 132
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_DESC:
                    self.state = 131
                    self.desc()


                self.state = 135
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_LINK:
                    self.state = 134
                    self.link()


                self.state = 138
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_CATEG:
                    self.state = 137
                    self.categ()


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 140
                self.desc()
                self.state = 142
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_TITLE:
                    self.state = 141
                    self.title()


                self.state = 145
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_LINK:
                    self.state = 144
                    self.link()


                self.state = 148
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_CATEG:
                    self.state = 147
                    self.categ()


                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 150
                self.link()
                self.state = 151
                self.title()
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_DESC:
                    self.state = 152
                    self.desc()


                self.state = 156
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_CATEG:
                    self.state = 155
                    self.categ()


                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 158
                self.link()
                self.state = 159
                self.desc()
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_TITLE:
                    self.state = 160
                    self.title()


                self.state = 164
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_CATEG:
                    self.state = 163
                    self.categ()


                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 166
                self.categ()
                self.state = 167
                self.title()
                self.state = 169
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_DESC:
                    self.state = 168
                    self.desc()


                self.state = 172
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_LINK:
                    self.state = 171
                    self.link()


                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 174
                self.categ()
                self.state = 175
                self.desc()
                self.state = 177
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_TITLE:
                    self.state = 176
                    self.title()


                self.state = 180
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_LINK:
                    self.state = 179
                    self.link()


                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 182
                self.title()
                self.state = 183
                self.link()
                self.state = 184
                self.desc()
                self.state = 186
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_CATEG:
                    self.state = 185
                    self.categ()


                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 188
                self.title()
                self.state = 189
                self.categ()
                self.state = 190
                self.desc()
                self.state = 192
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_LINK:
                    self.state = 191
                    self.link()


                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 194
                self.title()
                self.state = 195
                self.categ()
                self.state = 196
                self.link()
                self.state = 198
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_DESC:
                    self.state = 197
                    self.desc()


                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 200
                self.desc()
                self.state = 201
                self.link()
                self.state = 202
                self.title()
                self.state = 204
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_CATEG:
                    self.state = 203
                    self.categ()


                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 206
                self.desc()
                self.state = 207
                self.categ()
                self.state = 208
                self.title()
                self.state = 210
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_LINK:
                    self.state = 209
                    self.link()


                pass

            elif la_ == 12:
                self.enterOuterAlt(localctx, 12)
                self.state = 212
                self.desc()
                self.state = 213
                self.categ()
                self.state = 214
                self.link()
                self.state = 216
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_TITLE:
                    self.state = 215
                    self.title()


                pass

            elif la_ == 13:
                self.enterOuterAlt(localctx, 13)
                self.state = 218
                self.link()
                self.state = 219
                self.categ()
                self.state = 220
                self.title()
                self.state = 222
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_DESC:
                    self.state = 221
                    self.desc()


                pass

            elif la_ == 14:
                self.enterOuterAlt(localctx, 14)
                self.state = 224
                self.link()
                self.state = 225
                self.categ()
                self.state = 226
                self.desc()
                self.state = 228
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_TITLE:
                    self.state = 227
                    self.title()


                pass

            elif la_ == 15:
                self.enterOuterAlt(localctx, 15)
                self.state = 230
                self.categ()
                self.state = 231
                self.link()
                self.state = 232
                self.title()
                self.state = 234
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_DESC:
                    self.state = 233
                    self.desc()


                pass

            elif la_ == 16:
                self.enterOuterAlt(localctx, 16)
                self.state = 236
                self.categ()
                self.state = 237
                self.link()
                self.state = 238
                self.desc()
                self.state = 240
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==RSSParser.O_TITLE:
                    self.state = 239
                    self.title()


                pass

            elif la_ == 17:
                self.enterOuterAlt(localctx, 17)
                self.state = 242
                self.title()
                self.state = 243
                self.desc()
                self.state = 244
                self.categ()
                self.state = 245
                self.link()
                pass

            elif la_ == 18:
                self.enterOuterAlt(localctx, 18)
                self.state = 247
                self.title()
                self.state = 248
                self.link()
                self.state = 249
                self.categ()
                self.state = 250
                self.desc()
                pass

            elif la_ == 19:
                self.enterOuterAlt(localctx, 19)
                self.state = 252
                self.desc()
                self.state = 253
                self.title()
                self.state = 254
                self.categ()
                self.state = 255
                self.link()
                pass

            elif la_ == 20:
                self.enterOuterAlt(localctx, 20)
                self.state = 257
                self.desc()
                self.state = 258
                self.link()
                self.state = 259
                self.categ()
                self.state = 260
                self.title()
                pass

            elif la_ == 21:
                self.enterOuterAlt(localctx, 21)
                self.state = 262
                self.link()
                self.state = 263
                self.title()
                self.state = 264
                self.categ()
                self.state = 265
                self.desc()
                pass

            elif la_ == 22:
                self.enterOuterAlt(localctx, 22)
                self.state = 267
                self.link()
                self.state = 268
                self.desc()
                self.state = 269
                self.categ()
                self.state = 270
                self.title()
                pass

            elif la_ == 23:
                self.enterOuterAlt(localctx, 23)
                self.state = 272
                self.categ()
                self.state = 273
                self.title()
                self.state = 274
                self.link()
                self.state = 275
                self.desc()
                pass

            elif la_ == 24:
                self.enterOuterAlt(localctx, 24)
                self.state = 277
                self.categ()
                self.state = 278
                self.desc()
                self.state = 279
                self.link()
                self.state = 280
                self.title()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TitleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_TITLE(self):
            return self.getToken(RSSParser.O_TITLE, 0)

        def txt(self):
            return self.getTypedRuleContext(RSSParser.TxtContext,0)


        def C_TITLE(self):
            return self.getToken(RSSParser.C_TITLE, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_title

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTitle" ):
                listener.enterTitle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTitle" ):
                listener.exitTitle(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTitle" ):
                return visitor.visitTitle(self)
            else:
                return visitor.visitChildren(self)




    def title(self):

        localctx = RSSParser.TitleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_title)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 284
            self.match(RSSParser.O_TITLE)
            self.state = 285
            self.txt()
            self.state = 286
            self.match(RSSParser.C_TITLE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DescContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_DESC(self):
            return self.getToken(RSSParser.O_DESC, 0)

        def txt(self):
            return self.getTypedRuleContext(RSSParser.TxtContext,0)


        def C_DESC(self):
            return self.getToken(RSSParser.C_DESC, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_desc

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDesc" ):
                listener.enterDesc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDesc" ):
                listener.exitDesc(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDesc" ):
                return visitor.visitDesc(self)
            else:
                return visitor.visitChildren(self)




    def desc(self):

        localctx = RSSParser.DescContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_desc)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 288
            self.match(RSSParser.O_DESC)
            self.state = 289
            self.txt()
            self.state = 290
            self.match(RSSParser.C_DESC)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LinkContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_LINK(self):
            return self.getToken(RSSParser.O_LINK, 0)

        def URL(self):
            return self.getToken(RSSParser.URL, 0)

        def C_LINK(self):
            return self.getToken(RSSParser.C_LINK, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_link

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLink" ):
                listener.enterLink(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLink" ):
                listener.exitLink(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLink" ):
                return visitor.visitLink(self)
            else:
                return visitor.visitChildren(self)




    def link(self):

        localctx = RSSParser.LinkContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_link)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 292
            self.match(RSSParser.O_LINK)
            self.state = 293
            self.match(RSSParser.URL)
            self.state = 294
            self.match(RSSParser.C_LINK)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CategContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_CATEG(self):
            return self.getToken(RSSParser.O_CATEG, 0)

        def txt(self):
            return self.getTypedRuleContext(RSSParser.TxtContext,0)


        def C_CATEG(self):
            return self.getToken(RSSParser.C_CATEG, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_categ

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCateg" ):
                listener.enterCateg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCateg" ):
                listener.exitCateg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCateg" ):
                return visitor.visitCateg(self)
            else:
                return visitor.visitChildren(self)




    def categ(self):

        localctx = RSSParser.CategContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_categ)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 296
            self.match(RSSParser.O_CATEG)
            self.state = 297
            self.txt()
            self.state = 298
            self.match(RSSParser.C_CATEG)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CopyrContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_COPYR(self):
            return self.getToken(RSSParser.O_COPYR, 0)

        def txt(self):
            return self.getTypedRuleContext(RSSParser.TxtContext,0)


        def C_COPYR(self):
            return self.getToken(RSSParser.C_COPYR, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_copyr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCopyr" ):
                listener.enterCopyr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCopyr" ):
                listener.exitCopyr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCopyr" ):
                return visitor.visitCopyr(self)
            else:
                return visitor.visitChildren(self)




    def copyr(self):

        localctx = RSSParser.CopyrContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_copyr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 300
            self.match(RSSParser.O_COPYR)
            self.state = 301
            self.txt()
            self.state = 302
            self.match(RSSParser.C_COPYR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UrlContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def O_URL(self):
            return self.getToken(RSSParser.O_URL, 0)

        def URL(self):
            return self.getToken(RSSParser.URL, 0)

        def C_URL(self):
            return self.getToken(RSSParser.C_URL, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_url

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUrl" ):
                listener.enterUrl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUrl" ):
                listener.exitUrl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUrl" ):
                return visitor.visitUrl(self)
            else:
                return visitor.visitChildren(self)




    def url(self):

        localctx = RSSParser.UrlContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_url)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 304
            self.match(RSSParser.O_URL)
            self.state = 305
            self.match(RSSParser.URL)
            self.state = 306
            self.match(RSSParser.C_URL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HeightContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._INT = None # Token

        def O_HEIGHT(self):
            return self.getToken(RSSParser.O_HEIGHT, 0)

        def INT(self):
            return self.getToken(RSSParser.INT, 0)

        def C_HEIGHT(self):
            return self.getToken(RSSParser.C_HEIGHT, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_height

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeight" ):
                listener.enterHeight(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeight" ):
                listener.exitHeight(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitHeight" ):
                return visitor.visitHeight(self)
            else:
                return visitor.visitChildren(self)




    def height(self):

        localctx = RSSParser.HeightContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_height)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 308
            self.match(RSSParser.O_HEIGHT)
            self.state = 309
            localctx._INT = self.match(RSSParser.INT)
            self.state = 310
            self.match(RSSParser.C_HEIGHT)
            if int((None if localctx._INT is None else localctx._INT.text)) > 400:
                            raise Exception("height " + (None if localctx._INT is None else localctx._INT.text) + " no debe ser mayor a 400.")
                        
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WidthContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._INT = None # Token

        def O_WIDTH(self):
            return self.getToken(RSSParser.O_WIDTH, 0)

        def INT(self):
            return self.getToken(RSSParser.INT, 0)

        def C_WIDTH(self):
            return self.getToken(RSSParser.C_WIDTH, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_width

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWidth" ):
                listener.enterWidth(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWidth" ):
                listener.exitWidth(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWidth" ):
                return visitor.visitWidth(self)
            else:
                return visitor.visitChildren(self)




    def width(self):

        localctx = RSSParser.WidthContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_width)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 313
            self.match(RSSParser.O_WIDTH)
            self.state = 314
            localctx._INT = self.match(RSSParser.INT)
            self.state = 315
            self.match(RSSParser.C_WIDTH)
            if int((None if localctx._INT is None else localctx._INT.text)) > 144:
                            raise Exception("width " + (None if localctx._INT is None else localctx._INT.text) + " no debe ser mayor a 144.")
                        
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TxtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TXT(self):
            return self.getToken(RSSParser.TXT, 0)

        def URL(self):
            return self.getToken(RSSParser.URL, 0)

        def INT(self):
            return self.getToken(RSSParser.INT, 0)

        def getRuleIndex(self):
            return RSSParser.RULE_txt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTxt" ):
                listener.enterTxt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTxt" ):
                listener.exitTxt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTxt" ):
                return visitor.visitTxt(self)
            else:
                return visitor.visitChildren(self)




    def txt(self):

        localctx = RSSParser.TxtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_txt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 318
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << RSSParser.URL) | (1 << RSSParser.INT) | (1 << RSSParser.TXT))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





