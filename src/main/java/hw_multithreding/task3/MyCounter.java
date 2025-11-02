package hw_multithreding.task3;

public class MyCounter implements Runnable {

    //3. Задача: использование volatile
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
    // В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

    private volatile boolean active = true;
    private int count;

    @Override
    public void run() {
        while (active) {
            count++;
            System.out.println("Count: " + count);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        this.active = false;
    }
}
