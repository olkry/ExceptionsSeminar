package Task02;

import java.util.Scanner;

public class Task02 {

    public static double divideNumbers(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите делимое(ЧТО делим): ");
        int dividend = Integer.parseInt(scan.next());
        System.out.println("Введите делитель(НА что делим): ");
        int divisor = Integer.parseInt(scan.next());
        try {
            double result = divideNumbers(dividend,divisor);
            System.out.printf("Результат деления %.2f", result);
        } catch (DivisionByZeroException e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
