package task3;

public class Delille implements Converter{
    private double degree;

    public Delille(double degree) {
        this.degree = degree;
    }

    @Override
    public double convert() {
        return (100 - degree) * 1.5;
    }
}
