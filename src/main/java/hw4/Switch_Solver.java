package hw4;

public class Switch_Solver {

    /**
     * 1. Вывод дня недели по номеру
     * Задача:
     * Реализуйте программу, которая принимает с консоли число от 1 до 7
     * и выводит название соответствующего дня недели (например, 1 — "Понедельник").
     * Методы и конструкции:
     * Scanner
     * switch-case
     * System.out.println()
     * default (для обработки некорректного ввода)
     */

    public static String testTheDayOfTheWeek(int num) {
        String description = "";
        switch (num) {
            case 1:
                description = "Today is Monday";
                break;
            case 2:
                description = "Tuesday";
                break;
            case 3:
                description = "Today is wednesday";
                break;
            case 4:
                description = "Today is Thursday";
                break;
            case 5:
                description = "Today is Friday";
                break;
            case 6:
                description = "Today is Saturday";
                break;
            case 7:
                description = "Today is Sunday";
                break;
            default:
                description = "This day doesn't exist";
                break;
        }
        return description;
    }

    /**
     * 2. Стоимость билета по дню недели
     * Задача:
     * Определите стоимость билета в кино:
     * будние дни (1–5) — 300 рублей
     * выходные (6–7) — 450 рублей
     * Методы и конструкции:
     * Scanner
     * switch-case (можно несколько case подряд) или if-else
     * System.out.println()
     */

    public static String findThePriceOfTheTicket(int num) {
        String description = "";

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                description = " The price is 300 r";
                break;
            case 6:
            case 7:
                description = " The price is 450 r";
                break;
            default:
                description = "This day doesn't exist";
                break;
        }
        return description;
    }

    /**
     * 3. Перевод числовых оценок в буквенные (A–F)
     * Задача:
     * Программа принимает число от 0 до 100 и переводит его в буквенную оценку по шкале:
     * 90–100 — A
     * 80–89 — B
     * 70–79 — C
     * 60–69 — D
     * ниже 60 — F
     * Методы и конструкции:
     * Scanner
     * if-else if или switch-case
     * System.out.println()
     */

    public static String convertNumericalGradesIntoLettersGrades(int num) {
        String grade = "";
        if (num >= 90 && num <= 100) {
            grade = "A";
        } else if (num >= 80 && num <= 89) {
            grade = "B";
        } else if (num >= 70 && num <= 79) {
            grade = "C";
        } else if (num >= 60 && num <= 69) {
            grade = "D";
        } else if (num < 60) {
            grade = "F";
        }
        return grade;
    }

    /**
     * 4. Обработка текстовых команд
     * Задача:
     * Программа читает строку: "start", "stop", "restart" или "status".
     * Для каждой команды нужно вывести соответствующее сообщение, например: "Система запущена".
     * Методы и конструкции:
     * Scanner (nextLine())
     * switch-case по String
     * System.out.println()
     * default
     */

    public static String testCommand(Command command) {
        String description = "";
        switch (command) {
            case START -> description = "The system is started";
            case STOP -> description = "The system is stopped";
            case RESTART -> description = "The system is restarted";
            case STATUS -> description = "The system is normal";
            default -> description = "Unknown command";
        }
        return description;
    }

    /**
     * 5. Простой калькулятор с использованием switch
     * Задача:
     * Программа принимает два числа и оператор (+, -, *, /),
     * затем выполняет операцию и выводит результат.
     * Методы и конструкции:
     * Scanner
     * switch-case
     * if для проверки деления на 0
     * System.out.println()
     * Арифметические операторы +, -, *, /
     */

    public static double calculate(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    return Double.NaN;
                }
            }
            default -> {
                return Double.NaN;
            }
        }
        return result;
    }
}
