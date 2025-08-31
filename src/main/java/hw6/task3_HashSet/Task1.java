package hw6.task3_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    //Создайте HashSet из 5 чисел и выведите его содержимое.
    public static void main(String[] args) {

        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(12);
        num.add(31);
        num.add(14);
        num.add(51);

        for (Integer n: num){
            System.out.println(n);
        }

    }
}
