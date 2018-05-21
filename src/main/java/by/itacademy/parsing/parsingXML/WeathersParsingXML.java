package by.itacademy.parsing.parsingXML;

import by.itacademy.weathers.Weather;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

import java.util.List;

public class WeathersParsingXML {
    private List<Weather> listOfStudent = new ArrayList<>();

    public List<Weather> parseWeather(Document document) {
        NodeList nList = document.getElementsByTagName("place");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nNode;
                createListOfWeather(element, document);
            }
        }
        return listOfStudent;
    }

    private void createListOfWeather(Element element, Document document) {
        this.listOfStudent.add(Weather.WeatherBuilder.createWeatherBuilder()
                .setLocation(new ParsingLocation().locationsParsing(document))
                .setName(element.getElementsByTagName("name").item(0).getTextContent())
                .setMax_T(element.getElementsByTagName("temp_max").item(0).getTextContent())
                .setMin_T(element.getElementsByTagName("temp_min").item(0).getTextContent())
                .setHumidity(element.getElementsByTagName("humidity").item(0).getTextContent())
                .setDescription(element.getElementsByTagName("description").item(0).getTextContent())
                .getWeather());
    }
}