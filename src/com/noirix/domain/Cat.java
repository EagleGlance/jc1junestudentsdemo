package com.noirix.domain;

import java.util.Objects;

public class Cat {

    public static final String CAT_ACTION = "Meow";
    public static final String CAT_ACTION_WITH_SYMBOLS = "Meow!!";

    private static int count = 0;

    /*Поля класса = характеристики*/
    private String name = "default name";

    private String breed = "default breed";

    private String color;

    private int age;

    private double weight;

    private final String catConstant;

    static {
        count = 100;
        System.out.println("In static block #1");
    }


    {
        age = 10;
        weight = 110;
        count = 10000;
        System.out.println("In logic block #1");
    }

    static {
        count = 200;
        System.out.println("In static block #2");
    }

    /*Каким образом создавать объекты*/
    public Cat() {
        /*here will be the place of code from logic blocks of init*/
        //catConstant = CAT_ACTION;
        catConstant = CAT_ACTION;
        System.out.println("In default constructor");
    }

    public Cat(String name, String breed, String color, int age, double weight) {
        /*here will be the place of code from logic blocks of init*/
        catConstant = CAT_ACTION_WITH_SYMBOLS;
        System.out.println("In constructor with params");
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    /*setters, getters*/

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCatConstant() {
        return catConstant;
    }

    /*@Overriding*/
    /*equals, hashCode, toString*/

    //Alt + Insert - generate equals and hasCode
    @Override
    public boolean equals(Object o) {
        //1. Compare object with themselves
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        //Convert Object type to particular type
        Cat slava = (Cat) o;

        if (age != slava.age) return false;
        if (Double.compare(slava.weight, weight) != 0) return false;
        if (!name.equals(slava.name)) return false;
        if (!breed.equals(slava.breed)) return false;
        if (!color.equals(slava.color)) return false;
        return catConstant.equals(slava.catConstant);
    }


    //Collections API -
    //new Cat() vs new Cat() - equals hash codes
    //new Cat() vs new Cat(1) - different hash codes
    //collision = new Cat() vs new Cat(1) - equals hash codes
    @Override
    public int hashCode() {

        //return Objects.hash(name, breed, color);

        int result;
        long temp;
        result = this.name.hashCode();
        result = 31 * result + this.breed.hashCode();
        result = 31 * result + this.color.hashCode();
        result = 31 * result + this.age;
        temp = Double.doubleToLongBits(this.weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + this.catConstant.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", catConstant='" + catConstant + '\'' +
                '}';
    }

    /*Поведение класса = поведением объекта = методы*/
    public void someMethod() {
        /*тело метода*/
        System.out.println("Some method process");
    }

    {
        age = 6;
        weight = 7;
        count = 8;
        System.out.println("In logic block #2");
    }

    /*
        Перегрузка
        Сигнатура метода = название метода + параметры метода(их число, тип и очередность)
        */

    public int getSum(int a, int b) {
        return a + b;
    }

    public double getSum(double a, double b) {
        return a + b;
    }

    public int getSum(byte a, byte b) {
        return a + b;
    }

    {
        color = "Black";
        count = 34;
        System.out.println("In logic block #3");
    }

    static {
        count = 300;
        System.out.println("In static block #3");
    }

}
