
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plan = sc.next();
        int price = sc.nextInt();
        MobilePlan m1 = new MobilePlan();
        MobilePlan m2 = new MobilePlan(plan, price);
        m1.display();
        m2.display();
    }
}

class MobilePlan {

    String name;
    int price;

    MobilePlan() {
        name = "Basic";
        price = 199;
    }

    public MobilePlan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

}
