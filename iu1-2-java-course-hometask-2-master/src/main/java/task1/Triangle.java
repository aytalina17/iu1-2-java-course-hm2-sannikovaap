package task1;

public class Triangle implements Figure2D{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double semi_perimeter = (a + b + c) / 2;
        return Math.pow((semi_perimeter * (semi_perimeter - a) * (semi_perimeter - b) * (semi_perimeter - c)), 0.5);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
