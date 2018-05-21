package by.itacademy.weathers;

import by.itacademy.threads.ParseJSONThread;
import by.itacademy.threads.ParseXMLThread;

import java.util.ArrayList;
import java.util.List;

public class WeatherBase {
    private List<Weather> weatherBase = new ArrayList<>();
    private static WeatherBase instance = null;

    private WeatherBase() {
    }

    public static WeatherBase getInstance() {
        if (instance == null) instance = new WeatherBase();
        return instance;
    }

   public List<Weather> create(){
       ParseXMLThread xmlThreads = new ParseXMLThread();
       ParseJSONThread jsonThread = new ParseJSONThread();
       try {
           xmlThreads.getThread().join();
           weatherBase = xmlThreads.getList();
            jsonThread.getThread().join();
            weatherBase.addAll(jsonThread.getList());
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       return weatherBase;
   }

    public List<Weather> getWeatherBase() {
        return weatherBase;
    }
}