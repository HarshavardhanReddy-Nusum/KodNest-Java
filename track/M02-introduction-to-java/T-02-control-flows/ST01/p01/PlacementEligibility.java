
public class PlacementEligibility {

    public static void main(String[] args) {
        int marks = 80;
        int attendance = 75;
        boolean projectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligibility = marksEligible && attendanceEligible;
        boolean placementEligibility = academicEligibility && projectCompleted;

        System.out.println("Placement Eligible: " + placementEligibility);
    }
}
