public class ThrowsKeyWord {
    public static void main(String[] args) {
        try {
            int result = division(1, 1);
            System.out.println(result);
            int result2 = division(1, 0);
            System.out.println(result2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            int a = doSomethind(2);
        } catch (MyCheckedExeption e) {
            throw new RuntimeException(e);
        }
    }

    public static int division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division dy zero is impossible!");
        }
        return a / b;
    }

    public static int doSomethind(int a) throws MyCheckedExeption {
        if (a == 1) {
            throw new MyCheckedExeption();

        }
        return 0;
    }
}
