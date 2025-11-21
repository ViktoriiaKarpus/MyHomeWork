package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2 extends ValidationConstantsTest{
    /**
     *  Подсчёт количества гласных в строке
     * Напишите тесты для метода, который считает количество гласных букв в строке:
     *
     * public int countVowels(String input) {
     *     if (input == null) {
     *         throw new IllegalArgumentException("Input cannot be null");
     *     }
     *     return (int) input.toLowerCase().chars()
     *             .filter(c -> "aeiou".indexOf(c) != -1)
     *             .count();
     * }
     * Тесты должны проверять:
     * Разные строки ("hello", "java", "AEIOU", "")
     * null (должно выбрасываться исключение)
     * Строки без гласных*/

    public static Stream<Arguments> countVowelsTestData(){
        return Stream.of(
                Arguments.of("hello",2),
                Arguments.of("java",2),
                Arguments.of("AEIOU",5),
                Arguments.of("cvbnm",0)
        );
    }

    @ParameterizedTest
    @MethodSource("countVowelsTestData")
    void testCountVowels(String input, int expectedResult){
        int actualResult = validationTestConstants.countVowels(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsNullInputThrowsExceptions(){
        assertThrows(IllegalArgumentException.class,()->{
            validationTestConstants.countVowels(null);
        },"Check if Null String lead to IllegalArgumentException");
    }


}
