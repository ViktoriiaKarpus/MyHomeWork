package solution_book_stream_api.task1;

public class Task1 {

    @FunctionalInterface

    public interface Predicate<T>{
        boolean test(T t);
    }
}
