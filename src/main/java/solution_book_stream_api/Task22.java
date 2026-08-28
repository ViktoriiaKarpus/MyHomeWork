package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task22 {

    //Пропуск первых элементов
    // Пропусти первые 2 элемента списка, выведи остальные.

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Computer", "Science", "Law", "Doctor", "Bird", "Starlink");

        List<String> result = words.stream()
                .skip(2)
                .toList();

        System.out.println(result);
    }
}
