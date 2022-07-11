package com.noirix.innerclass;

import com.noirix.domain.Cat;

public class AnonymousLocalClass {

    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.meow();

        Cat cat = new Cat() {
            @Override
            public void meow() {
                System.out.println("Override meow!");
            }
        };

        cat.meow();
        cat.catMethod("brand:Volvo, model:XC90");

    }
}
