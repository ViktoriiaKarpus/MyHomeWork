package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task44 {

    //Получение подстрок
    // Преобразовать список строк в список их первых трёх символов (если строка >= 3 символов).

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Mia", "Conclusion", "Astronaut", "Arraise");

        List<String> result = words.stream()
                .filter(word-> word.length() >= 3)
                .map(w -> w.substring(0, 3))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
