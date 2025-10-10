package hw8_lambda_stream_api.functions_interfases_and_lambda.task1.task4;

public class Main {
    //Лямбда-выражение с Function
    //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

    public static void main(String[] args) {
        Task4.myFunction f = str -> str.length();
        System.out.println(f.getLength("Lambda"));
    }
}
