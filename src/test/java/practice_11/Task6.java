package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Task6 extends ValidationConstantsTest {
    //Проверка валидности email
    //Напишите тесты для метода, который проверяет, является ли строка валидным email:
    //
    //public boolean isValidEmail(String email) {
    //    return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    //}
    //
    //Тесты должны проверять:
    //Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    //null

    public static Stream<Arguments> isValidEmailTestData() {
        return Stream.of(
                Arguments.of("test@example.com", true),
                Arguments.of("bad@.com", false),
                Arguments.of("no-at-symbol", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isValidEmailTestData")
    void testIsValidEmail(String input, boolean expectedResult) {

        boolean actualResult = validationTestConstants.isValidEmail(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNullEmail() {

        boolean result = validationTestConstants.isValidEmail("null");

        assertFalse(result);
    }

}
