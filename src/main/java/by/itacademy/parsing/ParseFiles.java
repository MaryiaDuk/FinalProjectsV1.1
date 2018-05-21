package by.itacademy.parsing;

import by.itacademy.weathers.Weather;

import java.util.List;

public interface ParseFiles {
    List<Weather> read() throws  Exception;
}
