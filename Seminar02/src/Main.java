public class Main {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException ex) {
            System.out.println("Caught CustomException: " + ex.getMessage());
        }


    }

    public static int divideNumbers(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Division y zero is not allowed.");
        }
        return dividend / divisor;
    }


    //    Пример класса пользовательского исключения с наследованием от Exeption
    static class CustomException extends Exception {
        //        Конструктор с сообщением об ошибке
        public CustomException(String msg) {
            super(msg);
        }

    }
}