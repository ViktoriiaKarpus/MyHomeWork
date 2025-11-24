package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task12 extends ValidationConstantsTest {
    /**
     * Сортировка списка строк по длине
     * <p>
     * Метод:
     * public List<String> sortByLength(List<String> words) {
     * return words.stream()
     * .sorted(Comparator.comparingInt(String::length))
     * .collect(Collectors.toList());
     * }
     * <p>
     * Тесты:
     * [ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
     * Одинаковые длины ([ "aa", "bb", "cc" ])
     * Пустой список*
     */


    public static Stream<Arguments> sortByLengthTestData() {
        return Stream.of(
                Arguments.of(Arrays.asList("Java", "C", "Python"), Arrays.asList("C", "Java", "Python")),
                Arguments.of(Arrays.asList("aa", "bb", "cc"), Arrays.asList("aa", "bb", "cc")),
                Arguments.of(Collections.emptyList(), Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("sortByLengthTestData")
    void testSortByLength(List<String> input, List<String> expectedResult) {

        List<String> actualResult = validationTestConstants.sortByLength(input);

        assertEquals(expectedResult, actualResult);
    }
}
