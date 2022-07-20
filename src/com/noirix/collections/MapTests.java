package com.noirix.collections;

import com.noirix.domain.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapTests {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Cat cat = new Cat();
        Cat cat1 = new Cat("breed1", "black", 5);
        Cat cat2 = new Cat("breed2", "white", 7);
        Cat cat3 = new Cat("breed3", "red", 8);

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);

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

        Map<String, Cat> treeMap = new TreeMap<>();

        treeMap.put("Slava1", cat1);
        treeMap.put("Slava2", cat2);
        treeMap.put("Slava", cat);
        treeMap.put("Slava3", cat3);

        for (Map.Entry<String, Cat> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        TreeSet<Object> objects = new TreeSet<>();

        objects.add(cat1);
        objects.add(cat1);
        objects.add(cat2);
        objects.add(cat2);
        objects.add(cat);
        objects.add(cat);
        objects.add(cat3);

        objects.remove(cat2);

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
