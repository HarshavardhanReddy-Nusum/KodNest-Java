
public class Practice2 {

    public static void main(String[] args) {
        Student s = new Student("harsha");
        s.display();
    }
}

class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
