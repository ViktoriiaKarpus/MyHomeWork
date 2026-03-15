package mock_tasks_page2;

public class Task_3_ {

//Сумма чисел массива

    public static int findSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2,3, 4, 5};
        findSum(array);
        System.out.println(findSum(array));
    }
}
