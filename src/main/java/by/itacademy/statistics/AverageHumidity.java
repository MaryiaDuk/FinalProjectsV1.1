package by.itacademy.statistics;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.sort.SortHumMax;
import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@NameOfClass(name = "Вывод влажности близкой к средней по регионам")
public class AverageHumidity {
    private List<Weather> listMin = new ArrayList<>();
    private List<Weather> listMax = new ArrayList<>();
    private HashMap<String, Double> averageTemp = new HashMap<>();


    public void showAverageHumidity(List<Weather> weathers) {
        averageTemp.putAll(new AverageParam().getAverageHum());
        for (String key : averageTemp.keySet()) {
            Double value = averageTemp.get(key);
            for (Weather weather : weathers) {
                if (key.equals(weather.getLocation()) && weather.getHumidity() > value) {
                    listMax.add(weather);
                }
                if (key.equals(weather.getLocation()) && weather.getHumidity() < value) {
                    listMin.add(weather);
                }
            }
            System.out.println("Средняя влажность:" + key + " " + value);
            Collections.sort(listMin, new SortHumMax());
            Collections.reverse(listMax);
            System.out.println(listMax.get(0).toString());
            System.out.println(listMin.get(0).toString());
            listMax.clear();
        }
    }
}
