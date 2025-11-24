package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3 extends ValidationConstantsTest {
    /**
     * Разворот строки
     * Напишите тесты для метода, который переворачивает строку:
     * <p>
     * public String reverse(String input) {
     * if (input == null) return null;
     * return new StringBuilder(input).reverse().toString();
     * }
     * <p>
     * Тесты должны проверять:
     * Обычные строки
     * Пустую строку
     * null (должно возвращаться null)
     */

    public static Stream<Arguments> reverseTestData() {
        return Stream.of(
                Arguments.of("students", "stneduts"),
                Arguments.of("", ""),
                Arguments.of(null, null),
                Arguments.of("12345", "54321")
        );
    }

    @ParameterizedTest
    @MethodSource("reverseTestData")
    void testReverse(String input, String expectedResult) {

        String actualResult = validationTestConstants.reverse(input);

        assertEquals(expectedResult, actualResult);
    }
}
