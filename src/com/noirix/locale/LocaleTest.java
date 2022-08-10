package com.noirix.locale;

import com.noirix.util.GreetingsReader;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());

        Locale canada = Locale.CANADA;
        Locale uk = Locale.UK;

        System.out.println(canada.getLanguage());
        System.out.println(canada.getCountry());
        System.out.println(canada.getDisplayCountry());
        System.out.println(canada.getDisplayLanguage());

        System.out.println(uk.getLanguage());
        System.out.println(uk.getCountry());
        System.out.println(uk.getDisplayCountry());
        System.out.println(uk.getDisplayLanguage());

        NumberFormat instance = NumberFormat.getCurrencyInstance(uk);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat germany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println(instance.format(100000));
        System.out.println(us.format(100000));
        System.out.println(germany.format(100000));
        System.out.println(china.format(100000));

        Date date = new Date();

        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG, uk);
        DateFormat dateInstanceUs = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        DateFormat dateInstanceGermany = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
        DateFormat dateInstanceChina = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        System.out.println(dateInstance.format(date));
        System.out.println(dateInstanceUs.format(date));
        System.out.println(dateInstanceGermany.format(date));
        System.out.println(dateInstanceChina.format(date));

        System.out.println("Resource bundle test: ");
        System.out.println(GreetingsReader.getProperty(Locale.UK, GreetingsReader.HELLO_KEY));
        System.out.println(GreetingsReader.getProperty(Locale.FRANCE, GreetingsReader.HELLO_KEY));
        System.out.println(GreetingsReader.getProperty(Locale.CANADA, GreetingsReader.HELLO_KEY));
        System.out.println(GreetingsReader.getProperty(Locale.GERMANY, GreetingsReader.HELLO_KEY));
        System.out.println(GreetingsReader.getProperty(new Locale("ru", "RU"), GreetingsReader.HELLO_KEY));
    }
}
