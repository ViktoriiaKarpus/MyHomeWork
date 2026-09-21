package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;

public class Task37 {
    //Формирование списка квадратов чисел
    // Преобразовать список чисел в список их квадратов.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 9);

        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(result);

    }
}
