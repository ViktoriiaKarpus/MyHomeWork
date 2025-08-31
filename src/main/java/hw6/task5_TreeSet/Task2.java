package hw6.task5_TreeSet;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    //Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.


    public static Set<Integer> addWithoutDuplicates(List<Integer> num){
        return new TreeSet<>(num);
    }

    public static void main(String[] args) {

        List<Integer> num = new LinkedList<>();
        num.add(25);
        num.add(75489);
        num.add(98);
        num.add(14);
        num.add(250);
        num.add(98);
        num.add(2335);
        num.add(14);
        num.add(75489);

        TreeSet<Integer> set = (TreeSet<Integer>) addWithoutDuplicates(num);
        System.out.println(set);

    }
}
