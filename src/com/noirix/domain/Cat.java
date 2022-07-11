package com.noirix.domain;

import com.noirix.service.CatActionInterface;

public class Cat extends Animal implements CatActionInterface, Comparable<Cat> {

    private static int count = 0;

    private String breed = "default breed";

    private String color;

    private int age;

    private final String catConstant = CAT_ACTION;

    static {
        System.out.println("Cat static block");
    }

    {
        System.out.println("Cat logic block");
    }

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
        System.out.println("In Cat constructor with params with super 4");
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

    //Alt+Insert and choose override option

    @Override
    public int process(String number) {
        return 20;
    }


    /*brand:Volvo, model:XC90 */
    public void catMethod(String someInfo) {

        class Car {

            public static final String BRAND = "brand";

            public static final String MODEL = "model";

            private String brand;

            private String model;

            public Car() {
            }

            public Car(String brand, String model) {
                this.brand = brand;
                this.model = model;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            @Override
            public String toString() {
                return "Car{" +
                        "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        '}';
            }
        }

        String[] keyValues = someInfo.trim().split(", ");
        Car car = new Car();
        for (String keyValue : keyValues) {
            String[] split = keyValue.split(":");

            String value = split[1];

            switch (split[0]) {
                case Car.MODEL:
                    car.setModel(value);
                    break;
                case Car.BRAND:
                    car.setBrand(value);
                    break;
                default:
                    break;
            }
        }

        System.out.println(car);
    }

    @Override
    public void meow() {
        System.out.println(CAT_ACTION);
    }

    @Override
    public void run() {
        System.out.println(CAT_ACTION_RUN);
    }

    @Override
    public void jump() {
        System.out.println("JUMP");
    }

    @Override
    public void eat() {
        System.out.println("EAT");
    }

    @Override
    public int compareTo(Cat o) {
        return this.getAge() - o.getAge();
    }
}
