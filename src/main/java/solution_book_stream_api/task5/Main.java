package solution_book_stream_api.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    //Сортировка по убыванию
    // Отсортируй список строк по убыванию длины, используя Comparator и sorted().

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Beautiful", "Success", "Tee", "Imagination", "Skill", "Round", "Lips");

        List<String> sorted = stringList.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        System.out.println(sorted);
    }
}
