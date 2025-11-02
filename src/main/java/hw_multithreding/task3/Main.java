package hw_multithreding.task3;

public class Main {

    //3. Задача: использование volatile
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
    // В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

    public static void main(String[] args) throws InterruptedException {

        MyCounter counter = new MyCounter();
        Thread t1 = new Thread(counter);

        t1.start();

        Thread.sleep(2000);

        counter.stop();

        t1.join();
        System.out.println("The Thread is stopped");
    }
}
