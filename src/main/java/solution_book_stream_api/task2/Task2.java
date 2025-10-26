package solution_book_stream_api.task2;

public class Task2 {

    //Преобразование чисел в строки
    // Преобразуй список чисел в список строк с приставкой "Число: " — используй Function.

    @FunctionalInterface

    public interface  Function <T, R>{
        R apply(T t);
    }
}
