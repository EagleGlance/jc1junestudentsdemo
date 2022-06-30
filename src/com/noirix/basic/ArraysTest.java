package com.noirix.basic;

import com.noirix.util.ArrayUtil;

public class ArraysTest {
    public static void main(String[] args) {

        //for this program/algo this value will be used as default
        final int arrayDefaultCapacity = 10;

        int[] arrayWithDefinedValues = {1, 3, 5, 7, 10};

        int[] array = new int[arrayDefaultCapacity]; //magic number

        System.out.println(array.length);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[8]);

        /*Show all elements of array with index of element*/
        ArrayUtil.printArrayExtendedInfo(array);

        /*Show all elements*/
        ArrayUtil.printArray(array);

        /*Show all elements*/
        ArrayUtil.printArray(arrayWithDefinedValues);


    }
}
