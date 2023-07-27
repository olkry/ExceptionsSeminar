package Task2;

import Task1.NegativeNumberException;

public class Task2 {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new NegativeNumberException("Number<0! ");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        System.out.println(calculateSquareRoot(25));
        System.out.println(calculateSquareRoot(-25));
    }
}
