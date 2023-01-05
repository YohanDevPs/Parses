package conversors;

import org.json.JSONObject;
import org.json.XML;

public class Parsers {

    public static JSONObject XMLToJson(String xml) {
        return XML.toJSONObject(xml);
    }

    public static String JsonToXML(JSONObject object) {
        return  XML.toString(object);
    }
}
