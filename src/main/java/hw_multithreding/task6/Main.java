package hw_multithreding.task6;

import java.util.List;


public class Main {
    //6. Параллельная обработка данных с использованием потоков
    //Условие задачи:
    //Напишите программу, которая создает 3 потока для обработки элементов в списке.
    // Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
    // После завершения всех потоков,
    // программа должна вывести общий результат: сколько элементов было обработано и их суммы.

    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        final int elementsPerThread = 3;
        final int totalThreads = 3;

        int[] sums = new int[totalThreads];

        Thread[] threads = new Thread[totalThreads];

        for (int i = 0; i < totalThreads; i++){
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int start = threadIndex * elementsPerThread;
                int sum = processElements(numbers, start, elementsPerThread);
                sums[threadIndex]= sum;
            }, "Thread - " + (i + 1));
            threads[i].start();
        }

        for(Thread t: threads){
            t.join();
        }

        int totalSum = 0;
        for (int s: sums){
            totalSum+= s;
        }

        printFinalResalt(numbers.size(), totalSum);
    }

    public static int processElements(List<Integer> list, int startIndex, int count) {
        int sum = 0;
        for (int i = startIndex; i < startIndex + count && i < list.size(); i++) {
            System.out.println(Thread.currentThread().getName() +
                    " - index: " + i + " , meaning : " + list.get(i));
            sum += list.get(i);
        }
        return sum;
    }

    public static void printFinalResalt(int totalElements, int totalSum) {
        System.out.println(" --- Final Result ---");
        System.out.println("Elements processed : " + totalElements);
        System.out.println("Sum of the elements: " + totalSum);
    }

}

