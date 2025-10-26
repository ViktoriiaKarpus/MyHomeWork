package solution_book_stream_api.task7;

import java.util.Arrays;
import java.util.List;

public class Main {

    //Получение уникальных элементов
    // Из списка чисел убери повторы и отсортируй результат по возрастанию.

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 77, 22, 56, 56, -1, 78, 22, 99, 75, 26, 25, 37, 75, 77);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(uniqueNumbers);
    }
}
