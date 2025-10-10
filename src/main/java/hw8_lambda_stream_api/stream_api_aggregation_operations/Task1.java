package hw8_lambda_stream_api.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    //Поиск максимального элемента
    //Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 76, 545, 23, 78, 99, 145);

        numbers.stream()
                .max(Integer::compare)
                .ifPresent(max-> System.out.println("Max number:" + max));
    }
}
