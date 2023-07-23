public class Ansver1 {
    public static void arrayOutOfBoundsException() {
        int[] arrey = new int[3];
        System.out.println(arrey[5]);

    }

    public static void divisionByZero() {
        int numA = 3;
        int numB = 0;
        int result = numA/numB;
    }

    public static void numberFormatException() {
        int number = Integer.parseInt("345jf");

    }
}

class Printer {
    public static void main(String[] args) {
        Ansver1 ans = new Ansver1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
