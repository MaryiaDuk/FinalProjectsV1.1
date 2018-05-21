package by.itacademy.search;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.List;

@NameOfClass(name = "Поиск по городу")
public class SearchByCity {
private List<Weather> searchResults = new ArrayList<>();

    public List<Weather> find(List<Weather> weathers, String name) {
        boolean flag = false;
        for (Weather weather : weathers) {
            if (weather.getName().equals(name)) {
                searchResults.add(weather);
                flag = true;
            }
        }
        if (flag==false) {
            System.out.println("По Вашему запросу ничег не найдено!!!");
        }
        return searchResults;
    }

    public void show(List<Weather> list, String name){
        List<Weather> list1 = new ArrayList<>();
        list1.addAll(find(list, name));
        for(Weather weather: list1){
            System.out.println(weather);
        }
    }
}