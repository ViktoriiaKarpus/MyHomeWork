package hw6.task2_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Task3 {
    //Создайте LinkedList, содержащий несколько строк.
    // Напишите программу, которая печатает первый и последний элементы списка.
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>(Arrays.asList("Table", "Lamp", "Snowflake", "Cake"));
        System.out.println(str);
        System.out.println(str.getFirst());
        System.out.println(str.getLast());
    }
}
