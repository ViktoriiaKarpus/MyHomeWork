package hw_multithreding.task1;

public class Main {

    //1. Задача: создание одного потока
    //Условие задачи: Напишите программу, в которой создается отдельный поток,
    // выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

    public static void main(String[] args) {

        Thread message = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет из потока " + (i + 1));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        message.start();
    }
}
