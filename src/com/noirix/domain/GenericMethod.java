package com.noirix.domain;

public class GenericMethod {
    public static <T extends Number> String someFunctionality(T param, String s) {

        Long l = param.longValue();
        return s.concat(l.toString());
    }
}
