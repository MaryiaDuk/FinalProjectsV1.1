package by.itacademy.statistics;


import by.itacademy.annotations.NameOfClass;
import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherBase;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@NameOfClass(name = "Создания списка регионов")
public class LocationList {
    private List<String> locationList = new ArrayList<>();
    private static LocationList instance = null;

    private LocationList() {
    }

    public static LocationList getInstance(){
        if (instance==null) instance=new LocationList();
        return instance;
    }
    public List<String> createLocationList() {
        Set<String> locationListSet = new LinkedHashSet<>();
        for (Weather aList : WeatherBase.getInstance().getWeatherBase()) {
            locationListSet.add(aList.getLocation());
            locationList.addAll(locationListSet);
        }
        return locationList;
    }

    public List<String> getLocationList(){
        return locationList;
    }
}