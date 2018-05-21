package by.itacademy.parsing.parsingJSON;

import by.itacademy.weathers.Weather;
import com.google.gson.*;

import java.lang.reflect.Type;

public class WeatherJSONDeserializer implements JsonDeserializer<Weather>{

    @Override
    public Weather deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject json = jsonElement.getAsJsonObject();

            return Weather.WeatherBuilder.createWeatherBuilder()
                .setLocation(json.get("location").getAsString())
                .setName(json.get("name").getAsString())
                .setMax_T(json.get("temp_max").getAsString())
                .setMin_T(json.get("temp_min").getAsString())
                .setHumidity(json.get("humidity").getAsString())
                .setDescription(json.get("description").getAsString()).getWeather();
        }
}
