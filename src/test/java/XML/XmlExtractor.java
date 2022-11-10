package XML;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
public class XmlExtractor {
    @Test
    public void extractXML()
    {
        try {
            File file = new File(System.getProperty("user.dir") + "/src/test/java/XML/property.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("address");
            for (int i = 0; i < nodeList.getLength(); ++i) {
                Node node = nodeList.item(i);
                System.out.println("\nNode Name :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element tElement = (Element)node;
                    System.out.println("House Owner: " + tElement.getElementsByTagName("HouseOwner").item(0).getTextContent());
                    System.out.println("House: " + tElement.getElementsByTagName("house").item(0).getTextContent());
                    System.out.println("Street: " + tElement.getElementsByTagName("street").item(0).getTextContent());
                    System.out.println("City: " + tElement.getElementsByTagName("city").item(0).getTextContent());
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}