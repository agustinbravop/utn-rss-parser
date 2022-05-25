lexer grammar RSSLexer;

/*
    T* significa que vienen cero o más de un T
    T+ significa que vienen uno o más de un T
    T? significa que T es opcional (puede o no venir)
    [0-9] significa que puede venir un 0, 1, 2, ..., o 9.
    [TSR] significa que puede venir o un T o un S o un R.
*/
COMMENT     :   '<!--' .*? '-->' ;
WS          :   [ \t\r\n]+     -> skip ; // WhiteSpace, espacio en blanco

URL         :   PROTOCOL LOGIN? DOM (PORT)? ('/' ROUTE?)? QUERY? FRAG? ;
INT         :   [0-9]+ ;
TXT         :   ~[<]+ ; // ANTLR resuelve la ambiguedad entre URL y TXT priorizando el token definido primero (URL)

// fragmentos que componen el token URL. No son tokens en sí mismos, solo partes del token URL
fragment
PROTOCOL    :   URL_STR '://' ;
fragment
LOGIN       :   URL_STR (':' URL_STR)? '@' ;
fragment
DOM         :   URL_STR ('.' URL_STR)* ;
fragment
PORT        :   ':' INT ;
fragment
ROUTE       :   URL_STR ('/' URL_STR)* '/'? ;
fragment
QUERY       :   '?' QUERY_PARAM ('&' QUERY_PARAM)* ;
fragment
FRAG        :   '#' URL_STR ;
fragment
QUERY_PARAM :   URL_STR ('=' URL_STR)? ;
fragment
URL_STR     :   [a-zA-Z~0-9] [a-zA-Z0-9.+-]*	// string dentro de una url
            |   INT ;

/*
    Se junta el '<' con el nombre de la etiqueta porque no pueden estar separados por espacios blancos.
    Esto facilita la creación de las reglas del parser. El (WS? '>') permite que haya whitespace entre el nombre y '>'.
*/
O_RSS       :    '<rss' WS 'version' WS? '=' WS? '"2.0"' WS? '>' ;  // O de OPEN_tag
O_CHANNEL   :   '<channel'      WS? '>' ;
O_IMG       :   '<image'        WS? '>' ;
O_ITEM      :   '<item'         WS? '>' ;
O_TITLE     :   '<title'        WS? '>' ;
O_DESC      :   '<description'  WS? '>' ;
O_LINK      :   '<link'         WS? '>' ;
O_CATEG     :   '<category'     WS? '>' ;
O_COPYR     :   '<copyright'    WS? '>' ;
O_URL       :   '<url'          WS? '>' ;
O_HEIGHT    :   '<height'       WS? '>' ;
O_WIDTH     :   '<width'        WS? '>' ;

C_RSS       :   '</rss'         WS? '>' ;	// C de CLOSE_tag
C_CHANNEL   :   '</channel'     WS? '>' ;
C_IMG       :   '</image'       WS? '>' ;
C_ITEM      :   '</item'        WS? '>' ;
C_TITLE     :   '</title'       WS? '>' ;
C_DESC      :   '</description' WS? '>' ;
C_LINK      :   '</link'        WS? '>' ;
C_CATEG     :   '</category'    WS? '>' ;
C_COPYR     :   '</copyright'   WS? '>' ;
C_URL       :   '</url'         WS? '>' ;
C_HEIGHT    :   '</height'      WS? '>' ;
C_WIDTH     :   '</width'       WS? '>' ;

OPEN_XML    :   '<?xml'     -> pushMode(XML) ;
/*
    pushMode(INSIDE) pone al lexer en modo XML. XML es un nombre arbitrario.
    Así, solo interpreta tokens que estén definidos en el modo XML hasta que haya un popMode que lo saque del modo.
    XML es un sub-lexer de todo lo que este dentro de la etiqueta xml.
    Se usa para que el token TXT no abarque todos los atributos (ante una ambigüedad, ANTLRv4 prioriza al
    token que más caracteres matchea. Si hay empate, prioriza al token que se definió primero en la gramática)
    Sin usar mode XML, sucedería un token TXT con los atributos, por ejemplo ' version="1.0" encoding="UTF-8"?>'
*/
mode XML;
CLOSE_XML   :  '?>'     -> popMode ;    // popMode saca al lexer del modo XML

ATT_VER     :   'version' ;
ATT_ENC     :   'encoding' ;
EQUALS      :   '=' ;
XML_WS   :   [ \t\r\n]+      -> skip ;

XML_VERSION :   '"' '1.' INT '"'        // Según especificación de XML
            |   '\'' '1.' INT '\''
            ;

XML_ENCODING:   '"' [A-Za-z] [A-Za-z0-9._\-]* '"'	// Según especificación de XML
            |   '\'' [A-Za-z] [A-Za-z0-9._\-]* '\''
            ;
