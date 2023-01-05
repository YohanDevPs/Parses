package conversors;

import org.json.JSONObject;
import org.json.XML;

/**
 * To parse JSON to XML download a jar librarie from {@link <a href="https://github.com/stleary/JSON-java">...</a>}
 */

public class Parsers {

    public static JSONObject XMLToJson(String xml) {
        return XML.toJSONObject(xml);
    }

    public static String JsonToXML(JSONObject object) {
        return  XML.toString(object);
    }
}
