package hw8_lambda_stream_api.stream_api_aggregation_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {

    // Поиск первого элемента, начинающегося на "Б"
    //Задача: Напишите программу, которая принимает список строк и находит первую строку,
    // начинающуюся на букву "Б", используя Stream API.

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Anna", "Boris", "Luisa", "Ben", "Stefi");

        Optional<String> firstB = strings.stream()
                .filter(s -> s.startsWith("B"))
                .map(String::toUpperCase)
                .findFirst();

        firstB.ifPresentOrElse(
                s-> System.out.println("First String stats with letter 'B' is :" + s),
                ()-> System.out.println("No string starts with letter 'B'")
        );


    }
}
