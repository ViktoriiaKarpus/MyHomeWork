package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task19 extends ValidationConstantsTest {

    /**
     * Проверка, является ли строка JSON-объектом
     * <p>
     * Метод:
     * import com.fasterxml.jackson.databind.ObjectMapper;
     * public boolean isValidJson(String json) {
     * try {
     * new ObjectMapper().readTree(json);
     * return true;
     * } catch (Exception e) {
     * return false;
     * }
     * }
     * <p>
     * Тесты:
     * "{"key":"value"}" → true
     * "invalid json" → false
     * null → false
     */

    public static Stream<Arguments> isValidJsonTestData() {
        return Stream.of(
                Arguments.of("{\"key\":\"value\"}", true),
                Arguments.of("invalid json", false),
                Arguments.of(null, false)

        );
    }

    @ParameterizedTest
    @MethodSource("isValidJsonTestData")
    void testIsValidJson(String input, boolean expectedResult) {

        boolean actualResult = validationTestConstants.isValidJson(input);

        assertEquals(expectedResult, actualResult);
    }
}
