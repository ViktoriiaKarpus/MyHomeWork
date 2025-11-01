package solution_book_stream_api.task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    //Фильтрация по нескольким условиям
    // Оставь только положительные чётные числа. Используй цепочку filter() с несколькими Predicate.

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 22, 56, -1, 78, 99, 25, 26,-33, 37, 75,77);

        Predicate<Integer> isPositiveNumbers = n -> n > 0;
        Predicate<Integer> testOnlyPositiveEvenNumbers = n-> n % 2 == 0;

        List<Integer> result = numbers.stream()
                .filter(isPositiveNumbers)
                .filter(testOnlyPositiveEvenNumbers)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
