import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        int arr[] = new int[4];
////        System.out.println(arr[400]);
//        try {
//            System.out.println("Вошли в блок try");
//            int c = Integer.parseInt("324sdfdg");
//            int a = arr[100];
//            System.out.println("Этой строки не будет! " + a);
//        }
////        catch (ArrayIndexOutOfBoundsException e) {
////            System.out.println("Попали в catch: " + e.getMessage());
////        } catch (NumberFormatException e) {
////            System.out.println("Попали в catch: " + e.getMessage());
////        }
//        catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {
//            System.out.println("Попали в catch: " + e.getMessage());
//        }
//        finally {
//            System.out.println("Блок finally выполнился");
//        }
//        System.out.println("Продолжили дальше");

//        Задача Task01InvalidAge
        System.out.println("Введите ваш возраст: ");
        Scanner in = new Scanner(System.in);
        try {
            int age = Integer.parseInt(in.nextLine());
            if (age > 120 || age < 0) {
                throw new Task01InvalidAge.InvalidAgeException("Некорректный возраст");
            }
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Некоректный формат числа; " + e.getMessage());
        }


    }
}
