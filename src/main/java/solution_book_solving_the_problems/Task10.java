package solution_book_solving_the_problems;

public class Task10 {

    public static boolean contains(String[] array, String value) {

        for (String s : array) {
            if (s == null && value == null) {
                return true;
            }
            if (s != null && s.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] array = {"Clear", "Simple", null};
        String value = "Hello";

        System.out.println(contains(array, value));
    }
}

