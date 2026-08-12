
public class Homework2 {

    public static void main(String args[]) {
        String name = "Kodnest";

        Student s = new Student();
        s.setName(name);
        s.showName();
        s.showScore(10);
        s.showScore(10, 20);
    }
}

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student: " + name);
    }

    void showScore(int a) {
        System.out.println("First score: " + a);
    }

    void showScore(int a, int b) {
        System.out.println("Second score: " + (a + b));
    }
}
