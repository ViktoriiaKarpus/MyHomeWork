package mock_tasks_page2;

public class Task3 {
    //Поиск максимального числа

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 54, 3, 4, 29, 5, -1};
        findMax(array);
        System.out.println(findMax(array));
    }
}
