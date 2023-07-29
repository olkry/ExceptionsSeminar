package task01.operators;

import task01.exceptions.InvalidInputException;

public class Calculators {
    public double calculateShape(double a, double b) {
        if (a + b > Double.MAX_VALUE) {
            throw new InvalidInputException("Значение больше вместимости типа Double");
        } else {
            return a + b;
        }
    }

    public double calculateSubtract(double a, double b) {
        if (a - b > Double.MAX_VALUE) {
            throw new InvalidInputException("Значение больше вместимости типа Double");
        } else {
            return a - b;
        }
    }

    public double calculateDivide(double a, double b) {
        if (b == 0) {
            throw new InvalidInputException("Деление на ноль недопустимо!");
        }
        return a / b;

    }

    public double calculateMultiply(double a, double b) {
        if (a > Double.MAX_VALUE / b) {
            throw new InvalidInputException("Значение больше вместимости типа Double");
        }
        return a * b;
    }


}
