package solution_book_stream_api.task9;

import java.util.Arrays;
import java.util.List;

public class Main {

    //Сумма всех элементов
    // Сосчитай сумму всех чисел с помощью reduce().

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 22, 56, -1, 78, 99, 25, 26,-33, 37, 75,77);

        int sumOfAllNumbers = numbers.stream()
                .reduce(0,Integer::sum);

        System.out.println(sumOfAllNumbers);

    }
}
