package solution_book_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task33 {

    //Выбор максимального по вычисляемому полю
    // Найти строку с наибольшим числом гласных.

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hello", "Man", "My", "Dear", "World", "Happiness");

        Optional<String> result = str.stream()
                .max(Comparator.comparingLong(s -> s.toLowerCase().chars()
                        .filter(c -> "aeiou".indexOf(c) >= 0)
                        .count()));

        System.out.println(result.orElse(""));
    }
}
