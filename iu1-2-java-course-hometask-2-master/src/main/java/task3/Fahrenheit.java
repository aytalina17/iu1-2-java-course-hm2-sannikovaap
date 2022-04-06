package task3;

public class Fahrenheit implements Converter {
    private double degree;

    public Fahrenheit(double degree) {
        this.degree = degree;
    }

    @Override
    public double convert() {
        return degree * 1.8 + 32;
    }
}
