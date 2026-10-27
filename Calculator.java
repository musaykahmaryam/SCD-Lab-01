package lab01;

/**
 * SE-312L Software Construction and Development - Lab 01
 * Simple calculator class used to practise GitHub version control.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int n) {
        return n * n;
    }

    // Added in branch v2: division method
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    // Added from Eclipse: modulus method
    public int modulus(int a, int b) {
        return a % b;
    }
}
