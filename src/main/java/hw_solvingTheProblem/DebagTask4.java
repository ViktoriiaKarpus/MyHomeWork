package hw_solvingTheProblem;

public class DebagTask4 {
    //Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.

    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
