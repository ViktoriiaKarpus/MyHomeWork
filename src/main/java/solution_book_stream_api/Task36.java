package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task36 {

    //Суммирование длин всех строк
    // Сосчитай суммарную длину всех строк в списке.
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hello", "Map", "where", "Annotation");

        int result = str.stream()
                        .mapToInt(String::length)
                                .sum();
        System.out.println(result);

    }
}
