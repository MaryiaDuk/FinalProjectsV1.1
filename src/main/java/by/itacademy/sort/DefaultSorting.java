package by.itacademy.sort;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@NameOfClass(name = "Сортировка по городам в алфавитном порядке")
public class DefaultSorting implements Comparator<Weather> {
    List<Weather> weathers = new ArrayList<>();

    public void defSort() {
        weathers.addAll(WeatherBase.getInstance().getWeatherBase());
        show(weathers);
    }

    private void show(List<Weather> list) {
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list, new DefaultSorting());
            System.out.println(list.get(i));
        }
    }

    @Override
    public int compare(Weather o1, Weather o2) {
        return o1.getName().compareTo(o2.getName());
    }
}