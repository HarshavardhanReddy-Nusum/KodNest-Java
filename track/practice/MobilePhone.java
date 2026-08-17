
import java.util.Scanner;

public class MobilePhone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile m = new Mobile();
        System.out.println(m);
        Face f = new Face();
        System.out.println(f);
        Pattern p = new Pattern();
        System.out.println(p);
        Fingerprint fp = new Fingerprint();
        System.out.println(fp);

        System.out.println("Choose your choice: ");
        System.out.println("1.Unlock by number password");
        System.out.println("2.Unlock by string password");
        System.out.println("3.Unlock by face");
        System.out.println("4.Unlock by pattern");
        System.out.println("5.Unlock by fingerprint");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter your password");
                m.unlock(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter your password");
                m.unlock(sc.next());
                break;
            case 3:
                m.unlock(f);
                break;
            case 4:
                m.unlock(p);
                break;
            case 5:
                m.unlock(fp);
                break;
            default:
                System.out.println("Invalid choice");
                choice = sc.nextInt();
        }
    }
}

class Mobile {

    void unlock(int password) {
        System.out.println("Number password verified.");
        System.out.println("Login successful.");
    }

    void unlock(String password) {
        System.out.println("String password verified.");
        System.out.println("Login successful.");
    }

    void unlock(Face face) {
        System.out.println("Face regognized");
        System.out.println("Login successful.");
    }

    void unlock(Pattern pattern) {
        System.out.println("Pattern matched");
        System.out.println("Login successful.");
    }

    void unlock(Fingerprint f) {
        System.out.println("Fingerprint matched");
        System.out.println("Login successful.");
    }
}

class Face {

}

class Pattern {

}

class Fingerprint {

}
