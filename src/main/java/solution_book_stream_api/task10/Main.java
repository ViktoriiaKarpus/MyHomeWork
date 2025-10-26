package solution_book_stream_api.task10;

import java.util.Arrays;
import java.util.List;

public class Main {

    //Проверка условия для всех элементов
    // Проверь, что все числа в списке положительные — используй allMatch().

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 22, 56, 78, 99, 25, 26, 37, 75,77);

        boolean isAllNumbersPositive = numbers.stream()
                .allMatch( num-> num > 0);

        System.out.println(isAllNumbersPositive);
    }
}
