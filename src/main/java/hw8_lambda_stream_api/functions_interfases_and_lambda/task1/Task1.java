package hw8_lambda_stream_api.functions_interfases_and_lambda.task1;

public class Task1 {
//Создайте свой функциональный интерфейс
//Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
// Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

    @FunctionalInterface
    public interface MathOperation{
        int operation(int x, int y);
    }


}
