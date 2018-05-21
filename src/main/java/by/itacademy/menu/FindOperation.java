package by.itacademy.menu;

import by.itacademy.annotations.NameOfClass;
import by.itacademy.menu.InputChoice;
import by.itacademy.menu.MenuSkin;
import by.itacademy.menu.Operation;
import by.itacademy.search.SearchByCity;
import by.itacademy.search.SearchByTemp;
import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherBase;

import java.util.ArrayList;
import java.util.List;
@NameOfClass(name = "Операции поиска")
public class FindOperation extends InputChoice implements Operation, MenuSkin {
    private List<Weather> list = new ArrayList<>();

    private void find(int choice) {
        list.addAll(WeatherBase.getInstance().getWeatherBase());
        if (choice == 1) {
            System.out.println("Введите город:");
            String name = inputName();
            new SearchByCity().show(list, name);
        } else if (choice == 2) {
            System.out.println("Введите максимальную и минимальную температуры: ");
            int max = input();
            int min = input();
            new SearchByTemp().show(list, max, min);
        }
    }

    @Override
    public void execute() {
        find(skin());
    }

    @Override
    public int skin() {
        System.out.println("Поиск :");
        System.out.println("1 - По городу.");
        System.out.println("2 - По диапозону максимальной и минимальной температур.");
        return input();
    }

    @Override
    public int input() {
        return super.input();
    }
}