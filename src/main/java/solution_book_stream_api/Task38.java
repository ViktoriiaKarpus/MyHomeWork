package solution_book_stream_api;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task38 {
    //Частичное применение (partial application)
    // Создай Function<String, Predicate<String>>, которая возвращает предикат: строка начинается с заданного префикса.

    public static void main(String[] args) {

        Function<String, Predicate<String>> startsWith = prefix -> str -> str.startsWith(prefix);

        List<String> words = List.of("Apple", "Application", "Banana", "Apricot", "App", "Cherry");

        // Multi-letter prefix
        Predicate<String> startsWithApp = startsWith.apply("App");

        List<String> result = words.stream()
                .filter(startsWithApp)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
