package hw8_lambda_stream_api.stream_api_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {

    //Группировка строк по первой букве
    //Задача: Напишите программу, которая принимает список строк и группирует их по первой букве,
    // используя Stream API.

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Beautiful", "Love", "Skin", "Careless", "Life", "Enemy",
                "Education", "Boss", "Cat", "Son");

        Map<Character, List<String>> grouped = str.stream()
                .collect(Collectors.groupingBy(st-> st.charAt(0)));

        System.out.println(grouped);
    }
}
