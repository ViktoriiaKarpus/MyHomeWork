package hw8_lambda_stream_api.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    //Фильтрация чисел, кратных 5
    //Задача: Напишите программу, которая принимает список чисел и отбирает только те,
    // которые делятся на 5 без остатка, используя Stream API.

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 22, 30, 48, 57, 25, 135, 178);
        List<Integer> filtered = num.stream()
                .filter(numb -> numb % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
