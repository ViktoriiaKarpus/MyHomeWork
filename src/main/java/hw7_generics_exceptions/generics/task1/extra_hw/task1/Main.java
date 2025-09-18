package hw7_generics_exceptions.generics.task1.extra_hw.task1;

public class Main {
    //Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.

    public static void main(String[] args) {
        Storage<String> storage = new Storage<>("Hello Niki");
        storage.getItem();
        System.out.println(storage.getItem());
    }
}
