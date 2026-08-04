
public class Main {

    public static void main(String[] args) {
        int num = -17;
        int first = 20;
        int second = 25;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (first >= second) {
            System.err.println("Larger Number: " + first);
        } else {
            System.out.println("Larger Number: " + second);
        }
    }
}
