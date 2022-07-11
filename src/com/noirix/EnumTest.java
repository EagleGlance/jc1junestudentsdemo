package com.noirix;

import com.noirix.domain.Gender;
import com.noirix.domain.Season;

import static com.noirix.domain.Season.WINTER;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(WINTER.ordinal());
        System.out.println(WINTER.name());
        System.out.println(WINTER.getSeasonDescription());
        System.out.println(Season.SUMMER.ordinal());
        System.out.println(Season.SUMMER.name());
        System.out.println(Season.SUMMER.getSeasonDescription());
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SPRING.name());
        System.out.println(Season.SPRING.getSeasonDescription());

        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        Season winter = Season.search("wInTeR");
        System.out.println(winter.getSeasonDescription());

        Season byOrdinal = Season.getByOrdinal(555);
        System.out.println(byOrdinal);

        String userQuery = "FEMALE";
        Gender gender = Gender.valueOf(userQuery);

        switch (gender) {
            case FEMALE:
                System.out.println("Case Female");
                break;
            case MALE:
                System.out.println("Male case");
            default:
                System.out.println("Default");
                break;
        }

    }
}
