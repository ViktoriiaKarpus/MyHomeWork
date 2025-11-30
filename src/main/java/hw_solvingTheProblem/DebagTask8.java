package hw_solvingTheProblem;

public class DebagTask8 {

    //Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.

    public static void main(String[] args) {
        double a = 0.1 * 3;
        double roundA = Math.round(a * 10.0)/10.0;
        double b = 0.3;
        if (roundA == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
