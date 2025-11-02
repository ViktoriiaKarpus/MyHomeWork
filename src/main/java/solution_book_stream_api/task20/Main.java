package solution_book_stream_api.task20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //Частотный анализ слов
    // Подсчитай, сколько раз каждое слово встречается в списке строк. Верни Map<String, Long>.

    public static void main(String[] args) {


        List<String> words= Arrays.asList("Beautiful", "Animal", "Cousin", "Solution", "University", "Impossible",
                "Combinations", "Beautiful", "Beautiful", "Solution", "Solution", "Solution", "Solution");

        Map<String, Long> wordsCount = words.stream()
                .collect(Collectors.groupingBy(
                        word-> word,
                        Collectors.counting()
                ));

        System.out.println(wordsCount);
    }
}
