package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task10 extends ValidationConstantsTest {
    /**
     * Проверка валидности номера телефона
     * <p>
     * Напишите тесты для метода, который проверяет валидность телефонного номера:
     * <p>
     * public boolean isValidPhoneNumber(String phone) {
     * return phone.matches("\\+\\d{1,3} \\d{10}");
     * }
     * <p>
     * Тесты должны проверять:
     * Корректные номера ("+1 1234567890")
     * Некорректные номера ("12345", "invalid")*
     */

    public static Stream<Arguments> isValidPhoneNumberTestData() {
        return Stream.of(
                Arguments.of("+1 1234567890", true),
                Arguments.of("12345", false),
                Arguments.of("invalid", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isValidPhoneNumberTestData")
    void testIsValidPhoneNumber(String input, boolean expectedResult) {

        boolean actualResult = validationTestConstants.isValidPhoneNumber(input);

        assertEquals(expectedResult, actualResult);
    }
}
