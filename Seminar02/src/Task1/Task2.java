package Task1;

import java.util.Scanner;

public class Task2 {
    public static void negativeNum(int num) {
        if (num < 0) {
            throw new NegativeNumberException("Число меньше нуля");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число: ");
        int number = Integer.parseInt(scan.nextLine());
        try {
            negativeNum(number);
        } catch (NegativeNumberException e){
            System.out.println("Сработала ошибка: " + e.getMessage());
        }

    }
}
