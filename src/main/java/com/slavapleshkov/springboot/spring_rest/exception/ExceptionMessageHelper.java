package com.slavapleshkov.springboot.spring_rest.exception;

public class ExceptionMessageHelper {

    private ExceptionMessageHelper() {}

    public static String entityNotFoundMsg(int id) {
        return String.format("Entity with id: %d not found", id);
    }

}
