package com.noirix.domain;

public class Cat extends Animal {

    public static final String CAT_ACTION = "Meow";
    public static final String CAT_ACTION_WITH_SYMBOLS = "Meow!!";

    private static int count = 0;

    private String breed = "default breed";

    private String color;

    private int age;

    private final String catConstant = CAT_ACTION;

    public Cat() {
        System.out.println("In Cat default constructor");
    }

    public Cat(String breed, String color, int age) {
        System.out.println("In Cat constructor with params");
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Cat(String type, double weight, String breed, String color, int age) {
        super(type, weight);
        System.out.println("In Cat constructor with params with super 2");
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Cat(long id, String name, String type, double weight, String breed, String color, int age) {
        super(id, name, type, weight);
        System.out.println("In Cat constructor with params with super 2");
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    /*setters, getters*/

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
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

    public String getCatConstant() {
        return catConstant;
    }

    /*@Overriding*/
    /*equals, hashCode, toString*/
    //Alt + Insert - generate equals and hasCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (breed != null ? !breed.equals(cat.breed) : cat.breed != null) return false;
        if (color != null ? !color.equals(cat.color) : cat.color != null) return false;
        return catConstant != null ? catConstant.equals(cat.catConstant) : cat.catConstant == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (catConstant != null ? catConstant.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", catConstant='" + catConstant + '\'' +
                "} ";
    }

    /*Поведение класса = поведением объекта = методы*/
    public void someMethod() {
        /*тело метода*/
        System.out.println("Some method process");
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

}
