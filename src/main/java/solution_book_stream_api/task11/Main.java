package solution_book_stream_api.task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //Проверка хотя бы одного совпадения
    // Есть ли хотя бы одно слово длиной больше 10 символов?

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Beautiful", "Animal", "Cousin", "Solution", "University", "Impossible",
                "Combinations");
        boolean words = str.stream()
                .map(String::toUpperCase)
                .anyMatch(s -> s.length() > 10);

        System.out.println(words);
    }
}
