
public class Homework1 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
