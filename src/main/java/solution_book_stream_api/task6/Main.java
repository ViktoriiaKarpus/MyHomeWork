package solution_book_stream_api.task6;

import java.util.Arrays;
import java.util.List;

public class Main {
    //Подсчёт чётных чисел
    // Сосчитай количество чётных чисел в списке.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 22, 56, -1, 78, 99, 25, 26,-33, 37, 75,77);

        long evenCount = numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();

        System.out.println(evenCount);
    }
}
