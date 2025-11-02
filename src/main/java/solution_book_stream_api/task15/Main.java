package solution_book_stream_api.task15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //Группировка по длине строки
    // Группируй строки по их длине с помощью Collectors.groupingBy().

    public static void main(String[] args) {

        List<String> words= Arrays.asList("Beautiful", "Animal", "Cousin", "Solution", "University", "Impossible",
                "Combinations");

        Map<Integer, List<String>> groupStr = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupStr);
    }
}
