package solution_book_stream_api.task3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    //Печать всех элементов с Consumer
    // Пройдись по списку и выведи каждый элемент, используя Consumer и forEach().

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Java", "Stream", "Lambda");

        Consumer<String> result = s -> System.out.println("Word: " + s);

        str.stream().forEach(result);
    }
}
