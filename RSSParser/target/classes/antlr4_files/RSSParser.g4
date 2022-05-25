parser grammar RSSParser;

options { tokenVocab=RSSLexer; }    // importar los tokens de RSSLexer
  
document    :	xml rss EOF ;       // producción inicial (document es sigma)

xml         :	'<?xml' xml_version xml_encoding? '?>' ;

xml_version :   'version' '=' XML_VERSION ;

xml_encoding:   'encoding' '=' XML_ENCODING ;

rss         :   O_RSS channel C_RSS ;

channel     :   O_CHANNEL item* title item* link item* desc item* categ? item* copyr? item* img? item* C_CHANNEL ;

img         :   O_IMG url title link height? width? C_IMG ;

item        :   O_ITEM in_item C_ITEM ;

in_item
    :   title   desc?   link?   categ?    // 3 elementos opcionales
    |   desc    title?  link?   categ?
    |   link    title   desc?   categ?     // 2 elementos opcionales
    |   link    desc    title?  categ?
    |   categ   title   desc?   link?
    |   categ   desc    title?  link?
    |   title   link    desc    categ?      // 1 elemento opcional
    |   title   categ   desc    link?
    |   title   categ   link    desc?
    |   desc    link    title   categ?
    |   desc    categ   title   link?
    |   desc    categ   link    title?
    |   link    categ   title   desc?
    |   link    categ   desc    title?
    |   categ   link    title   desc?
    |   categ   link    desc    title?
    |   title   desc    categ   link       // ningún elemento opcional
    |   title   link    categ   desc
    |   desc    title   categ   link
    |   desc    link    categ   title
    |   link    title   categ   desc
    |   link    desc    categ   title
    |   categ   title   link    desc
    |   categ   desc    link    title
    ;

title       :   O_TITLE     TXT C_TITLE ;
desc        :   O_DESC      TXT C_DESC ;
link        :   O_LINK      URL C_LINK ;
categ       :   O_CATEG     TXT C_CATEG ;
copyr       :   O_COPYR     TXT C_COPYR ;
url         :   O_URL       URL C_URL ;
height      :   O_HEIGHT    INT C_HEIGHT ;
width       :   O_WIDTH     INT C_WIDTH ;
