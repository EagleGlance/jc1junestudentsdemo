package com.noirix.streamapi;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {

//        StringProcessable<Integer, Integer, String> process = (x, y) -> {
//            return "Sum of elements is: " + (x + y);
//        };

        StringProcessable<Integer, Integer, String> process = (x, y) -> "Sum of elements is: " + (x + y);

        System.out.println(process.calculateAndGet(10, 20));
        System.out.println(process.calculateAndGet(102, 20));
        System.out.println(process.calculateAndGet(104, 20));
        System.out.println(process.calculateAndGet(105, 20));


        Function<String, String> someFunction = (x) -> {
            return x + x;
        };
        Function<String, String> someFunction1 = (x) -> x + x;
        Function<String, String> someFunction2 = (x) -> x.concat(x);

        //Function<String, String> someFunction3 = (x) -> x.toLowerCase();
        Function<String, String> someFunction3 = String::toLowerCase;

        Predicate<String> predicate = (x) -> x.equalsIgnoreCase("sOmEstRing");

        testLambdas(someFunction, "String");
        testLambdas(someFunction1, "PLUS");
        testLambdas(someFunction2, "CONCAT");
        testLambdas(someFunction3, "LOWERCASE");

        testPredicate(predicate, "some String");
        testPredicate(predicate, "someString");
    }

    public static void testLambdas(Function<String, String> function, String t) {
        System.out.println(function.apply(t));
    }

    public static void testPredicate(Predicate<String> predicate, String param) {
        if (predicate.test(param)) {
            System.out.println("Predicate test success!");
        } else {
            System.out.println("String doesnt match");
        }
    }
}
