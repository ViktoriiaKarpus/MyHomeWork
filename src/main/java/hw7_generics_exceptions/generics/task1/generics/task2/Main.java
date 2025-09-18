package hw7_generics_exceptions.generics.task1.generics.task2;

public class Main {
    //Задача на дженерик метод
    //Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа
    // и выводит каждый элемент массива на консоль.

    /// Задача на дженерик метод:
    //Определите метод с дженерик параметром <T>.
    //Используйте параметр типа T[] для передачи массива в метод.
    //Внутри метода используйте цикл для перебора элементов массива и их вывода.

public static <T> void printArray(T[] array){
    for (T element : array){
        System.out.println(element);
    }
}

    public static void main(String[] args) {
        String[] array = {"Java", "Python", "JavaScript"};
        printArray(array);

        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        printArray(integers);

        Double[] doubles = {1.23,2.34,5.67,7.89};
        printArray(doubles);
    }
}
