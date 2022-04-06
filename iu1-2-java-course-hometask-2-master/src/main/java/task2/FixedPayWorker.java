package task2;

public class FixedPayWorker extends Worker {
    private double fixed_salary;

    public FixedPayWorker(double fixed_salary) {
        this.fixed_salary = fixed_salary;
    }

    @Override
    double salary() {
        return fixed_salary;
    }
}
