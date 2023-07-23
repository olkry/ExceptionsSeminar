//Задача, написать программу, которая запрашивает возраст пользователя.
//Если возраст <0 или 120> выдать InvalidAgeException с сообщением "Некорректный возраст".
//Если введено не число - исключение NumberFormatExeption c сообщением
//"Некоректный формат числа".
//В остальныйх случаях, должна вывести "Ваш возраст: ###".
public class Task01InvalidAge {

    public static class InvalidAgeException extends RuntimeException{

        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
