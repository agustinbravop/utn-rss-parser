parser grammar RSSParser;

options { tokenVocab=RSSLexer; }    // importar los tokens de RSSLexer
  
document    :	xml rss EOF ;       // producción inicial (document es sigma)

xml         :	'<?xml' xml_version xml_encoding? '?>' ;

xml_version :   ATT_VERSION XML_VERSION ;

xml_encoding:   ATT_ENCODING XML_ENCODING ;

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

title       :   O_TITLE     txt C_TITLE ;
desc        :   O_DESC      txt C_DESC ;
link        :   O_LINK      URL C_LINK ;
categ       :   O_CATEG     txt C_CATEG ;
copyr       :   O_COPYR     txt C_COPYR ;
url         :   O_URL       URL C_URL ;

height      :   O_HEIGHT    INT C_HEIGHT
            {if int($INT.text) > 400:
                raise Exception("height " + $INT.text + " no debe ser mayor a 400.")
            }
            ;

width       :   O_WIDTH     INT C_WIDTH
            {if int($INT.text) > 144:
                raise Exception("width " + $INT.text + " no debe ser mayor a 144.")
            }
            ;

txt         :   (TXT | URL | INT) ;
