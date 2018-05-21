package by.itacademy.sort;

import by.itacademy.weathers.Weather;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class SortByDescriptionTest {
    @Test
    public void SortByDescTest() {
        List<Weather> list = new ArrayList<>();
        TreeSet<Weather> sortedList = new TreeSet<>(new SortByDescription());
        list.add(Weather.WeatherBuilder.createWeatherBuilder().setLocation("Europe")
                .setName("Вена").setMax_T("25").setMin_T("10").setHumidity("50").setDescription("rainy").getWeather());
        list.add(Weather.WeatherBuilder.createWeatherBuilder().setLocation("Europe")
                .setName("Прага").setMax_T("20").setMin_T("8").setHumidity("30").setDescription("sunny").getWeather());
        sortedList.addAll(list);
        assertEquals(list, new ArrayList<Weather>(sortedList));
    }
}
