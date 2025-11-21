package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1 extends ValidationConstantsTest {

    /**
     * /**
     * *  Проверка чётности числа
     * * Напишите тесты для метода, который определяет, является ли число чётным:
     * *
     * * public boolean isEven(int number) {
     * *     return number % 2 == 0;
     * * }
     * *
     * * Тесты должны проверять:
     * * Чётные и нечётные числа
     * * Нулевое значение
     * * Отрицательные числа
     */

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 0, -2, -4})

    public void testisEven(int numbers) {

        assertTrue(validationTestConstants.isEven(numbers));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,7,11,-3,-5,-9})
    public void testIsOddNumbersReturnFalse(int numbers){
        assertFalse(validationTestConstants.isEven(numbers));
    }
}
