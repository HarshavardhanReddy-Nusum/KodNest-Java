
public class CalculateSIBmi {

    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        int totalMarks = 78 + 84 + 89 + 79 + 90;
        double simpleInterest = principal * rate * time / 100.0;
        double bmi = weight / (height * height);
        double averageMarks = totalMarks / 5.0;
        double totalAmount = principal + simpleInterest;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("BMI: " + bmi);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Total Amount: " + totalAmount);
    }
}
