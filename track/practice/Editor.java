
public class Editor {

    public static void main(String[] args) {
        Editor1 e = new Editor1();
        int values[] = new int[0];
        int minimum = values[0];
        e.change(values);
        System.out.println(values[0] + " " + values[1]);
    }
}

class Editor1 {

    void change(int[] data) {
        data[1] = 50;
        data = new int[2];
        data[0] = 99;
    }
}
