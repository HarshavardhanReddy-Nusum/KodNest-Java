
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int updateIndex = 1;
        int updateValue = 90;
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        int[] c = a;
        c[updateIndex] = updateValue;
        System.out.print("Original: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("Copy: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println("Same object: " + (a == c));
    }
}
