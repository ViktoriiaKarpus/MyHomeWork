package hw4;

import java.util.Scanner;

public class Break_Continue_Solver {
    public static void main(String[] args) {

        /**
         * 1. Сумма чисел до первого отрицательного (использовать break)
         * Задача:
         * Напишите программу, которая запрашивает у пользователя числа и выводит их сумму.
         * Программа завершает выполнение, если пользователь вводит отрицательное число.
         * Методы и конструкции:
         * Scanner
         * while (true)
         * break
         * переменная sum
         * System.out.println()
         * */

        Scanner scanner1 = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.println("Enter the number: ");
            num = scanner1.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;

        } while (true);
        System.out.println(" The sum of all the positive numbers is: " + sum);
        System.out.println(" The num is negative. The program finished.");

        /**
         * 2. Пропуск чисел, делящихся на 3 (использовать continue)
         * Задача:
         * Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3.
         * Методы и конструкции:
         * for
         * if, оператор %
         * continue
         * System.out.println()
         * */

        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }

        /**
         * 3. Вывод только положительных чисел (использовать continue)
         * Задача:
         * Напишите программу, которая принимает ряд чисел от пользователя и выводит только положительные.
         * Отрицательные числа нужно пропускать.
         * Методы и конструкции:
         * Scanner
         * while или do-while
         * if, continue
         * System.out.println()
         * */

        Scanner scanner3 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number : ");
            int inputNumber = scanner3.nextInt();
            if (inputNumber == 0) {
                break;
            }
            if (inputNumber < 0) {
                continue;
            }
            System.out.println("Positive num " + inputNumber);
            System.out.println("Program ended.");

            /**
             * 4. Ввод строк до команды "stop" (использовать break)
             * Задача:
             * Программа должна запрашивать строки у пользователя и завершаться только тогда,
             * когда введена команда "stop".
             * Методы и конструкции:
             * Scanner
             * while (true)
             * метод .equals("stop")
             * break
             * System.out.println()
             * */

            Scanner scanner4 = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the line : ");
                String program = "stop";
                String inputWord = scanner4.nextLine();
                if (program.equals(inputWord)) {
                    break;
                }
            }
        }
    }
}

