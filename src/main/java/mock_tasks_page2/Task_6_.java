package mock_tasks_page2;

public class Task_6_ {

    //Проверка на простое число

    public static boolean isPrime(int number){
        if( number <= 1){
            return false;
        }

        for (int i = 2; i * i <= number; i++){
            if( number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        isPrime(9);
        System.out.println(isPrime(9));

        isPrime(17);
        System.out.println(isPrime(17));
    }
}
