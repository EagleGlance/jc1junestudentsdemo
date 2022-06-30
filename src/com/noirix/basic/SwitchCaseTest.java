package com.noirix.basic;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String searchQuery = "Dimitry";
        Integer searchNumber = 10;

        switch (searchQuery) {
            case "Slava":
                System.out.println("Hello, " + searchQuery);
                break;
            case "Liza":
                System.out.println("Hello, Liza!");
                break;
            case "Mathew":
                System.out.println("Hola, Mathew!");
                break;
            case "Vadim":
            case "Dimitry":
                System.out.println("Hello, Vadim And Dima!");
                break;
            default:
                System.out.println("Hello, anonymous!");
        }


        switch (searchNumber) {
            case 1:
                System.out.println("Google");
                break;
        }
    }
}
