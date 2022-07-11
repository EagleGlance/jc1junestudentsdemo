package com.noirix.innerclass;

import java.util.Comparator;

public class Outer {

    private String outerStringValue;

    private Long outerLongValue;

    public Outer() {
    }

    public Outer(String outerStringValue, Long outerLongValue) {
        this.outerStringValue = outerStringValue;
        this.outerLongValue = outerLongValue;
    }

    public String getOuterStringValue() {
        return outerStringValue;
    }

    public void setOuterStringValue(String outerStringValue) {
        this.outerStringValue = outerStringValue;
    }

    public Long getOuterLongValue() {
        return outerLongValue;
    }

    public void setOuterLongValue(Long outerLongValue) {
        this.outerLongValue = outerLongValue;
    }

    class Inner implements Comparator<Inner> {

        public static final int INNER_CONST = 100;

        //public static int count = 0; compilation error

        private String innerValue;

        private Double innerDouble;

        public Inner() {
        }

        public Inner(String innerValue, Double innerDouble) {
            this.innerValue = innerValue;
            this.innerDouble = innerDouble;
        }

        public String getInnerValue() {
            return innerValue;
        }

        public void setInnerValue(String innerValue) {
            this.innerValue = innerValue;
        }

        public Double getInnerDouble() {
            return innerDouble;
        }

        public void setInnerDouble(Double innerDouble) {
            this.innerDouble = innerDouble;
        }

//        class InnerInner {
//            private String innerInnerValue;
//
//            private Double innerInnerDouble;
//
//            public InnerInner() {
//            }
//
//            public InnerInner(String innerInnerValue, Double innerInnerDouble) {
//                this.innerInnerValue = innerInnerValue;
//                this.innerInnerDouble = innerInnerDouble;
//            }
//
//            public String getInnerInnerValue() {
//                return innerInnerValue;
//            }
//
//            public void setInnerInnerValue(String innerInnerValue) {
//                this.innerInnerValue = innerInnerValue;
//            }
//
//            public Double getInnerInnerDouble() {
//                return innerInnerDouble;
//            }
//
//            public void setInnerInnerDouble(Double innerInnerDouble) {
//                this.innerInnerDouble = innerInnerDouble;
//            }
//        }

        public void innerLogic() {

            System.out.println(outerStringValue);
            System.out.println(outerLongValue);

            System.out.println(getOuterStringValue());
            System.out.println(getOuterLongValue());

            System.out.println("Inside inner method");
        }

        @Override
        public int compare(Inner o1, Inner o2) {
            return 0;
        }
    }


    class ChildInner extends Inner {

    }
}
