
public class MethodOverloading1 {

    public static void main(String[] args) {

        A a = new A();
        a.add(10, 20);

    }
}

class A {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(short a, short b) {
        System.out.println(a + b);
    }
}
