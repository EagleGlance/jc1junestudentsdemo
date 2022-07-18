package com.noirix.collections;

import com.noirix.domain.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapTests {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat("breed1", "black", 5);
        Cat cat2 = new Cat("breed2", "white", 7);
        Cat cat3 = new Cat("breed3", "red", 8);

        Map<String, Cat> catsDictionary = new HashMap<>();

        catsDictionary.put(null, cat3);
        catsDictionary.put("Slava1", cat1);
        catsDictionary.put("Slava2", cat2);
        catsDictionary.put("Slava", cat);
        catsDictionary.put("Slava3", cat3);

        Set<String> keys = catsDictionary.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        for (Map.Entry<String, Cat> entry : catsDictionary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
