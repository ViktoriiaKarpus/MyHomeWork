package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task45 {

    //Фильтрация по предикату длины и символа
    // Выбрать строки длиной от 4 до 6 и содержащие символ 'e'.

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Mia", "tree", "Java", "hello", "Stream", "Elephant");

        List<String> result = words.stream()
                .filter(word-> word.length() >= 4 && word.length() <=6)
                        .filter(word-> word.contains("e"))
                                .collect(Collectors.toList());


        System.out.println(result);

    }
}
