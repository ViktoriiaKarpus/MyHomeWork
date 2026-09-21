package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task46 {

    //Отбор четных индексов
    // Вернуть элементы списка, стоящие на чётных позициях (0, 2, 4, ...).
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Mia", "Conclusion", "Astronaut", "Arraise", "Java", "Stream", "Kotlin");

        List<String> result = IntStream.range(0, words.size())// тот же цикл for (int i = 0; i < words.size(); i++), только в виде стрима.
                .filter(w -> w % 2 == 0)
                .mapToObj(words::get)
                .toList();

        System.out.println(result);
    }
}
