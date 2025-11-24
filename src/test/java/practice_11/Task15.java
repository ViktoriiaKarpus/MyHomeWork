package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task15 extends ValidationConstantsTest {

    /**
     * Преобразование списка строк в список их длин
     * <p>
     * Метод:
     * public List<Integer> mapToLengths(List<String> words) {
     * return words.stream().map(String::length).collect(Collectors.toList());
     * }
     * <p>
     * Тесты:
     * [ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
     * Пустой список
     */

    public static Stream<Arguments> mapToLengthsTestData() {
        return Stream.of(
                Arguments.of(Arrays.asList("Java", "C++", "Go"), Arrays.asList(4, 3, 2)),
                Arguments.of(Collections.emptyList(), Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("mapToLengthsTestData")
    void testMapToLengths(List<String> input, List<Integer> expectedResult){

        List<Integer> actualResult = validationTestConstants.mapToLengths(input);

        assertEquals(expectedResult, actualResult);
    }
}
