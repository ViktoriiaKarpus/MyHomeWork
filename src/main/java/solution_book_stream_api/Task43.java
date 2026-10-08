package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task43 {

    //Map по первой букве
    // Преобразовать список строк в Map<Character, List<String>>, где ключ — первая буква.

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Mia", "Conclusion", "Astronaut", "Arraise");

        Map<Character, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(word-> word.charAt(0)));


        System.out.println(result);
    }

}
