package hw7_generics_exceptions.generics.task1.exceptions.task1.task2;

public class Task2 {
    //Обработка непроверяемого исключения
    //Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
    // Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.

    public static double divideNum(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e){
            System.out.println("Devision by ziro are not allowed");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divideNum(25,5));
        System.out.println(divideNum(25,0));
    }
}
