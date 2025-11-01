package solution_book_stream_api.task3;

public class Task3 {
    @FunctionalInterface

    public interface Consumer<T>{
        void accept(T t);
    }
}
