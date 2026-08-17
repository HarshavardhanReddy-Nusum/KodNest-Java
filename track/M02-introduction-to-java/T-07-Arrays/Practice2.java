
public class Practice2 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int bonus = 5;

        for (int i = 0; i < a.length; i++) {
            a[i] += bonus;
        }
        System.out.print("Updated values: ");
        for (int c : a) {
            System.out.print(c + " ");
        }
    }
}
