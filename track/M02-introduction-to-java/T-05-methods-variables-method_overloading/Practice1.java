import java.util.Scanner;
public class Practice1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String word = sc.next();

        Printer p = new Printer();
        p.show(n);
        p.show(word);
    }
}

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}