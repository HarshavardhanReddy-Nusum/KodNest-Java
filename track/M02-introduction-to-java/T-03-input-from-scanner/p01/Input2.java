
import java.util.Scanner;

public class Input2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your Height: ");
        float height = sc.nextFloat();
        System.out.println("Your height is: " + height);

        sc.nextLine();

        System.out.println("Enter your full name: ");
        String fname = sc.nextLine();
        System.out.println("Your name is: " + fname);

        sc.close();
    }
}
