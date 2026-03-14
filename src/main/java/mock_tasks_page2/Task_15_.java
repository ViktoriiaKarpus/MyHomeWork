package mock_tasks_page2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_15_ {


    //Фильтрация списка строк по префиксу
    //Оставить только строки, начинающиеся с 'A'.
    public static void main(String[] args) {
        List<String> str = Arrays.asList(" Amy", " Caty", "Sam ", "Anna");

        List<String> result = str.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
