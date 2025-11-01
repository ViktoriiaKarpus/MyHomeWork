package solution_book_stream_api.task4;

public class Task4 {
    @FunctionalInterface

    public interface Predicate<T>{
        boolean test(T t);
    }
}
