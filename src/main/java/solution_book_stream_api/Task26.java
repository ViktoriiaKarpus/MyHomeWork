package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task26 {

    //Сортировка без учёта регистра
    // Отсортируй строки без учёта регистра.

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hello", "man", "My", "Dear", "World", "happiness");

        List<String> result = str.stream()
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                                .toList();

        System.out.println(result);
    }
}
