package hw8_lambda_stream_api.functions_interfases_and_lambda.task1.task5;

import java.util.function.Consumer;

public class Main {
    //Использование Consumer
    //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.

    public static void main(String[] args) {
        Consumer<String> printString = str -> System.out.println(str);

        printString.accept("Hello, World!");
    }
}
