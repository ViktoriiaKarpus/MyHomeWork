package hw4;

public class If_Else_Solver {

    /**
     * 1. Определение знака числа
     * Задача:
     * Напишите программу, которая принимает с консоли число и проверяет:
     * Если число больше 0, выведите "Число положительное".
     * Если меньше 0 — "Число отрицательное".
     * Если равно 0 — "Число равно нулю".
     * Методы и конструкции:
     * Scanner
     * if, else if, else
     * System.out.println()
     */


    public static String findTheSignOfTheNumber(int num) {
        String description = "";

        if (num > 0) {
            description = "The Number is positive";
        } else if (num < 0) {
            description = "The Number is negative";
        } else if (num == 0) {
            description = "The Number equals zero";
        }
        return description;
    }

    /**
     * 2. Поиск наибольшего из двух чисел
     * Задача:
     * Создайте программу, которая принимает два числа и выводит наибольшее из них.
     * Методы и конструкции:
     * Scanner
     * if-else или Math.max()
     * System.out.println()
     */

    public static int findTheBiggerNumber(int a, int b) {
        int maxAB = b;

        if (a > maxAB) {
            maxAB = a;
        }
        return maxAB;
    }

    /**
     * 3. Вывод оценки по шкале 1–5
     * Задача:
     * Программа принимает число от 1 до 5 и выводит текстовое описание оценки:
     * 5 — "Отлично"
     * 4 — "Хорошо"
     * 3 — "Удовлетворительно"
     * 2 или 1 — "Неудовлетворительно"
     * Методы и конструкции:
     * Scanner
     * switch-case или if-else if
     * System.out.println()
     */

    public static String chooseGrade(int grade) {
        String description = "";
        switch (grade) {
            case 5:
                description = "Excellent";
                break;
            case 4:
                description = "Good";
                break;
            case 3:
                description = "Satisfactory";
                break;
            case 2:
            case 1:
                description = "Unsatisfactory";
                break;
        }
        return description;
    }

    /**
     * 4. Проверка на чётность
     * Задача:
     * Напишите программу, которая проверяет, является ли введённое число чётным или нечётным.
     * Методы и конструкции:
     * Scanner
     * if-else, оператор %
     * System.out.println()
     */

    public static String isTheNumOddOrEven(int num) {
        String description = "";
        if (num % 2 == 0) {
            description = "The Number is Even";
        } else {
            description = "The Number is Odd";
        }
        return description;
    }

    /**
     * 5. Определение размера скидки по возрасту
     * Задача:
     * Напишите программу, которая определяет размер скидки:
     * До 18 лет — 25%
     * От 65 и старше — 30%
     * Остальные — без скидки
     * Методы и конструкции:
     * Scanner
     * if, else if, else
     * System.out.println()
     */

    public static String findTheSizeOdTheDiscount(int age) {
        String description = "";
        if (age < 18) {
            description = "Your discount is 25%";

        } else if (age >= 65) {
            description = "Your discount is 30%";
        } else {
            description = "You don't have a discount";
        }
        return description;
    }

    /**
     * 6. Оценка результата теста по баллам
     * Задача:
     * Программа принимает число — результат теста (0–100) и выводит:
     * 90 и выше — "Отлично"
     * 75–89 — "Хорошо"
     * 60–74 — "Удовлетворительно"
     * ниже 60 — "Неудовлетворительно"
     * Методы и конструкции:
     * Scanner
     * if, else if, else
     * System.out.println()
     */

    public static String findTestResults(int num) {
        String description = "";

        if (num >= 90) {
            description = "Excellent";
        } else if (num >= 75 && num <= 89) {
            description = "Good";
        } else if (num >= 60 && num <= 74) {
            description = "Satisfactory";
        } else if (num < 60) {
            description = "Unsatisfactory";
        }
        return description;
    }
}
