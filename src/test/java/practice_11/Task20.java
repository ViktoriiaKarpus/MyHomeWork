package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task20 extends ValidationConstantsTest {

    /**
     * Проверка, содержит ли массив дубликаты
     * <p>
     * Метод:
     * public boolean hasDuplicates(int[] numbers) {
     * return Arrays.stream(numbers).distinct().count() != numbers.length;
     * }
     * <p>
     * Тесты:
     * [1, 2, 3, 4, 5] → false
     * [1, 2, 2, 3] → true
     * Пустой массив → false
     */

    public static Stream<Arguments> hasDuplicatesTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, false),
                Arguments.of(new int[]{1, 2, 2, 3}, true),
                Arguments.of(new int[]{}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("hasDuplicatesTestData")
    void testHasDuplicates(int[] input, boolean expectedResult) {

        boolean actualResult = validationTestConstants.hasDuplicates(input);

        assertEquals(expectedResult, actualResult);
    }
}
