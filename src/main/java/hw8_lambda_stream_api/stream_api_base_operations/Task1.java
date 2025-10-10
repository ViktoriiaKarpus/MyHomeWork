package hw8_lambda_stream_api.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    //Фильтрация строк по длине больше 5
    //Задача: Напишите программу, которая принимает список строк и
    // удаляет из него все строки длиной 5 символов и менее,
    // используя Stream API.
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Beautiful", "Love", "Skin", "Careless", "Education", "Son");
        str.stream()
                .filter(st -> st.length() > 5)
                .forEach(System.out::println);
    }
}
