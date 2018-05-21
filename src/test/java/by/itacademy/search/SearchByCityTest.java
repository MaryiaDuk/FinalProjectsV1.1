package by.itacademy.search;

import by.itacademy.search.SearchByCity;
import by.itacademy.weathers.Weather;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchByCityTest {
    @Test
    public void searchTest(){
        List<Weather> list = new ArrayList<>();
        List<Weather> tmp = new ArrayList<>();
        String name = "Вена";
        list.add(new Weather.WeatherBuilder().setLocation("Asia").setName("Пекин").setMax_T("20").setMin_T("15").setDescription("rainy").setHumidity("30").getWeather());
        list.add(new Weather.WeatherBuilder().setLocation("Europe").setName("Вена").setMax_T("21").setMin_T("15").setDescription("sunny").setHumidity("25").getWeather());
        list.add(new Weather.WeatherBuilder().setLocation("Europe").setName("Осло").setMax_T("20").setMin_T("15").setDescription("sunny").setHumidity("27").getWeather());
        for(Weather weather: list){
            if(weather.getName().equals(name)) tmp.add(weather);
        }
        assertEquals(new SearchByCity().find(list, name), tmp);
    }
}