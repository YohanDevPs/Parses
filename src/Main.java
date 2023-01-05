import conversors.Parsers;
import org.json.XML;

public class Main {
    public static void main(String[] args) {

        String xmlString = "<note>" +
                "<to>Tove</to>" +
                "<from>Jani</from>" +
                "<heading>Reminder</heading>" +
                "<body>Dont forget me this weekend!</body>" +
                "</note>";

        var convertedJson = Parsers.XMLToJson(xmlString);
        System.out.println(convertedJson);

        var convertedXML = Parsers.JsonToXML(convertedJson);
        System.out.println(convertedXML);
    }
}