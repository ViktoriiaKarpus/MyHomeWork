package solution_book_solving_the_problems;

public class Task3 {

    public static int sum(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};//15
        System.out.println(sum(nums));
    }
}



