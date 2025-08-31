package hw6.task5_TreeSet;

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        //Найдите ближайшее большее и меньшее число к заданному в TreeSet.

        TreeSet<Integer> num = new TreeSet<>();

        num.add(25);
        num.add(75489);
        num.add(14);
        num.add(250);
        num.add(98);
        num.add(2335);

        int a = 25;
        System.out.println(num.higher(a));
        System.out.println(num.lower(a));
    }
}
