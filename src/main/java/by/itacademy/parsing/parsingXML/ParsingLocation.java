package by.itacademy.parsing.parsingXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParsingLocation {
    public String locationsParsing(Document document) {
        String location = null;
        NodeList nList = document.getElementsByTagName("location");
        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nNode;
                location = element.getAttribute("name");
            }
        }
        return location;
    }
}