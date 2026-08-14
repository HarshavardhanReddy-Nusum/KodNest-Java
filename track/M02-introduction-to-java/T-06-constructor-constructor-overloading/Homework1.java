
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book(sc.nextLine(), sc.nextLine());
        b.display();
    }
}

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
