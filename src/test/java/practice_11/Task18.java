package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task18 extends ValidationConstantsTest {

    /**
     * Нахождение наибольшего общего делителя (НОД)
     *
     * Метод:
     * public int gcd(int a, int b) {
     *     return b == 0 ? a : gcd(b, a % b);
     * }
     *
     * Тесты:
     * 24, 36 → 12
     * 101, 103 → 1
     * 0, 10 → 10
     */

    public static Stream<Arguments> gcdTestData(){
        return Stream.of(
                Arguments.of(24,36,12),
                Arguments.of(101,103,1),
                Arguments.of(0,10,10)
        );
    }

    @ParameterizedTest
    @MethodSource("gcdTestData")
    void testGCD(int a, int b, int expectedResult){

        int actualResult = validationTestConstants.gcd(a, b);

        assertEquals(expectedResult, actualResult);
    }
}
