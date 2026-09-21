package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task29 {

    //Проверка пустоты списка через Stream
    // Проверь, содержит ли список только пустые строки.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("", "", "");

        boolean result = list.stream()
                .allMatch(String::isEmpty);

        System.out.println(result);
    }
}
