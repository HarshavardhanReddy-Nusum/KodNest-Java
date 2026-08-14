
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item = sc.nextLine();
        int quantity = sc.nextInt();
        FoodOrder fo = new FoodOrder(item);
        FoodOrder fo1 = new FoodOrder(item, quantity);
        fo.display();
        fo1.display();
    }
}

class FoodOrder {

    String item;
    int quantity;

    public FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    public FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Item: " + item + " " + "Quantity: " + quantity);
    }
}
