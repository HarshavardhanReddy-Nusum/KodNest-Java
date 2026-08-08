
import java.util.Scanner;

public class Input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Byte Value: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is : " + a);

        System.out.println("Enter a short value: ");
        short b = sc.nextShort();
        System.out.println("Short value is : " + b);

        System.out.println("Enter a integer value: ");
        int c = sc.nextInt();
        System.out.println("Integer value is : " + c);

        System.out.println("Enter a Long value: ");
        long l = sc.nextLong();
        System.out.println("Long value is : " + l);

        System.out.println("Enter a float value: ");
        float d = sc.nextFloat();
        System.out.println("Float value is: " + d);

        System.out.println("Enter a double value: ");
        double e = sc.nextDouble();
        System.out.println("Double value is : " + e);

        System.out.println(" Enter the boolean value: ");
        boolean f = sc.nextBoolean();
        System.out.println("Boolean value is: " + f);
        sc.close();
    }
}
