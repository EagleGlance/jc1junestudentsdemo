/*Multiline comment*/
//Single line comment
package com.noirix.basic;

//Ctrl + Alt + O - imports optimization
//Ctrl + Alt + L - code formatting

public class MainClassWithCamelCaseName {
    //2. Class variable
    public int a;

    /*Hot Keys - psvm - public static void main(String[] args)*/
    /*Some functionality*/
    public static void main(String[] args) {

        for (String temp : args) {
            System.out.println(temp);
        }

//        for (String arg : args) {
//            System.out.println(arg);
//        }
//
//        System.out.print("Hello, world!");
//        System.out.print("\n");
//        System.out.print("\t");
//        System.out.print("\\");
//        System.out.println("Hello, world1!");
//        System.out.println("Hello, world2!");

        //[data type] [name] = [value]
        //1. Local variable
        String s = "hello"; //15 byte

        boolean b = true;
        byte bt = -128; //10011000 00000000 00000000 11111111
        byte bt1 = 6; //10011000 00000000 00000000 11111111
        int bigInt = 1_000_000_000;
        int bigInt1 = 1_000_000_000;
        long l = 8_888_888_888_888_888_888L;
        double d = 8_888_888_888_888_888_888D;

        int result = bt * bt1;
        long i1 = (long) bigInt * bigInt1;

        System.out.println(result);
        System.out.println(i1);

        //sout
//        System.out.println(b); //Ctrl + D - copy current line
//        System.out.println(bt);
//        System.out.println(bigInt);
//        System.out.println(l);
//        System.out.println(d);

        //8
        //00001000

        int testInt = 100;
//        testInt = testInt + 1; //101
//        testInt += 1;  //102
//        //103    ++ synonym + 1
//        //       -- synonym - 1
//        testInt++;
//        testInt--;
//        testInt -= 1;

        //Multiline cursor - Alt
        System.out.println("1) " + testInt++);
        System.out.println("2) " + ++testInt);
        System.out.println("3) " + --testInt);
        System.out.println("4) " + testInt--);
        System.out.println("5) " + testInt);
        System.out.println("6) " + (testInt + 1));

        float divisionResult = 13F/5;

        System.out.println(divisionResult);
        System.out.println(13%2);

        System.out.println(13 >= 10);   //return boolean value
        System.out.println(13 <= 10);   //return boolean value
        System.out.println(13 != 10);   //return boolean value
        System.out.println(13 == 10);   //return boolean value


        //if (13 >= 10 && 10 > 0) {
        //if (13 >= 10 ^ 10 > 0) {
        System.out.println(13 > 10 || 10 > 0 ? "13 greater than 10" : "10 greater than 13");

        if (13 >= 10 || 10 > 0) {
            //&&
            //true && true = true
            //true && false = false
            //false && true = false
            //false && false = false
            //
            //||
            //true || false = true
            //false || true = true
            //true || true = true
            //false || false = false
            //^
            //!(true || false) = false
            //!(false || true) = false
            //!(true || true) = false
            //!(false || false) = true
            System.out.println("13 greater than 10");
            if (10 > 8) {

            }
        } else {
            System.out.println("10 greater than 13");
        }

//        if (условие/сравнение/несколько сравнений) {
//            //если true
//            //то выполняется блок кода в фигурных скобках
//        } else {
//            //если false
//            //то выполняется блок кода в фигурных скобках
//        }


        //8
        //int a = 8 / 2;
        //int aa = 8 >> 1;
        //00000100
        //2^7 * 0 + 2^6 * 0 + 2^5 * 0 + 2^4 * 0 + 2^3 * 0 + 2^2 * 1 + 2^1 * 0 + 2^0 * 0
        int aa = 15 << 1;
        System.out.println(aa);


        //Loops
        //1. While

        //Press F8 in debug mode for next step of program processing
        int count = 0;
        while (count != 0) {
            System.out.println("Hello! " + count);
            count--;
        }

        //2. Do/while
        int doWhileCounter = 0;
        do {
            System.out.println("Do While String" + doWhileCounter);
            doWhileCounter--;
        } while (doWhileCounter > 0);

        //3. For
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }


    }
}

//noirix.com
//zodier.com
//com.zodier
//        -domain
//        -util
//        -test