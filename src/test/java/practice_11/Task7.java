package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task7 extends ValidationConstantsTest {
    //Факториал числа
    //Напишите тесты для метода, который вычисляет факториал числа:
    //
    //public int factorial(int n) {
    //    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    //    return (n == 0) ? 1 : n * factorial(n - 1);
    //}
    //Тесты должны проверять:
    //0! = 1
    //Маленькие числа (1!, 5!, 7!)
    //Отрицательные числа (должно выбрасываться исключение)


    public static Stream<Arguments> factorialTestData() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("factorialTestData")

    public void testFactorial(int input, int expectedResult) {

        int actualResult = validationTestConstants.factorial(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeNumberFactorial() {
        assertThrows(IllegalArgumentException.class, () -> {
            validationTestConstants.factorial(-1);
        }, "Negative number should throw IllegalArgumentException");
    }

}
