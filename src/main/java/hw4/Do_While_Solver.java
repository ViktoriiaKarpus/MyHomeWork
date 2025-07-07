package hw4;

import java.util.Scanner;

public class Do_While_Solver {
    public static void main(String[] args) {

        /**
         * 1. Запрос положительного числа
         * Задача:
         * Напишите программу, которая запрашивает у пользователя число и продолжает спрашивать,
         * пока оно не станет положительным.
         * Методы и конструкции:
         * Scanner
         * do-while
         * System.out.println()
         * условие
         * */

          int number1;
          do {
              Scanner scannerPositiveNumber = new Scanner(System.in);
              System.out.println("Enter the Number: ");
              number1 = scannerPositiveNumber.nextInt();
          } while (number1 <= 0);
          System.out.println("The Number is Positive");

        /**
         * 2. Проверка пароля
         * Задача:
         * Реализуйте программу, которая запрашивает у пользователя пароль,
         * пока он не введёт верный (пароль заранее задан в коде).
         * Методы и конструкции:
         * Scanner
         * do-while
         * метод .equals() для строк
         * System.out.println()
         * */

        String rightPasswort = "12345";
        String inputPassword;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Enter the password: ");
            inputPassword = scanner1.nextLine();
        } while (!inputPassword.equals(rightPasswort));
        System.out.println("The password is correct");

        /**
         * 3. Вывод чисел от 1 до 10 с использованием do-while
         * Задача:
         * Создайте программу, которая выводит числа от 1 до 10, используя do-while.
         * Методы и конструкции:
         * переменная-счётчик i
         * do-while
         * System.out.println()
         * */

          int i = 1;
          do {
              System.out.println(i + " ");
              i++;
          } while (i <10);

        /**
         * 4. Завершение программы по команде "exit"
         * Задача:
         * Напишите программу, которая будет ждать ввода команды "exit"
         * от пользователя для завершения работы.
         * Методы и конструкции:
         * Scanner
         * do-while
         * метод .equals()
         * System.out.println()
         * */

           String correctInput = "exit";
           String input;
           Scanner scanner2 = new Scanner(System.in);
           do{
               System.out.println("Write the command: ");
               input = scanner2.nextLine();
           }while(!input.equals(correctInput));
           System.out.println("The command is right");

        /**
         * 5. Подсчёт количества цифр в числе
         * Задача:
         * Напишите программу, которая подсчитывает, сколько цифр в целом числе,
         * введённом пользователем.
         * Методы и конструкции:
         * Scanner
         * do-while
         * деление / 10
         * count++
         * условие для 0
         * */


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner3.nextInt();

        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            num = Math.abs(num);
            do {
                num = num / 10;
                count++;
            } while (num > 0);
        }
        System.out.println(" The amount of the numbers is: "  + count);
    }
}
