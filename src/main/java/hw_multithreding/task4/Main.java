package hw_multithreding.task4;

public class Main {

    //4. Задача: использование synchronized
    //Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
    // Создайте два потока,
    // каждый из которых вызывает increment() 1000 раз.
    // Обеспечьте правильную работу с помощью synchronized.

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The meaning of the count: " + counter.getCount());
    }
}
