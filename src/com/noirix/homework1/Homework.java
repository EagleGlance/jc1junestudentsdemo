package com.noirix.homework1;

public class Homework {

    private String s;
    private int a;

    public static void main(String[] args) throws RuntimeException {


        byte b = 0;
        byte b1 = -128;
        byte b2 = 127;

        short s = 10000;

        boolean bool = true;
        Boolean aBoolean = new Boolean(true);
        //boolean bool1 = (boolean) 1;

        boolean aTrue = Boolean.parseBoolean("true");
        boolean parse1 = Boolean.parseBoolean("1");
        boolean parse2 = Boolean.parseBoolean("false");
        boolean sdfsdf = Boolean.getBoolean("sdfsdf");

        System.out.println(aTrue);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(sdfsdf);

        Integer sdfsdf1 = Integer.getInteger("sdfsdf");
        System.out.println(sdfsdf1);

        //parse methods can throw exception
        //getInteger or getLong return null value in case of unparseable value
        //Long.parseLong("sdfsdf");

        //Double.valueOf("sdfsdf");


        int k = 0;

        for (int i = 0; i < 10; i++) {
            int j = 10;
            System.out.println(i);
            System.out.println(k);
        }

        if (1 > 0)
            System.out.println("asdasd");

        if (k > 10) {
            int j = 10;
            System.out.println("adsasdasd");
        } else {
            System.out.println("sdfdsfsd");
        }


        int $a$ = 10;  //available, but not for code convention
        int __a = 10;
        int a11 = 10;
        //int @a = 10;  -compilation error
        //int 11a = 10;  -compilation error

        String s1;
        int a = -10;
        System.out.println(-a++);
        System.out.println(+a++);
        System.out.println(a);
        //System.out.println(s1);

        //a = -8
        //a = -7
        //a = 7
        a -= -++a;
        System.out.println(a);

        int v = (int) 076555L;
        int vv = 0xaafffff;
        System.out.println(v);
        System.out.println(vv);

        System.out.println(true);


        int result = 0;

        byte first = 10;
        int second = 20;
        int bResult = first * second;

        Integer cache = 100;
        Integer cache1 = 100;

        Integer outOfCache = 128;
        Integer outOfCache1 = 128;

        System.out.println(cache == cache1);
        System.out.println(outOfCache == outOfCache1);

        //0000 0101
        //0000 0010
        //0000 0111
        System.out.println(5 | 2);
        System.out.println(5 & 2);
        System.out.println(5 ^ 2);
        System.out.println(5 > 0 || 2 > 9);

        //0000 1000
        //0000 0100
        System.out.println(8 >>> 1);

        if (methodA() && methodB()) {
            System.out.println("result");
        }

        System.out.println(1 > 0 ? 10 : 9);
        //0000 0001
        System.out.println(~90);

        //~x = -(x)-1


        System.out.println(0.0d / 0.0);

        int caseInt = 10;
        switch (caseInt) {
            case 10:
                System.out.println("yahoo!");
                break;
            case 20 :
                System.out.println("20");

        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("bla bla bla");
        }

    }

    public static boolean methodA() {
        System.out.println("A");
        return true;
    }

    public static boolean methodB() {
        System.out.println("B");
        return true;
    }
}
