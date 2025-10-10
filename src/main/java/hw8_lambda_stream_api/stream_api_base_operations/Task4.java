package hw8_lambda_stream_api.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    // Создание списка квадратов чисел
    //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
    // где каждое число заменено на его квадрат, используя Stream API.

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 22, 30, 48, 57, 25, 135, 178);
        
        List<Integer> squareNumber = num.stream()
                .map(n-> n * n)
                .collect(Collectors.toList());

        System.out.println(squareNumber);
    }
}
