package hw8_lambda_stream_api.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    //Сумма всех элементов списка
    //Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1200, 55, 62, 76, 545, 23, 78, 99, 145);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
