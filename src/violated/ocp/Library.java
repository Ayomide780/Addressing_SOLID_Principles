package violated.ocp;

public class Library {
    public double calculateLateFee(String userType) {
        if (userType.equals("student")) {
            return 1.0;
        } else if (userType.equals("teacher")) {
            return 0.5;
        }
        return 0.0;
    }
}