package solution_book_stream_api.task8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    //Нахождение первого подходящего элемента
    // Найди первую строку, начинающуюся на "A". Используй filter().findFirst().

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Table", "Amount", "Furniture", "Appels", "Garten");

       Optional<String> wordStartsFromLetterA =  stringList.stream()
                .filter(s -> s.startsWith("A"))
               .findFirst();

        System.out.println(wordStartsFromLetterA.orElse("Not found"));
    }
}
