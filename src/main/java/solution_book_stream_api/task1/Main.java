package solution_book_stream_api.task1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    //Фильтрация строк по длине
    // Из списка строк выбери только те, чья длина больше 5, используя Predicate и stream().filter().

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Beautiful", "Man", "Skills", "Round", "Education");

        Predicate<String> lengthLessThanFive = str -> str.length() > 5;

        List<String> result = words.stream()
                .filter(lengthLessThanFive::test)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
