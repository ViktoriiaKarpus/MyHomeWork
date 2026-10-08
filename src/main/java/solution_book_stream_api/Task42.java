package solution_book_stream_api;

import java.util.*;

public class Task42 {

    //Список чисел без повторов и сортировка в обратном порядке
    // Сделай из List<Integer> упорядоченный по убыванию список уникальных чисел.

    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(1,2,33,33,2,5,5,5,78,78,24,24);

        List<Integer> result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                                .toList();


        System.out.println(result);
    }
}
