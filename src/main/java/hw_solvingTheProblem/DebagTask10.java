package hw_solvingTheProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebagTask10 {

    //Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
         if(names.removeIf(name-> name.startsWith("A")));
        System.out.println(names);
    }
}
