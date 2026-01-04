package solution_book_solving_the_problems;

public class Task8 {

    public static String join(String a, String b) {
        if (a == null) {
            a = " ";
        }
        return a.concat(" ").concat(b);
    }

    public static void main(String[] args) {

        String a = null;
        String b = "Hello";
        System.out.println(join(a, b));
    }
}

