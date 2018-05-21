package by.itacademy;

import by.itacademy.menu.Menu;
import by.itacademy.statistics.LocationList;
import by.itacademy.weathers.WeatherBase;

public class App {
    public static void main(String[] args) throws Exception {
        WeatherBase.getInstance().create();
        LocationList.getInstance().createLocationList();
        new Menu().start();
    }
}