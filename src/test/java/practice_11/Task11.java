package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11 extends ValidationConstantsTest {
    /**
     * Фильтрация списка чисел (оставить только чётные)
     * <p>
     * Метод:
     * public List<Integer> filterEvenNumbers(List<Integer> numbers) {
     * return numbers.stream()
     * .filter(n -> n % 2 == 0)
     * .collect(Collectors.toList());
     * }
     * <p>
     * Тесты:
     * Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
     * Список без чётных чисел
     * Пустой список
     */

    public static Stream<Arguments> filterEvenNumbersTestData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(2, 4, 6)),
                Arguments.of(Arrays.asList(1, 3, 5, 7), Collections.emptyList()),
                Arguments.of(Collections.emptyList(),Collections.emptyList()));
    }

    @ParameterizedTest
    @MethodSource("filterEvenNumbersTestData")
    void testFilterEvenNumbers(List<Integer> input, List<Integer> expectedResult){

        List<Integer> actualResult = validationTestConstants.filterEvenNumbers(input);

        assertEquals(expectedResult, actualResult);
    }
}
