package hw8_lambda_stream_api.functions_interfases_and_lambda.task1;

public class Main {
    //Создайте свой функциональный интерфейс
    //Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
    // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

    public static void main(String[] args) {
        Task1.MathOperation add = (x, y) -> x + y;
        Task1.MathOperation substract = (x, y) -> x - y;
        Task1.MathOperation multiply = (x, y) -> x * y;
        Task1.MathOperation divide = (x, y) -> x / y;

        System.out.println(add.operation(3,5));
        System.out.println(substract.operation(23,5));
        System.out.println(multiply.operation(32,5));
        System.out.println(divide.operation(35,5));

    }
}
