package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task13 extends ValidationConstantsTest {

    /**
     * Проверка, является ли строка анаграммой другой
     * <p>
     * Метод:
     * public boolean isAnagram(String str1, String str2) {
     * if (str1 == null || str2 == null) return false;
     * char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
     * char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
     * Arrays.sort(arr1);
     * Arrays.sort(arr2);
     * return Arrays.equals(arr1, arr2);
     * }
     * <p>
     * Тесты:
     * "listen", "silent" → true
     * "java", "python" → false
     * null → false
     */

    public static Stream<Arguments> isAnagramTestData() {
        return Stream.of(
                Arguments.of("listen", "silent", true),
                Arguments.of("java", "python", false),
                Arguments.of(null, null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isAnagramTestData")
    void testIsAnagram(String str1, String str2, boolean expectedResult) {

        boolean actualResult = validationTestConstants.isAnagram(str1, str2);

        assertEquals(expectedResult, actualResult);
    }
}
