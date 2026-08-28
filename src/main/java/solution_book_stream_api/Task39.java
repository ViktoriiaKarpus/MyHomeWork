package solution_book_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task39 {

    //Список непустых значений из Optional
    // Из списка Optional<String> получить список непустых значений.

    public static void main(String[] args) {
        List<Optional<String>> words = Arrays.asList(
                Optional.of("You"),
                Optional.empty(),
                Optional.of("where"),
                Optional.empty(),
                Optional.of("best"),
                Optional.empty()
        );

       List<String> result = words.stream()
                .filter(w -> w.isPresent())
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
