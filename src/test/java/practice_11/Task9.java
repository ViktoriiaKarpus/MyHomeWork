package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task9 extends ValidationConstantsTest {
    /**
     * Подсчёт количества слов в строке
     * Напишите тесты для метода, который считает количество слов в строке:
     * <p>
     * public int countWords(String sentence) {
     * return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
     * }
     * <p>
     * Тесты должны проверять:
     * Пустую строку
     * null
     * Строку с несколькими пробелами
     */

    public static Stream<Arguments> countWordsTestData() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of(" ", 0),
                Arguments.of("hello world", 2),
                Arguments.of("hello world test", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("countWordsTestData")
    void testWords(String input, int expectedResult) {

        int actualResult = validationTestConstants.countWords(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNullString() {

        assertThrows(NullPointerException.class, () -> {
            validationTestConstants.countWords(null);
        });
    }

}
