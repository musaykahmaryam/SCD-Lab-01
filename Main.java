package lab01;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("SCD Lab 01 - Introduction to GitHub");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 * 3 = " + calc.multiply(5, 3));
        System.out.println("Square of 5 = " + calc.square(5));
    }
}
