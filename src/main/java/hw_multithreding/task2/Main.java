package hw_multithreding.task2;

public class Main {
    //2. Задача: создание двух потоков
    //Условие задачи: Создайте два потока.
    // Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A " + (i + 1));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B " + (i + 1));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
