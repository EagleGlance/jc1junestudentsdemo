package com.noirix.innerclass;

public class InnerClassesTest {
    public static void main(String[] args) {

        Outer outer = new Outer();

        System.out.println(outer.getOuterStringValue());
        System.out.println(outer.getOuterLongValue());

        Outer.Inner inner = new Outer().new Inner("Inner", 888D);
        Double innerDouble = inner.getInnerDouble();
        String innerValue = inner.getInnerValue();
        System.out.println(innerDouble);
        System.out.println(innerValue);

        inner.innerLogic();

        System.out.println(Outer.Inner.INNER_CONST);

        StaticNestedClassTest.Nested.nestedLogic();


        StaticNestedClassTest.Nested nested = new StaticNestedClassTest().nested;


    }
}
