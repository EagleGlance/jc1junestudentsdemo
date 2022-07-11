package com.noirix.domain;

public enum Season {
    WINTER("cold season"),
    SUMMER("hot season"),
    AUTUMN("rainy season"),
    SPRING("green season");

    private String seasonDescription;

    Season(String seasonDescription) {
        this.seasonDescription = seasonDescription;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    public static Season search(String name) {
        return Season.valueOf(name.toUpperCase());
    }

    public static Season getByOrdinal(int number) {
        Season[] values = Season.values();
        int length = values.length;

        return number > length ? WINTER : values[number];
    }
}
