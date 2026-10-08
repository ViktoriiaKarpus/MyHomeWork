package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Task25 {

    //Инициализация списка лямбдами
    // Создай список Supplier<String> и вызови их для генерации строк.
    public static void main(String[] args) {// разоьраться

        // 1. Создаём список Supplier-ов
        List<Supplier<String>> suppliers = Arrays.asList(
                () -> "Hello",
                () -> "World",
                () -> "Java",
                () -> "Streams"
        );

        // 2. Вызываем каждый Supplier и получаем строки
        List<String> result = suppliers.stream()
                .map(Supplier::get)   // вызываем get() у каждого
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
