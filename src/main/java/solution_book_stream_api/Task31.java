package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task31 {

    //Удаление строк по шаблону
    // Удалить из списка строки, содержащие только цифры, используя removeIf() и Predicate.
    public static void main(String[] args) {
        List<String> str = Arrays.asList("125", "Cat", "452", "Dog", "Sweet", "127");

        Predicate<String> onlyDigits = s -> s.matches("\\d+");

        List<String> result = str.stream()
                .filter(onlyDigits.negate())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
