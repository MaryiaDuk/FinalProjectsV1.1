package by.itacademy.menu;

import by.itacademy.menu.InputChoice;
import by.itacademy.menu.MenuSkin;
import by.itacademy.menu.Operation;
import by.itacademy.statistics.AverageHumidity;
import by.itacademy.statistics.AverageParam;
import by.itacademy.statistics.PercentCities;
import by.itacademy.weathers.WeatherBase;

public class StatisticOperation extends InputChoice implements Operation, MenuSkin {

    public void showStatistic(int choice) {
        if (choice == 1) {
            new AverageParam().showTemp();
        }
        if (choice == 2) {
            new PercentCities().showPercent(WeatherBase.getInstance().getWeatherBase());
        }
        if (choice == 3) {
            new AverageHumidity().showAverageHumidity(WeatherBase.getInstance().getWeatherBase());
        }
    }

    @Override
    public int skin() {
        System.out.println("Показать статистику по регионам");
        System.out.println("1 - Средняя температура");
        System.out.println("2 - % городов с темперотурой выше средней");
        System.out.println("3 - Города с влажность наиболее близкой к средней");
        return input();
    }

    @Override
    public void execute() {
        showStatistic(skin());
    }
}