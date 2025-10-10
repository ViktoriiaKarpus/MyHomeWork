package hw8_lambda_stream_api.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    // Преобразование строк в их длины
    //Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину,
    // используя Stream API.


    public static void main(String[] args) {

        List<String> str = Arrays.asList("Beautiful", "Love", "Skin", "Careless", "Education", "Son");

        List<Integer> lengths = str.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(lengths);
    }
}
