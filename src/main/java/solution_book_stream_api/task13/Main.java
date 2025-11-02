package solution_book_stream_api.task13;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    //Создание списка через Supplier
    // Создай список из 5 случайных чисел от 1 до 10, используя Supplier<Integer>.

    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() *10) + 1;

        List<Integer> randomNumber = Stream.generate(randomSupplier)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(randomNumber);
    }
}
