package Task01;

import java.util.Scanner;

public class Task01 {
    public static String numberCheck(int num){
        if (num <= 0){
            throw new InvalidNumberException("Некорректное число");
        } else {
            return "Число корректно"; //Обязательный возврат String нужен для 1го варианта в main
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число для проверки: ");
        int number = Integer.parseInt(scan.next());
//        Первый вариант
//        System.out.println(numberCheck(number));
//        Второй вариант
        try {
            numberCheck(number);
            System.out.println("Число корректно");//Вылитит, только если сработает ошибка, из метода можно убрать
        } catch (InvalidNumberException e){
            System.out.println("Сработала ошибка: " + e.getMessage());
        }
    }
}
