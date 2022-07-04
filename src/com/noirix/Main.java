package com.noirix;

import com.noirix.domain.Animal;
import com.noirix.domain.BaseClass;
import com.noirix.domain.Cat;
import com.noirix.domain.Dog;
import com.noirix.service.CatActionInterface;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Cat());
//        System.out.println("========================");
//
//        Cat cat777 = new Cat(1, "Barsik", "siamskiy",  8.25d, "siamskiy", "black", 6);
//        System.out.println(cat777);

        System.out.println("========================");

        Dog dog = new Dog();

        Cat cat = new Cat();
        Animal animal = new Animal();
        BaseClass base = new BaseClass();
        CatActionInterface catActionInterface = new Cat();

        catActionInterface.jump();
        catActionInterface.run();
        catActionInterface.eat();
        catActionInterface.meow();

        //Overloading - раннее связывание - для комплилятора - тип ссылки важен
//        cat.catMethod();
//        animal.catMethod();
//        base.animalMethod();

        //Overriding - type of object is very important for us
        System.out.println(cat.process("1000"));
        System.out.println(animal.process("1000"));
        System.out.println(base.process("1000"));

    }
}
