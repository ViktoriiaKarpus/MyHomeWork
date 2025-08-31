package hw6.task3_HashSet;


import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

        Set<Integer> num = new HashSet<>();
        num.add(12);
        num.add(22);
        num.add(44);
        num.add(58);
        num.add(78);
        num.add(65);
        num.add(12);
        num.add(78);
        num.add(98);
        num.add(100);

        int number = 22;
        if(num.contains(number)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }







    }
}
