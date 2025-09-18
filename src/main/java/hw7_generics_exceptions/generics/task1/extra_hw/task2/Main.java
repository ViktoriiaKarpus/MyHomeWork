package hw7_generics_exceptions.generics.task1.extra_hw.task2;

import java.util.List;

public class Main {
    //Обобщённый метод
    //Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.

    public static <T> void printList(List<T> element) {
        for (T e : element){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5,6,7);
        System.out.println(integerList);
    }
}
