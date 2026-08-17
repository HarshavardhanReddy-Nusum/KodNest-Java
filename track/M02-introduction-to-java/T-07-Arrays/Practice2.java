
public class Practice2 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int bonus = 5;

        int b[] = new int[5];
        int j = 0;
        for (int c : a) {
            b[j] = c;
            j++;
        }

        System.out.println("b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] += bonus;
        }
        System.out.print("Updated values: ");
        for (int c : a) {
            System.out.print(c + " ");
        }
    }
}
