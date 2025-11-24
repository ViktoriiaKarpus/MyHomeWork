package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4 extends ValidationConstantsTest{

    /**
     * Поиск максимального числа в массиве
     * Напишите тесты для метода, который находит максимальное число в массиве:
     *
     * public int findMax(int[] numbers) {
     *     return Arrays.stream(numbers).max().orElseThrow();
     * }
     *
     * Тесты должны проверять:
     * Обычный массив ([3, 5, 7, 2])
     * Один элемент в массиве
     * Отрицательные числа
     * Пустой массив (должно выбрасываться исключение)*/


    public static Stream<Arguments> findMaxTestData(){
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-5,-7,-1,-3,-10}, -1)

        );
    }

    @ParameterizedTest
    @MethodSource("findMaxTestData")
    void testFindMax(int[] numbers, int expectedResult){

        int actualResult = validationTestConstants.findMax(numbers);

        assertEquals(expectedResult, actualResult);
    }

}
