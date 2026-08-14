
public class Constructor2 {

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        Student s1 = new Student("Harsha", 21, 5.4);
        s1.display();
        Student s2 = new Student("harsh");
        s2.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
        name = "Anonymous";
        age = 10;
        height = 1.5;
    }

    public Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
    }
}
