package solution_book_static_final.task9;

public final class Calculator {

    //10. Класс без наследников
    // Разработай класс с полезными методами (например, арифметические операции),
    // от которого нельзя унаследоваться.
    // Пояснение: определи, как запретить наследование,
    // и продумай, какие методы можно сделать статическими.


    private Calculator() {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

}
