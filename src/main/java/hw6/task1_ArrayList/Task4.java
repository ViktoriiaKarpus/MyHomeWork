package hw6.task1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    //Создайте ArrayList из целых чисел.
    // Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        System.out.println(sum);
    }
}
