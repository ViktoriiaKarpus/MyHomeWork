package hw6.task5_TreeSet;

import java.util.TreeSet;

public class Task1 {

    //Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
    public static void main(String[] args) {

        TreeSet<Integer> num = new TreeSet<>();

        num.add(25);
        num.add(75489);
        num.add(14);
        num.add(250);
        num.add(98);
        num.add(2335);

        System.out.println(num);
    }
}
