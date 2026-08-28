package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task34 {
    //Чередование фильтра и отображения
    // Фильтровать числа, больше 10, и преобразовать в строки вида "Больше десяти: X".

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 4, 55, 32, 78, 91);

        List<String> resultNumbersMoreThanTen = numbers.stream()
                .filter(n-> n > 10)
                .map(n-> "Больше десяти: " + n)
                .collect(Collectors.toList());

        System.out.println(resultNumbersMoreThanTen);
    }
}
