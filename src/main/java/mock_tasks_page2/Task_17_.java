package mock_tasks_page2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_17_ {

    //Фильтрация нечетных чисел
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 23, 44, 12, 17, 22);

        List<Integer> result = list.stream()
                .filter(l-> l % 2 !=0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
