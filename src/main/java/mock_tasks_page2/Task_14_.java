package mock_tasks_page2;

public class Task_14_ {

    //Обработка деления на 0

    public static int safeDevide(int a , int b){
        try{
            return a / b;
        }catch (ArithmeticException e){
            return 0;
        }
    }
    public static void main(String[] args) {

        safeDevide(2, 0);
        System.out.println( safeDevide(2, 0));
    }
}
