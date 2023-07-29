package Task03;

import java.util.Scanner;

//public class Task03 {
//    public static String numberCheck(int number1, int number2, int number3) throws NumberOutOfRangeException,
//            NumberSumException, DivisionByZeroException {
//        if (number1 > 100) {
//            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
//        }
//        if (number2 < 0) {
//            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
//        }
//        if (number1 + number2 < 10) {
//            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
//        }
//        if (number3 == 0) {
//            throw new DivisionByZeroException("Деление на ноль недопустимо");
//        }
//        else {
//            return "Проверка пройдена успешно";
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите первое число(МЕНЕЕ 100): ");
//        int number1 = Integer.parseInt(scan.next());
//        System.out.println("Введите второе число(БОЛЕЕ 0): ");
//        int number2 = Integer.parseInt(scan.next());
//        System.out.println("Введите третье число(НЕ 0): ");
//        int number3 = Integer.parseInt(scan.next());
//        try {
//            System.out.println(numberCheck(number1,number2,number3));
//        } catch (NumberSumException | DivisionByZeroException | NumberOutOfRangeException e) {
//            System.out.println("Ошибка принятых данных: " + e.getMessage());
//        }
//    }
//}

// Улучшеный вариант от Леонида.
public class Task03 {

    public static String numberCheck(int number1, int number2, int number3)
            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {

        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        } else if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        } else if (number1 + number2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        } else if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            return "Проверка пройдена успешно";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите первое число(МЕНЕЕ 100): ");
            int number1 = Integer.parseInt(scan.next());
            System.out.println("Введите второе число(БОЛЕЕ 0): ");
            int number2 = Integer.parseInt(scan.next());
            System.out.println("Введите третье число(НЕ 0): ");
            int number3 = Integer.parseInt(scan.next());

            System.out.println(numberCheck(number1,number2,number3));
        } catch (NumberSumException | DivisionByZeroException | NumberOutOfRangeException e) {
            System.out.println("Ошибка принятых данных: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число!");
        } finally {
            scan.close();
        }
    }
}