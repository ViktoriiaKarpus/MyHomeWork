package solution_book_static_final.task6;

public class NumberOddEven {
    //6. Проверка чётности без объекта
    // Создай класс с методом, который проверяет, чётное ли число.
    // Этот метод должен быть доступен без создания объекта класса.
    // Пояснение: подбери подходящую структуру для вызова метода напрямую через имя класса.

    private int number;

    NumberOddEven() {

    }

    public int getNumber() {
        return number;
    }

    public static boolean isNumberOddoREven(int number) {
        for (int i = 0; i < number; i++) {
            if (number % 2 == 0) {
                return true;
            }
        }
        return false;
    }

}

