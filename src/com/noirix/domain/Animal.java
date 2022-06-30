package com.noirix.domain;

public class Animal extends BaseClass {

    private String type;

    private double weight;

    static {
        System.out.println("Animal static block");
    }

    {
        System.out.println("Animal logic block");
    }

    public Animal() {
       System.out.println("In Animal default constructor");
    }

    public Animal(String type, double weight) {
        System.out.println("In Animal constructor with params");
        this.type = type;
        this.weight = weight;
    }

    public Animal(long id, String name, String type, double weight) {
        super(id, name);
        System.out.println("In Animal constructor with params and super");

        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Animal animal = (Animal) o;

        if (Double.compare(animal.weight, weight) != 0) return false;
        return type != null ? type.equals(animal.type) : animal.type == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Animal{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                "} ";
    }

    public void animalMethod(){}

    public void doSomething() {
        baseDoSomething();
    }

    @Override
    public int process(String number) {
        return 10;
    }

    public int baseMethod(String a, int b, String c) {
        return 30;
    }
}
