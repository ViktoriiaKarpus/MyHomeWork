package mock_tasks_page2;

import java.util.*;

public class Task_16_ {


    //Удаление дубликатов из списка
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 7, 7, 8,8, 9);
        Set<Integer> set = new HashSet<>(list);
        List<Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}
