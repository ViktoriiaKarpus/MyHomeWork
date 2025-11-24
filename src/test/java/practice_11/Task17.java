package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task17 extends ValidationConstantsTest {
    /**
     * Проверка корректности пароля (длина, символы, цифры)
     *
     * Метод:
     * public boolean isValidPassword(String password) {
     *     if (password == null || password.length() < 8) return false;
     *     return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
     * }
     *
     * Тесты:
     * "Password1" → true
     * "pass" → false
     * null → false*/

    public static Stream<Arguments> isValidPasswordTestData(){
        return Stream.of(
                Arguments.of("Password1",true),
                Arguments.of("pass",false),
                Arguments.of("null",false)
        );
    }

    @ParameterizedTest
    @MethodSource("isValidPasswordTestData")
    void testIsValidPassword(String input, boolean expectedResult){

        boolean actualResult = validationTestConstants.isValidPassword(input);

        assertEquals(expectedResult, actualResult);
    }
}
