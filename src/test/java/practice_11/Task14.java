package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task14 extends ValidationConstantsTest {

    /**
     * Нахождение среднего значения массива чисел
     *
     * Метод:
     * public double findAverage(int[] numbers) {
     *     return Arrays.stream(numbers).average().orElseThrow();
     * }
     *
     * Тесты:
     * [1, 2, 3, 4, 5] → 3.0
     * [10] → 10.0
     * Пустой массив (должно выбрасываться исключение)*/

    public static Stream<Arguments> findAverage(){
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5},3.0),
                Arguments.of(new int[]{10},10.0)
        );
    }

    @ParameterizedTest
    @MethodSource("findAverage")
    void testFindAverage(int[] input, double expectedResult){

        double actualResult = validationTestConstants.findAverage(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEmptyArrayAverage(){

        assertThrows(NoSuchElementException.class,()->{
            validationTestConstants.findAverage(new int[]{});
        });
    }
}
