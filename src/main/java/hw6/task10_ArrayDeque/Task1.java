package hw6.task10_ArrayDeque;

import java.util.ArrayDeque;

public class Task1 {
    public static void main(String[] args) {
        //Создайте ArrayDeque, добавьте 5 элементов и выведите их.

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(25);
        arrayDeque.addLast(12);
        arrayDeque.addLast(578);
        arrayDeque.addLast(36);
        arrayDeque.addLast(87);

        System.out.println(arrayDeque);
    }
}
