package mock_tasks_page2;

public class Task1 {

    //Проверка палиндрома

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return true;
            }
            left++;
            right--;
        }

        return false;
    }

    public static void main(String[] args) {
        isPalindrome("ababab");
        System.out.println(isPalindrome("ababab"));
    }
}
