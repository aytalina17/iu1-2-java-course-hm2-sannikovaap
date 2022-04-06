package task1;

public class Trapezoid implements Figure2D{
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapezoid(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return (a + b) / 2 * Math.pow((Math.pow(c, 2) - Math.pow(((Math.pow(b - a, 2) + Math.pow(c, 2) - Math.pow(d, 2)) /
                (2 * (b - a))), 2)), 0.5);
    }

    @Override
    public double perimeter() {
        return a + b + c + d;
    }
}
