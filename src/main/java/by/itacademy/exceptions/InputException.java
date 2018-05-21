package by.itacademy.exceptions;

import java.util.InputMismatchException;

public class InputException extends Exception{
    public InputException(String message) {
        super(message);
    }

    public InputException() {
        super();
    }
}
