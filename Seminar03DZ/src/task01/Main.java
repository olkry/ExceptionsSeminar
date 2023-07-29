package task01;

import java.util.Scanner;

import task01.operators.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Какую Вы желаете провести операцию?\n" +
                    "Доступны на данный момент: +, -, /, *, ^.");
            String cmd = scan.nextLine();
            if (cmd.equals("+")) {
                try {
                    Calculators calculator = new Calculators();
                    System.out.println("Введите первое число: ");
                    double num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Введите второе число: ");
                    double num2 = Double.parseDouble(scan.nextLine());
                    System.out.println("Результат сложения: " + calculator.calculateShape(num1, num2));
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (cmd.equals("-")) {
                try {
                    Calculators calculator = new Calculators();
                    System.out.println("Введите первое число: ");
                    double num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Введите второе число: ");
                    double num2 = Double.parseDouble(scan.nextLine());
                    System.out.println("Результат вычетания: " + calculator.calculateSubtract(num1, num2));
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (cmd.equals("*")) {
                try {
                    Calculators calculator = new Calculators();
                    System.out.println("Введите первое число: ");
                    double num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Введите второе число: ");
                    double num2 = Double.parseDouble(scan.nextLine());
                    System.out.println("Результат умножения: " + calculator.calculateMultiply(num1, num2));
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (cmd.equals("/")) {
                try {
                    Calculators calculator = new Calculators();
                    System.out.println("Введите первое число: ");
                    double num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Введите второе число(не нуль): ");
                    double num2 = Double.parseDouble(scan.nextLine());
                    System.out.println("Результат деления: " + calculator.calculateDivide(num1, num2));
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (cmd.equals("^")) {
                try {
                    PowerCalculator calculator = new PowerCalculator();
                    System.out.println("Введите первое число: ");
                    double num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Введите второе число(если первое было 0, то не может быть отрицательным: ");
                    double num2 = Double.parseDouble(scan.nextLine());
                    System.out.println("Результат возведения в степень: " + calculator.calculatePower(num1, num2));
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else {
                System.out.println("Введен неверный оператор\n" +
                        "Введите 1 чтобы перезапустить или любой другой символ, чтобы выйти.");
                String button = scan.next();
                if (button.equals("1")) {
                    main(args);
                } else {
                    System.exit(0);
                }
            }
        }
    }
}
