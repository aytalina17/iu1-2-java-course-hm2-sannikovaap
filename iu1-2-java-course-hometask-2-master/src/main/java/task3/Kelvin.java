package task3;

public class Kelvin implements Converter {
    private double degree;

    public Kelvin(double degree) {
        this.degree = degree;
    }
    @Override
    public double convert() {
        return degree + 273.15;
    }
}
