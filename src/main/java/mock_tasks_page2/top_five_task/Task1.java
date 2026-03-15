package mock_tasks_page2.top_five_task;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    //Подсчёт частот элементов (HashMap / частотный словарь)
    //Применяется в задачах на: анаграммы, поиск большинства,
    // нахождение дубликатов, сортировку по частоте Это фундаментальный паттерн,
    // часто проверяется в интервью.

    public static void main(String[] args) {
        int [] nums = {1, 2, 2, 2 ,3, 3, 3, 4};

        Map<Integer, Integer> freq= new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) +1);
        }

        System.out.println("Element frequencies: " +  freq);
    }
}
