package com.noirix.locale;

import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());

        Locale canada = Locale.CANADA;
        Locale france = Locale.UK;

        System.out.println(canada.getLanguage());
        System.out.println(canada.getCountry());
        System.out.println(canada.getDisplayCountry());
        System.out.println(canada.getDisplayLanguage());

        System.out.println(france.getLanguage());
        System.out.println(france.getCountry());
        System.out.println(france.getDisplayCountry());
        System.out.println(france.getDisplayLanguage());
    }
}
