package mock_tasks_page2;

import java.util.Arrays;
import java.util.List;

public class Task_11_ {

    //Сумма значений в списке

    public static int findSum(List<Integer> list) {

        if (list == null || list.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int s : list) {
            sum += s;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        findSum(list);
        System.out.println( findSum(list));
    }
}
