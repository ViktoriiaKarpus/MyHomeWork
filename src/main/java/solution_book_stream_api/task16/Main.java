package solution_book_stream_api.task16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    //Поиск максимального значения
    // Найди максимальное значение в списке чисел через max() и Comparator.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 25, 67, 452, 877, 121, 345, 841, 765);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        if (max.isPresent()){
            System.out.println("Max: " +max.get());
        }
    }
}
