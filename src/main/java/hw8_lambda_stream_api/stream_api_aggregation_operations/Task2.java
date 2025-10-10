package hw8_lambda_stream_api.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    //Поиск минимального элемента
    //Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число,
    //используя Stream API.


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1200, 55, 62, 76, 545, 23, 78, 99, 145);

        numbers.stream()
                .min(Integer::compare)
                .ifPresent(min-> System.out.println("Min number:" + min));
    }
}
