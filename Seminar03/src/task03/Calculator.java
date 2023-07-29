package task03;

public class Calculator {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;

    }

    public double multiply(double a, double b) {
        if (a > Double.MAX_VALUE / b) {
            throw new ArithmeticException("Double type overflow");
        }
        return a * b;
    }

    public double subtract(double a, double b) {
        if (a < b) {
            throw new ArithmeticException("Get a negative number");
        } else {
            return a - b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.divide(10, 0));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println(calculator.multiply(5, 10));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println(calculator.subtract(5, 10));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}