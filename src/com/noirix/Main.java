package com.noirix;

import com.noirix.domain.Cat;
import com.noirix.domain.User;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "siam", "Black", 3, 4D);
        Cat cat5 = new Cat("Barsik1", "siam", "Black", 3, 4D);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        System.out.println(cat);
        System.out.println(cat2);

        System.out.println("*************Setters and getters demo**************");

        System.out.println(Cat.getCount());
        System.out.println(cat.getAge());
        System.out.println(cat.getBreed());
        System.out.println(cat.getName());

        System.out.println(cat2.getName());

        cat2.setName("Slavik");
        Cat.setCount(100);
        System.out.println(cat2.getName());
        System.out.println(Cat.getCount());

        //collision = different objects + equals hashCodes
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());

        System.out.println(cat2.equals(new User()));
        System.out.println(cat2.equals(null));
        System.out.println(cat.equals(cat5));

    }
}
