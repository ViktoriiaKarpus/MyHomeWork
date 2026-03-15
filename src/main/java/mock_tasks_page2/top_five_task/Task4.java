package mock_tasks_page2.top_five_task;

public class Task4 {
    //Слайдинг-виндов (sliding window)
    //Один из самых универсальных и эффективных паттернов:
    // подстроки подмассивы,
    // минимальные/максимальные окна Без него не решаются
    // задачи на оптимизацию по длине или сумме.

    public static int findMaxSumSubArray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            windowSum+= arr[i];
            if(i >=k - 1){
                    maxSum = Math.max(maxSum, windowSum);
                    windowSum-=arr[i - k +1];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println("Max sum subarray of size 3: " + findMaxSumSubArray(arr, 3));
    }
}
