package by.itacademy.weathers;

public class Weather {
    private String location;
    private String name;
    private int max_temp;
    private int min_temp;
    private int humidity;
    private String decryption;

    @Override
    public String toString() {
        return
                "Location: " + location +
                        ", City: " + name +
                        ", Max temperature: " + max_temp +
                        ", Min temperature: " + min_temp +
                        ", Humidity: " + humidity +
                        ", Weather: " + decryption;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public int getMax_temp() {
        return max_temp;
    }

    public int getMin_temp() {
        return min_temp;
    }

    public String getDecryption() {
        return decryption;
    }

    public int getHumidity() {
        return humidity;
    }

    public static class WeatherBuilder {
        Weather weather = new Weather();

        public static WeatherBuilder createWeatherBuilder() {
            return new WeatherBuilder();
        }

        public WeatherBuilder setLocation(String location) {
            weather.location = location;
            return this;
        }

        public WeatherBuilder setName(String name) {
            weather.name = name;
            return this;
        }

        public WeatherBuilder setMax_T(String max_t) {
            weather.max_temp = Integer.decode(max_t);
            return this;
        }

        public WeatherBuilder setMin_T(String min_t) {
            weather.min_temp = Integer.decode(min_t);
            return this;
        }

        public WeatherBuilder setHumidity(String humidity) {
            weather.humidity = Integer.decode(humidity);
            return this;
        }

        public WeatherBuilder setDescription(String description) {
            weather.decryption = description;
            return this;
        }

        public Weather getWeather() {
            return weather;
        }
    }
}