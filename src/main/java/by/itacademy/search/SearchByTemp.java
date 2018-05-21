package by.itacademy.search;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.List;

@NameOfClass(name = "Поиск по диапозону температур")
public class SearchByTemp {
    private List<Weather> searchResults = new ArrayList<>();

    public List<Weather> find(List<Weather> weathers, int max_t, int min_t) {
        boolean flag = false;
        for (Weather weather : weathers) {
            if (weather.getMax_temp() <= max_t && weather.getMax_temp() >= min_t) {
                searchResults.add(weather);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("По Вашему запросу ничег не найдено!!!");
        }
        return searchResults;
    }

    public void show(List<Weather> list, int max_t, int min_t) {
        List<Weather> list1 = new ArrayList<>();
        list1.addAll(find(list, max_t, min_t));
        for (Weather weather : list1) {
            System.out.println(weather);
        }
    }
}