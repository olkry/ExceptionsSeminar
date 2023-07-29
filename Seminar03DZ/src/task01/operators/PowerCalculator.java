package task01.operators;

import task01.exceptions.InvalidInputException;

public class PowerCalculator {
    public double calculatePower(double a, double b) {
        if (a == 0 & b < 0) {
            throw new InvalidInputException("Введены некорректные данные");
        } else if (Math.pow(a, b) > Double.MAX_VALUE) {
            throw new InvalidInputException("Значение больше вместимости типа Double");
        }
        return Math.pow(a, b);
    }
}
