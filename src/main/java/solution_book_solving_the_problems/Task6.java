package solution_book_solving_the_problems;

public class Task6 {

    public static String getElement(String[] array, int index) {
        if (index < array.length) {
            return array[index];
        }
        return null;
    }

    public static void main(String[] args) {

        String[] array = {"Clear", "Simple", "Destiny"};

        int index = 3;
        System.out.println(getElement(array, index));
    }

}
