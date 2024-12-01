package solved.ocp;

public class Student extends User {
    @Override
    public double calculateLateFee() {
        return 1.0;
    }
}