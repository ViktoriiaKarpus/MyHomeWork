package solution_book_solving_the_problems;

public class Task7 {

    public static int min(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n <= min) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, 5, 6, -7};
        System.out.println(min(nums));
    }

}
