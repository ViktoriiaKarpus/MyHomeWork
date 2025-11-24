package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task8 extends ValidationConstantsTest {

    // Поиск второго максимального числа в массиве
    //Напишите тесты для метода, который находит второе по величине число:
    //
    //public int findSecondMax(int[] numbers) {
    //    return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    //}
    //
    //Тесты должны проверять:
    //Обычные массивы
    //Массив с одинаковыми числами
    //Один элемент в массиве (должно выбрасываться исключение)


    public static Stream<Arguments> findSecondMaxTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 89}, 7),
                Arguments.of(new int[]{11, 2, 11, 77, 5, 67, 77, 89, 89, 67}, 77),//test fail
                Arguments.of(new int[]{1, 1, 5, 5, 27, 32, 32, 121, 12}, 32)//test fail
        );
    }

    /**
     * The method uses skip(numbers.length-2), which works incorrectly
     * when duplicates are present
     */


    @ParameterizedTest
    @MethodSource("findSecondMaxTestData")
    void testValidSecondMax(int[] input, int expectedResult) {

        int actualResult = validationTestConstants.findSecondMax(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOneElementInTheArray() {
        assertThrows(IllegalArgumentException.class, () ->
                validationTestConstants.findSecondMax(new int[]{10}));
    }
}
