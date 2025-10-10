package hw8_lambda_stream_api.functions_interfases_and_lambda.task1.task3;

public class Main {
    public static void main(String[] args) {
        //Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.

        Task3.Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(12));
        System.out.println(isEven.test(9));
    }
}
