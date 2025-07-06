package hw4;

public class For_Solver {
    /**
     * 1. Вывод чисел от 1 до 100, делящихся на 3
     * Задача:
     * Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
     * Методы и конструкции:
     * for
     * оператор %
     * if
     * System.out.println()
     * */

    public static void testDivideNumbers(){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }

    }

    /**
     * 2. Сумма чисел от 1 до n
     * Задача:
     * Реализуйте программу, которая принимает с консоли число n
     * и вычисляет сумму всех чисел от 1 до n.
     * Методы и конструкции:
     * Scanner
     * for
     * переменная int sum = 0
     * System.out.println()
     * */

    public static int testSumNumbers(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum+=i;
        }
        return sum;
    }

    /**
     * 3. Таблица умножения для числа
     * Задача:
     * Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.
     * Методы и конструкции:
     * Scanner
     * for
     * System.out.println()
     * арифметические операторы
     * */

    public static void printMultiplicationTable(int num ){
        for(int i = 1; i <=10; i++){
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }

    /**
     * 4. Проверка на простое число
     * Задача:
     * Напишите программу, которая проверяет, является ли введённое число простым.
     * Простое число делится только на 1 и на само себя.
     * Методы и конструкции:
     * Scanner
     * for
     * if-else
     * логическая переменная (boolean isPrime = true)
     * System.out.println()
     * */

    public static boolean isNumberSimple(int num){
        boolean isPrime = true;
        if(num < 2){
            isPrime = false;
        } else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    /**
     * 5. Вывод чисел от 1 до 10
     * Задача:
     * Напишите программу, которая выводит числа от 1 до 10 на экран.
     * Методы и конструкции:
     * for
     * System.out.println()
     * */

    public static void printNumbers(){
        for(int i = 1; i <10;i++){
            System.out.print( i + " ");
        }
    }
}
