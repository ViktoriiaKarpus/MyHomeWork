package solution_book_solving_the_problems;

public class Task11 {

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        System.out.println(divide(a, b));
    }

}
