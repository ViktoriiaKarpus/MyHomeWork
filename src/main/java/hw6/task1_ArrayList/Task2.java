package hw6.task1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    //Напишите программу, которая выводит все чётные числа из ArrayList.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(12, 33, 55, 78, 99, 125));
        for (Integer num : arrayList){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
