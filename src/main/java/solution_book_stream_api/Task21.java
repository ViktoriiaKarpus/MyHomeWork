package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task21 {

    //Создание подсписка
    // Оставь только первые 3 элемента, используя limit().

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Computer", "Science", "Law", "Doctor", "Bird", "Starlink");

        List<String> result = words.stream()
                .limit(3)
                .toList();

        System.out.println(result);
    }
}
