package by.itacademy.parsing.parsingXML;

import by.itacademy.parsing.ParseFiles;
import by.itacademy.weathers.Weather;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ParsingXML implements ParseFiles {
    private List<Weather> weathers = new ArrayList<>();

    @Override
    public List<Weather> read(){
        try {
            URL url = new URL("https://raw.githubusercontent.com/MaryiaDuk/weather/master/Weather1.xml");
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputStream in = url.openStream();
            Document document = db.parse(in);
            new WeathersParsingXML().parseWeather(document);
            weathers.addAll( new WeathersParsingXML().parseWeather(document));
            in.close();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e);
            System.out.println("Ошибка чтения XML!!!");
        }
        return weathers;
    }
}