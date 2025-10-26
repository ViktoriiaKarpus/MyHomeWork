package solution_book_stream_api.task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    //Преобразование чисел в строки
    // Преобразуй список чисел в список строк с приставкой "Число: " — используй Function.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 23, 45, 67, 89, 100);

        Function<Integer, String> numbersToString = n-> "Number: " + n;

        List<String> result = numbers.stream()
                .map(numbersToString)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
