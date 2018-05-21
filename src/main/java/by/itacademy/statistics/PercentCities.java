package by.itacademy.statistics;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.weathers.Weather;

import java.util.HashMap;
import java.util.List;

@NameOfClass(name = "Вычисление % городов с температурой выше средней")
public class PercentCities {
    private HashMap<String, Double> averageTemp = new HashMap<>();
    private double tmp = 0;
    private double count = 0;

    public void showPercent(List<Weather> weathers) {
        averageTemp.putAll(new AverageParam().getAverageTemp());
        for (String key : averageTemp.keySet()) {
            Double value = averageTemp.get(key);
            for (Weather weather : weathers) {
                if (key.equals(weather.getLocation()) && weather.getMax_temp() > value) tmp++;
                if (key.equals(weather.getLocation())) count++;
            }
            System.out.println(key + " " + tmp / count * 100 + "%");
        }
    }
}