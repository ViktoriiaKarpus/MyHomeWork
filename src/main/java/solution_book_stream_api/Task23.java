package solution_book_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task23 {

    //Удаление по условию с removeIf
    // Удалить все отрицательные числа из List<Integer> с помощью removeIf().
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(-5, 3, -2, 8, 0, -1, 10));

        numbers.removeIf(n -> n < 0);

        System.out.println(numbers);
    }
}
