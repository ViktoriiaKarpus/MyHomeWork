package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task41 {

    //Фильтрация и приведение к верхнему регистру
    // Выбрать строки длиной больше 3 и привести их к верхнему регистру.

    public static void main(String[] args) {
        List<String> str = Arrays.asList("I", "will", "Find", "A", "dream", "Job");

        List<String> result = str.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }
}
