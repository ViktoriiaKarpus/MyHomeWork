package solution_book_stream_api;

import java.util.Map;
import java.util.stream.Collectors;

public class Task32 {

    //Мапа в строку
    //    Преобразовать Map<String, Integer> в строку вида ключ=значение через запятую
    //    — с использованием entrySet().stream() и Collectors.joining().

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "Alice", 22,
                "Bob", 25,
                "Charlie", 30
        );

        String result = map.entrySet()
                .stream()
                .map(entry-> entry.getKey() + " " + entry.getValue())
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
