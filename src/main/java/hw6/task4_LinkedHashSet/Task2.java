package hw6.task4_LinkedHashSet;

import java.util.LinkedHashSet;

public class Task2 {
    //Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

    public static LinkedHashSet<Integer> addElementsWithoutDuplicates(LinkedHashSet<Integer> num, Integer element){
        num.add(element);
        return num;
    }

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        addElementsWithoutDuplicates(numbers,10);
        addElementsWithoutDuplicates(numbers,20);
        addElementsWithoutDuplicates(numbers,10);
        addElementsWithoutDuplicates(numbers,30);
        addElementsWithoutDuplicates(numbers,30);
        addElementsWithoutDuplicates(numbers,40);
        addElementsWithoutDuplicates(numbers,40);
        addElementsWithoutDuplicates(numbers,50);
        addElementsWithoutDuplicates(numbers,70);

        System.out.println(numbers);

    }
}
