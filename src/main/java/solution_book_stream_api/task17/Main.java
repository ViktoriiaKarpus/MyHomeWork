package solution_book_stream_api.task17;

import java.util.Arrays;
import java.util.List;

public class Main {
    //Подсчёт количества вхождений по условию
    // Сколько строк содержат букву "e"?

    public static void main(String[] args) {
        List<String> words= Arrays.asList("Beautiful", "Animal", "Cousin", "Solution", "University", "Impossible",
                "Combinations");

        char letter = 'e';
        long count = words.stream()
                .filter(s-> s.contains(String.valueOf(letter)))
                .count();

        System.out.println(count);
    }
}
