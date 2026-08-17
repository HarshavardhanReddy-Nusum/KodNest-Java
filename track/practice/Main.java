
public class Main {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        System.out.println(c);
        Money m = new Money();
        System.out.println(m);
        c.collect(m);
        Ticket t = c.give();
        System.out.println(t);
        if (t != null) {
            System.out.println("Ticket collected.");
        }
    }
}

class Conductor {

    void collect(Money m) {
        System.out.println("Conductor taken money.");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Conductor ticket issued.");
        return t;
    }
}

class Money {

}

class Ticket {

}
