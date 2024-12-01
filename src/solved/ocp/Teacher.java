package solved.ocp;

public class Teacher extends User {
    @Override
    public double calculateLateFee() {
        return 0.5;
    }
}
