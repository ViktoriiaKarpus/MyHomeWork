package hw8_lambda_stream_api.functions_interfases_and_lambda.task1.task2;

public class Main {
    // Использование анонимного класса
    //Задача: Создайте анонимный класс, реализующий интерфейс Runnable,
    // который выводит сообщение "Hello from anonymous class!".

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println( "Hello from anonymous class!");
            }
        };
        r1.run();
    }
}
