package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task16 extends ValidationConstantsTest {

    /**
     * Разбиение строки на части по разделителю
     * <p>
     * Метод:
     * public String[] splitString(String input, String delimiter) {
     * return input.split(delimiter);
     * }
     * <p>
     * Тесты:
     * "Java,Python,C++", "," → ["Java", "Python", "C++"]
     * "", "," → [""]
     * "word", "," → ["word"]
     */

    public static Stream<Arguments> splitStringTestData() {
        return Stream.of(
                Arguments.of("Java,Python,C++", ",", new String[]{"Java", "Python", "C++"}),
                Arguments.of("", ",", new String[]{""}),
                Arguments.of("word", ",", new String[]{"word"})
        );
    }

    @ParameterizedTest
    @MethodSource("splitStringTestData")
    void testSplitString(String input, String delimiter, String[] expectedResult) {

        String[] actualResult = validationTestConstants.splitString(input, delimiter);

        assertArrayEquals(expectedResult, actualResult);
    }
}
