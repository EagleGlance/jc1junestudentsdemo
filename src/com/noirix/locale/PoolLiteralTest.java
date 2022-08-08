package com.noirix.locale;

import java.util.Formatter;

public class PoolLiteralTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        StringBuilder append = new StringBuilder().append("Hel").append("lo");
        String s2 = append.toString();
        String s3 = s2.intern();

        String s = new String("Hello").intern();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s == s3);
        System.out.println(s == s1);

        System.out.println(s1 == ("Hel" + "lo"));
        System.out.println(s1 == ("Hel" + "l" + "o"));
        System.out.println(s1 == ("Hel" + 'l' + "o"));

        s1 = s1.concat("qweqweqwe");
        System.out.println(s1);
        System.out.println(s1 == s3);
        System.out.println(s == s3);

        System.out.println(1 + 2 + "d");
        System.out.println("a" + 1 + 2 + "d");
        System.out.println("a" + 1 + 2);
        System.out.println("a" + (1 + 2));


        String batman = "Batman";

        System.out.println(batman.contains("b"));
        System.out.println(batman.contains("B"));
        System.out.println(batman.contains("bat"));
        System.out.println(batman.contains("Bat"));
        System.out.println(batman.contains("cat"));

        System.out.println(batman.startsWith("a"));
        System.out.println(batman.endsWith("man"));
        System.out.println(batman.endsWith("n"));

        System.out.println(batman.substring(1, 5));
        System.out.println(batman.replace("a", "aaaa"));
        System.out.println("              batman                                               ".trim());
        System.out.println(batman);

        String s4 = String.valueOf(10);
        System.out.println(s4);

        StringBuilder sb = new StringBuilder()
                .append("hELLO")
                .append("world")
                .append("we ")
                .append("are ")
                .append("programmers ");

        System.out.println(sb);


        Formatter formatter = new Formatter();
        formatter.format("%x\n", 1023949234);
        formatter.format("%o\n", 1023949234);
        formatter.format("%e\n", 1023949234D);

        System.out.println(formatter);
    }
}
