package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5 extends ValidationConstantsTest{

    /**
     *  Проверка, является ли год високосным
     * Напишите тесты для метода, который определяет, является ли год високосным:
     *
     * public boolean isLeapYear(int year) {
     *     return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
     * }
     *
     * Тесты должны проверять:
     * Обычные годы
     * Високосные (2020, 2000, 1600)
     * Года, которые делятся на 100, но не на 400 (1900, 2100)*/

    @ParameterizedTest
    @ValueSource(ints = {
            2020, 2000, 1600

    })
    public void testIsLeapYear(int input){
        assertTrue(validationTestConstants.isLeapYear(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {
            1813, 2057, 1741

    })
    public void testUsualYears(int input){
        assertFalse(validationTestConstants.isLeapYear(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {
            1900, 2100

    })
    public void testTheYearsThatNotDividedOnTheHundredAndFourHundred(int input){
        assertFalse(validationTestConstants.isLeapYear(input));
    }
}
