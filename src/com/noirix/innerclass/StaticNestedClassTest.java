package com.noirix.innerclass;

import java.util.Comparator;

public class StaticNestedClassTest {

    private static int count = 100;
    public String value;

    public Nested nested = new Nested();

    public void outerLogic() {
        System.out.println("Outer logic");
    }

    public static void outerStatic() {
        System.out.println("Outer static");
    }

    static class Nested implements Comparator<Nested> {

        public static int nestedCount = 100;
        public static final int NESTED_CONST = 100;

        public static void nestedLogic() {
            StaticNestedClassTest staticNestedClassTest = new StaticNestedClassTest();
            //staticNestedClassTest.value;
            System.out.println(count);
            staticNestedClassTest.outerLogic();
            outerStatic();
        }

        @Override
        public int compare(Nested o1, Nested o2) {
            return 0;
        }
    }

    class Child extends Nested {

    }


}
