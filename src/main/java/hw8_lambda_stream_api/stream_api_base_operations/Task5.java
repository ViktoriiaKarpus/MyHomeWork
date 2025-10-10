package hw8_lambda_stream_api.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    //Удаление дубликатов из списка
    //Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 11, 22, 30, 25, 48, 57, 57, 25, 135, 30, 178);
        List<Integer> withoutDublicates = num.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(withoutDublicates);
    }
}
