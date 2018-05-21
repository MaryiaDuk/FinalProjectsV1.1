package by.itacademy.sort;

import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDescription implements Comparator<Weather> {
    List<Weather> list = new ArrayList<>();

    public void descSort() {
        list.addAll(WeatherBase.getInstance().getWeatherBase());
        show(list);
    }

    private void show(List<Weather> list) {
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list, new SortByDescription());
            System.out.println(list.get(i));
        }
    }

    @Override
    public int compare(Weather o1, Weather o2) {
        int result = o1.getDecryption().compareTo(o2.getDecryption());
        return result != 0 ? o1.getDecryption().compareTo(o2.getDecryption()) : o1.getDecryption().compareTo(o2.getDecryption());
    }
}