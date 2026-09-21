package solution_book_stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class Task30 {

    //Построение строки с префиксом и постфиксом
    // Собери строку из слов с joining(", ", "[", "]").

    public static void main(String[] args) {

        List<String> words = List.of("Cat", "Dog", "Bird");

        String result = words.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(result);
    }
}
