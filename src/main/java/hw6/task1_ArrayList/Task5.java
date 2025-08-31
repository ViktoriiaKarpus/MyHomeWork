package hw6.task1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    //Создайте ArrayList из целых чисел.
    // Напишите программу, которая находит и выводит максимальное число из списка.
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 33, 4, 75, 6, 7, 98, 9));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println(max);

        int maxValue = Collections.max(array);
        System.out.println(maxValue);
    }
}
