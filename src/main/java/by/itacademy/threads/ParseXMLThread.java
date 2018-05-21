package by.itacademy.threads;

import by.itacademy.parsing.parsingXML.ParsingXML;
import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.List;

public class ParseXMLThread implements Runnable {
    private Thread thread;
    private List<Weather> list = new ArrayList<>();

    public ParseXMLThread() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        list.addAll(new ParsingXML().read());
    }

    public List<Weather> getList() {
        return list;
    }

    public Thread getThread() {
        return thread;
    }
}
