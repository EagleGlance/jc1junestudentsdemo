package com.noirix.exception;

import com.noirix.domain.Cat;
import com.noirix.util.CatUtil;

public class CatSearchExceptionTest {
    public static void main(String[] args) {

//        Integer a = 128;
//        Integer b = 128;
//        Integer c = -128;
//        Integer d = -128;
//
//        System.out.println(a == b);
//        System.out.println(c == d);

        byte b = 0;

        while (++b > 0);

        System.out.println(b);

        Cat cat = new Cat("breed", "black", 5);
        Cat cat1 = new Cat("breed1", "white", 4);
        Cat cat2 = new Cat("breed2", "red", 10);

        Cat[] cats = new Cat[3];
        cats[0] = cat;
        cats[1] = cat1;
        cats[2] = cat2;

        Cat[] whites = CatUtil.searchCatByParam(cats, "WHITE1");

        for (Cat white : whites) {
            System.out.println(white);
        }
    }
}
