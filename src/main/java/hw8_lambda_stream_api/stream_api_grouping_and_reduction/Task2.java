package hw8_lambda_stream_api.stream_api_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    // Группировка чисел по чётности
    //Задача: Напишите программу, которая принимает список чисел и
    // группирует их на чётные и нечётные, используя Stream API.

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 22, 30, 48, 57, 25, 135, 178);

       Map<Boolean,List<Integer>> grouped =  num.stream()
                .collect(Collectors.groupingBy(n-> n % 2 == 0));

        System.out.println(grouped);
    }
}
