package com.noirix.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingsReader {

    public static final String GREETINGS_FILE_NAME = "greetings";

    public static final String HELLO_KEY = "hello";

    public static String getProperty(Locale locale, String key) {
        ResourceBundle bundle = ResourceBundle.getBundle(GREETINGS_FILE_NAME, locale);

        return bundle.getString(key);
    }
}
