package hw7_generics_exceptions.generics.task1.generics.task3;

public class Main {
    //Задача на дженерик с двумя типами данных
    //Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.

    //Задача на дженерик с двумя типами данных:
    //Определите класс Pair с использованием двух дженерик типов <T, U>.
    //В классе Pair создайте две переменные экземпляра разных типов: T first и U second.
    //Реализуйте методы setFirst(T item), getFirst(), setSecond(U item) и getSecond() для работы с этими объектами.

    public static void main(String[] args) {
        Pair <String, Integer> pair = new Pair<>("Today is a beautiful morning", 123);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
