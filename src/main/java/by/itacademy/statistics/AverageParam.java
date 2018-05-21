package by.itacademy.statistics;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherBase;

import java.util.*;

@NameOfClass(name = "Вычисление средней влажности и температуры")
public class AverageParam {
    private List<Weather> list = new ArrayList<>();
    private HashMap<String, Double> hashMapTemp = new HashMap<>();
    private HashMap<String, Double> hashMapHum = new HashMap<>();
    private List<String> locationList = new ArrayList<>();

    public HashMap<String, Double> getAverageTemp() {
        list.addAll(WeatherBase.getInstance().getWeatherBase());
        int tmp = 0;
        locationList.addAll(LocationList.getInstance().getLocationList());
        for (String aLocationList : locationList) {
            double averageTemp = 0;
            for (Weather weather : list) {
                if (aLocationList.equals(weather.getLocation())) {
                    averageTemp += weather.getMax_temp();
                    tmp++;
                }
            }

            hashMapTemp.put(aLocationList, averageTemp / tmp);
            tmp = 0;
        }
        return hashMapTemp;
    }

    public HashMap<String, Double> getAverageHum() {
        list.addAll(WeatherBase.getInstance().getWeatherBase());
        int tmp = 0;
        locationList.addAll(LocationList.getInstance().getLocationList());
        for (String aLocationList : locationList) {
            double averageHum = 0;
            for (Weather weather : list) {
                if (aLocationList.equals(weather.getLocation())) {
                    averageHum+= weather.getHumidity();
                    tmp++;
                }
            }
            hashMapHum.put(aLocationList, averageHum / tmp);
            tmp = 0;
        }
        return hashMapHum ;
    }

    public void showTemp() {
        HashMap<String, Double> showHashMap = new HashMap<>();
        showHashMap.putAll(getAverageTemp());
        for (String key : showHashMap.keySet()) {
            String value = showHashMap.get(key).toString();
            System.out.println(key + " " + value);
        }
    }
}