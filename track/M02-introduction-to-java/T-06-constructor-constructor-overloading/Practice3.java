
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product(sc.next(), sc.nextDouble());
        p.display();
    }
}

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Price:" + price);
    }
}
