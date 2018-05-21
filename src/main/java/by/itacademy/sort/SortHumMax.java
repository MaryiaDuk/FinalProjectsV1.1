package by.itacademy.sort;

import by.itacademy.weathers.Weather;

import java.util.Comparator;

public class SortHumMax implements Comparator<Weather> {

    @Override
    public int compare(Weather o1, Weather o2) {
        if (o1.getHumidity() > o2.getHumidity()) return -1;
        else if (o1.getHumidity() < o2.getHumidity()) return 1;
        else return 0;
    }
}
