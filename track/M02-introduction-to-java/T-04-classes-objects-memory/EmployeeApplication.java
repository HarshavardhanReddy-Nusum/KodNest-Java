
public class EmployeeApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 18;
        e1.name = "Harsha";

        System.out.println(e1.id);
        System.out.println(e1.name);

        Employee e2 = e1;

        e2.id = 26;
        e2.name = "Harsh";

        System.out.println("e1 id: " + e1.id);
        System.out.println("e1 name: " + e1.name);

        System.out.println("e2 id: " + e2.id);
        System.out.println("e2 name: " + e2.name);
    }
}

class Employee {

    int id;
    String name;
}
