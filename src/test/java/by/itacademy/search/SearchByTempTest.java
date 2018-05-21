package by.itacademy.search;

import by.itacademy.search.SearchByTemp;
import by.itacademy.weathers.Weather;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchByTempTest {
    @Test
    public void searchTest() {
        List<Weather> list = new ArrayList<>();
        List<Weather> tmp = new ArrayList<>();
        int max_t = 20;
        int min_t = 10;
        list.add(new Weather.WeatherBuilder().setLocation("Asia").setName("Пекин").setMax_T("20").setMin_T("15").setDescription("rainy").setHumidity("30").getWeather());
        list.add(new Weather.WeatherBuilder().setLocation("Europe").setName("Вена").setMax_T("21").setMin_T("15").setDescription("sunny").setHumidity("25").getWeather());
        list.add(new Weather.WeatherBuilder().setLocation("Europe").setName("Осло").setMax_T("20").setMin_T("15").setDescription("sunny").setHumidity("27").getWeather());
        for (Weather weather : list) {
            if(weather.getMax_temp()<=max_t && weather.getMax_temp()>=min_t)tmp.add(weather);
        }
        assertEquals(new SearchByTemp().find(list, max_t, min_t), tmp);
    }
}
