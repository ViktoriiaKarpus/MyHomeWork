package solution_book_static_final.task9;

public class Main {

    public static void main(String[] args) {

        System.out.println(Calculator.add(2, 5));          // 7
        System.out.println(Calculator.multiply(112, 85));  // 9520
        System.out.println(Calculator.divide(10, 2));      // 5
        System.out.println(Calculator.divide(0, 5));       // 0

        try {
            System.out.println(Calculator.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
