package hw4;

public class While_Solver {
    /**
     * 1. Вычисление факториала с помощью while
     * Задача:
     * Напишите программу, которая принимает с консоли число и выводит его факториал
     * (произведение всех чисел от 1 до n), используя цикл while.
     * Методы и конструкции:
     * Scanner
     * while
     * переменные int result = 1, int i = 1
     * System.out.println()
     */

    public static int findFactorial(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    /**
     * 2. Вывод всех чётных чисел до заданного
     * Задача:
     * Реализуйте программу, которая выводит все чётные числа от 1 до числа,
     * введённого пользователем.
     * Методы и конструкции:
     * Scanner
     * while
     * if, оператор %
     * System.out.println()
     * */

    public static void printNum(int num){
        int i = 1;
        while(i <= num){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * 3. Обратный отсчёт от введённого числа до 1
     * Задача:
     * Создайте программу, которая принимает с консоли положительное число
     * и выводит обратный отсчёт от него до 1.
     * Методы и конструкции:
     * Scanner
     * while
     * System.out.println()
     * декремент number--
     * */

    public static int printPositiveNumber(int num){
        int i= 1;
        while(num > i){
            System.out.println(num);
            num--;
        }
        return i;
    }

}
