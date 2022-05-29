lexer grammar RSSLexer;

/*
    T* significa que vienen cero o más de un T.
    T+ significa que vienen uno o más de un T.
    T? significa que T es opcional (puede o no venir).
    [0-9] significa que puede venir un 0, un 1, un 2, ..., o un 9.
    [abc] significa que puede venir o un a o un b o un c.
    Ej: [a-zA-Z]+ significa que puede venir cualquier palabra.
*/
COMMENT     :   '<!--' .*? '-->'    -> channel(HIDDEN); // 'channel(HIDDEN)' hace que el parser ignore el token
WS          :   [ \t\r\n]+      -> skip ; // 'skip' hace que el lexer ignore  el token, lo descarta

/*
    Toda URL o INT es también un TXT válido.
    ANTLR resuelve esa ambiguedad priorizando el token definido primero.
*/
URL         :   PROTOCOL LOGIN? DOM (PORT)? ('/' ROUTE?)? QUERY? FRAG? ;
INT         :   [0-9]+ ;
TXT         :   ~[<]+ ;

// fragmentos que componen el token URL. No son tokens en sí mismos, solo partes del token URL
fragment    PROTOCOL    :   URL_STR '://' ;
fragment    LOGIN       :   URL_STR (':' URL_STR)? '@' ;
fragment    DOM         :   URL_STR ('.' URL_STR)* ;
fragment    PORT        :   ':' INT ;
fragment    ROUTE       :   URL_STR ('/' URL_STR)* '/'? ;
fragment    QUERY       :   '?' QUERY_PARAM ('&' QUERY_PARAM)* ;
fragment    FRAG        :   '#' URL_STR ;
fragment    QUERY_PARAM :   URL_STR ('=' URL_STR)? ;
fragment    URL_STR     :   INT | [a-zA-Z~0-9] [a-zA-Z0-9.+-]* ; // string dentro de una url

/*
    Se junta el '<' con el nombre de la etiqueta porque no pueden estar separados por espacios blancos. Ej: '<link', '</title', pero no '< link', '< / title'.
    Esto facilita la creación de las reglas del parser.
    'WS? '>'' permite que haya whitespace entre el nombre y '>'.
    Por especificación de XML, una etiqueta puede ser, por ejemplo, '<link  >'.
*/
O_RSS       :    '<rss' WS 'version' WS? '=' WS? RSS_VERSION WS? '>' ;
O_CHANNEL   :   '<channel'      WS? '>' ;   // O de OPEN_tag, etiquetas de apertura
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

C_RSS       :   '</rss'         WS? '>' ;	// C de CLOSE_tag, etiquetas de cierre
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

RSS_VERSION :   '"2.0"'        // soportamos la especificación de RSS 2.0
            |   '\'2.0\''
            ;

OPEN_XML    :   '<?xml'     -> pushMode(XML) ;
/*
    Dentro de la etiqueta <?xml...?>, su string de atributos ' version="1.0" encoding="UTF-8"?>' es también un token
    TXT válido. Esto se debe a que ante una ambigüedad de tokens, ANTLRv4 prioriza al token que más caracteres matchea.
    En este caso, ' version="1.0" encoding="UTF-8"?>' es más largo que 'version'. Nosotros queremos una división más
    granular de la etiqueta de apertura. Por lo tanto, usamos 'pushMode(XML)' para evitar este comportamiento default.

    En modo XML, el lexer solo lee tokens que estén definidos dentro del modo XML, hasta que haya un 'popMode'.
    Se puede pensar al modo XML como un sub-lexer de lo que esta dentro de la etiqueta <?xml...?>.
*/
mode XML;
CLOSE_XML   :  '?>'     -> popMode ;    // 'popMode' saca al lexer del modo XML, es el token de cierre de la etiqueta <?xml...?>
XML_WS      :   [ \t\r\n]+      -> skip ;

ATT_VERSION :   'version' XML_WS? '=' ;
ATT_ENCODING:   'encoding' XML_WS? '=' ;

XML_VERSION :   '"1.0"'     // Según especificación de RSS 2.0, la versión XML debe ser 1.0
            |   '\'1.0\''
            ;

XML_ENCODING:   '"' [A-Za-z] [A-Za-z0-9._\-]* '"'   // Según especificación de XML 1.0
            |   '\'' [A-Za-z] [A-Za-z0-9._\-]* '\''
            ;
