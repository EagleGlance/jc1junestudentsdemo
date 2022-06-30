package com.noirix.util;

public class ArrayUtil {

    public static final int ARRAY_DEFAULT_CAPACITY = 10;

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void printArray(double[] array) {
        for (double i : array) {
            System.out.println(i);
        }
    }

    public static void printArrayExtendedInfo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Cell " + i + " has value " + array[i]);
        }
    }
}
