package solution_book_solving_the_problems;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static int findIndex(List<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "3","25", "41", "153");

        String target = "45";
        System.out.println(findIndex(list, target));
    }
}
