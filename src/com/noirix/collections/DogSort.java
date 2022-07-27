package com.noirix.collections;

import com.noirix.domain.Animal;
import com.noirix.domain.Dog;

import java.util.Arrays;
import java.util.Comparator;

public class DogSort {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setWeight(10);

        Dog dog1 = new Dog();
        dog1.setWeight(6);

        Dog dog2 = new Dog();
        dog2.setWeight(18);

        Dog[] dogs = new Dog[3];
        dogs[0] = dog;
        dogs[1] = dog1;
        dogs[2] = dog2;

        Arrays.sort(dogs, Comparator.comparingDouble(Animal::getWeight));

        for (Dog tempDog : dogs) {
            System.out.println(tempDog);
        }
    }
}
