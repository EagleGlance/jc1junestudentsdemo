import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class B extends A {

    static {
        System.out.println("In static block B 999");
        A.i = 999;
    }

    public static final int i = 6;

    public int a = 11;

    {
        System.out.println("In block B 22");
        a = 22;
    }

    @Override
    public List<Integer> method2() {
        System.out.println("inside B");
        return Collections.emptyList();
    }

    static {
        System.out.println("In static block B 8888");
        A.i = 8888;
    }

    public void method() {

        System.out.println("Inside B");
    }

    public static void main(String[] args) {

        new B();


        System.out.println(B.i);
        System.out.println(A.i);

        System.out.println(new B().a);
        System.out.println(new A().a);

        new B().method2();
        new B().method3();
        new B().method();

        B a = new B();
        a.method();

    }
}

class A {

    {
        System.out.println("In block A 100");
        a = 100;
    }

    static {
        System.out.println("In static block A 77");
        i = 77;
    }

    public static int i = 5;

    public int a = 10;

    private String s = "string";

    public A() {
    }


    {
        System.out.println("In block A 200");
        a = 200;
    }

    public A(int a, String s) {
        this.a = a;
        this.s = s;
    }

    private void method() {

    }

    public List<?> method2() throws Exception {
        System.out.println("inside A");
        return Collections.emptyList();
    }

    static {
        System.out.println("In static block A 87");
        i = 87;
    }

    public static void method3() {

    }
}
