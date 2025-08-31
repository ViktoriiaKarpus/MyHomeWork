package hw6.task2_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Task4 {
    //Создайте LinkedList из целых чисел.
    // Напишите программу, которая вычисляет сумму элементов списка.

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,4,55,33,77,88,99,78));
        int sum = 0;
        for (Integer num : linkedList){
            sum+=num;
        }
        System.out.println(sum);

    }
}
