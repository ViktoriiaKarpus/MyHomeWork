package hw8_lambda_stream_api.functions_interfases_and_lambda.task1.task3;

public class Task3 {

    //Лямбда-выражение с Predicate
    //Задача: Напишите лямбду, которая проверяет, является ли число чётным.

    @FunctionalInterface

    public interface Predicate<T>{
        boolean test(T t);
    }
}
