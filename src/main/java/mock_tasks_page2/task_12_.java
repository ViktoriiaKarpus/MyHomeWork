package mock_tasks_page2;

import java.util.*;

public class task_12_ {

    //Проверка уникальности элементов

    public static boolean hasDuplicates(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int s: array){
            if(!set.add(s)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 4, 5, 4, 3, 7};
        hasDuplicates(array);
        System.out.println(hasDuplicates(array));
    }
}
