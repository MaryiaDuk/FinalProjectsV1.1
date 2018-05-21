package by.itacademy.threads;

import by.itacademy.parsing.parsingJSON.ParsingJSON;
import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.List;

public class ParseJSONThread implements Runnable{
    private Thread thread;
    private List<Weather> list = new ArrayList<>();

    public ParseJSONThread() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            list.addAll(new ParsingJSON().read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Weather> getList() {
        return list;
    }

    public Thread getThread() {
        return thread;
    }
}
