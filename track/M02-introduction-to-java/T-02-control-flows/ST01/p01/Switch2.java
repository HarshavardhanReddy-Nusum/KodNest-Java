
import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        System.out.println("Enter the day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Learning Day");
                break;

            case 6:
            case 7:
                System.out.println("Revision Day");
                break;
            default:
                System.out.println("Invalid DAy");
        }

    }
}
