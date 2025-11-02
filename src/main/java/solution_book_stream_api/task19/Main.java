package solution_book_stream_api.task19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //Объединение строк через Join
    // Объедини строки списка в одну через запятую с помощью Collectors.joining().

    public static void main(String[] args) {

        List<String> words= Arrays.asList("Beautiful", "Animal", "Cousin", "Solution", "University", "Impossible",
                "Combinations");

        String wordsJoin = words.stream()
                .collect(Collectors.joining(","));

        System.out.println(wordsJoin);
    }
}
