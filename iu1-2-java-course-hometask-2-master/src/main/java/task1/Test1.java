package task1;

public class Test1 {
    public static void main(String[] args) {
        Figure2D triangle = new Triangle(6, 8, 10);
        Figure2D circle = new Circle(5);
        Figure2D rectangular = new Rectangular(2, 6);
        Figure2D trapezoid = new Trapezoid(11, 19,5, 5);

        Prism first_prism = new Prism(triangle, 5);
        Prism second_prism = new Prism(circle, 5);
        Prism third_prism = new Prism(rectangular, 5);
        Prism fourth_prism = new Prism(trapezoid, 7);

        System.out.println("volume of a prism with base triangle = " + first_prism.volume());
        System.out.println("volume of a prism with base circle = " + second_prism.volume());
        System.out.println("volume of a prism with base rectangular = " + third_prism.volume());
        System.out.println("volume of a prism with base trapezoid = " + fourth_prism.volume());

        System.out.println("-------------------------------------------------");

        System.out.println("surface area of a prism with base triangle = " + first_prism.surfaceArea());
        System.out.println("surface area of a prism with base circle = " + second_prism.surfaceArea());
        System.out.println("surface area of a prism with base rectangular = " + third_prism.surfaceArea());
        System.out.println("surface area of a prism with base trapezoid = " + fourth_prism.surfaceArea());
    }
}
