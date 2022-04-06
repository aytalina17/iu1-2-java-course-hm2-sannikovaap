package task3;

public class Test3 {
    public static void main(String[] args) {
        Converter kelvin = new Kelvin(10);
        Converter fahrenheit = new Fahrenheit(10);
        Converter delille = new Delille(10);
        Converter rankin = new Rankin(10);

        System.out.println("degree in Kelvins = " + kelvin.convert());
        System.out.println("degree in Fahrenheits = " + fahrenheit.convert());
        System.out.println("degree in Delilles = " + delille.convert());
        System.out.println("degree in Rankins = " + rankin.convert());
    }
}
