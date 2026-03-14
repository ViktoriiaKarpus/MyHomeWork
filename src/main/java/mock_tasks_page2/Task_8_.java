package mock_tasks_page2;

public class Task_8_ {

    //Поиск второго максимального элемента

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 33, 45, 67, 89, 100};

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];

            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }

        }
        System.out.println(secondMax);
    }
}
