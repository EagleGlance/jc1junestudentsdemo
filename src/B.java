public class B extends A {
    public static final int i = 6;

    public static void main(String[] args) {
        System.out.println(new  B().i);
    }
}

class A {
    public static int i = 5;

}
