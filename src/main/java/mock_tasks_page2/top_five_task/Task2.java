package mock_tasks_page2.top_five_task;

public class Task2 {
    /**
     * Поиск максимума / минимума в массиве
     * Самая базовая подзадача, без которой не обходится почти ни одна задача на массивы.
     * Часто используется как вспомогательная часть даже в сложных задачах.*/

    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
               max=array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if(min> array[i]){
                    min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 23, 67, 881, 45};
        findMax(array);
        System.out.println( findMax(array));


        findMin(array);
        System.out.println(findMin(array));
    }
}
