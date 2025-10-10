package hw8_lambda_stream_api.stream_api_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;

public class Task3 {

    //Поиск среднего значения чисел
    //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 22, 30, 48, 57, 25, 135, 178);

        double average = num.stream()
                .mapToInt(numb-> numb)
                .average()
                .orElse(0);

        System.out.println(average);
    }
}
