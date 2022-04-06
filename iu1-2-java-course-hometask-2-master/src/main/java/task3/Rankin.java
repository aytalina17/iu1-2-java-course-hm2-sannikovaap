package task3;

public class Rankin implements Converter{
    private double degree;

    public Rankin(double degree) {
        this.degree = degree;
    }

    @Override
    public double convert() {
        return  degree * 1.8 + 491.67;
    }
}
