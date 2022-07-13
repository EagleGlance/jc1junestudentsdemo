package com.noirix.domain;

import java.util.Comparator;

public class Dog extends Animal implements Comparator<Dog> {
    private String dogSay = "Gav";

    public Gender gender;

    public Dog() {
    }

    public Dog(String dogSay) {
        this.dogSay = dogSay;
    }

    public Dog(String type, double weight, String dogSay) {
        super(type, weight);
        this.dogSay = dogSay;
    }

    public Dog(long id, String name, String type, double weight, String dogSay) {
        super(id, name, type, weight);
        this.dogSay = dogSay;
    }

    @Override
    public int compare(Dog o1, Dog o2) {

        double weight1 = o1.getWeight();
        double weight2 = o2.getWeight();

//        if (weight1 < weight2) {
//            return -1;
//        } else if (weight1 == weight2) {
//            return 0;
//        } else {
//            return 1;
//        }

        return Double.compare(weight1, weight2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return dogSay != null ? dogSay.equals(dog.dogSay) : dog.dogSay == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (dogSay != null ? dogSay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogSay='" + dogSay + '\'' +
                "} " + super.toString();
    }
}
