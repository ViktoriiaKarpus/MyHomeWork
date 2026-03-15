package mock_tasks_page2.top_five_task;

import java.util.*;

public class Task3 {

    public static int[] removeDuplicates(int[] array){
        int[] temp = new int[array.length];

        int size = 0;

        for(int i = 0; i < array.length; i++){
            boolean isDuplicates = false;
            for(int j = 0; j < size; j++){
                if(array[i] == temp[j]){
                    isDuplicates = true;
                    break;
                }
            }
            if(!isDuplicates){
                temp[size++] = array[i];
            }
        }
        return Arrays.copyOf(temp, size);
    }

    //Удаление дубликатов из массива / списка
    //Часто проверяется как логика + знание структур (, , , ). Классика уровня LeetCode Easy.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1, 23, 24, 23, 24, 5, 7, 22, 22, 77, 89);

        Set<Integer> set = new HashSet<>(list);

        List<Integer> result = new ArrayList<>(set);

        System.out.println(result);

        int[] array = {1,5, 1,  5, 6,56,99,  78, 99, 1234, 3};
        System.out.println(Arrays.toString(removeDuplicates(array)));

    }
}
