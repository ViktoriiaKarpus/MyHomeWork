package hw6.task3_HashSet;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {

    //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

    public  static Set<String> returnWithoutDub(List<String> list){
        return list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

    }

    public static void main(String[] args) {

        List<String> str = new LinkedList<>();
        str.add("world");
        str.add("World");
        str.add("flower");
        str.add("flower");
        str.add("beautiful");
        str.add("Beautiful");
        str.add("Window");

        Set<String> set = returnWithoutDub(str);
        System.out.println(set);

    }
}
