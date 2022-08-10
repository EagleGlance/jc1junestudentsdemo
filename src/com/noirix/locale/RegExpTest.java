package com.noirix.locale;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {
    public static void main(String[] args) {
        Pattern regexp = Pattern.compile("[a-z\\d]+");
        Pattern email = Pattern.compile("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})");

        String someText = RandomStringUtils.randomAlphanumeric(100);
        String emailText = "viachaslauk.it@gmail.com";

        System.out.println(someText);

        Matcher matcher = regexp.matcher(someText);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        Matcher emailMatcher = email.matcher(emailText);
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }

    }
}
