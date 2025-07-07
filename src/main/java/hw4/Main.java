package hw4;

import java.util.Scanner;

import static hw4.For_Solver.isNumberSimple;
import static hw4.For_Solver.testSumNumbers;
import static hw4.If_Else_Solver.*;
import static hw4.Switch_Solver.*;
import static hw4.While_Solver.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numTheSignOfTheNumber = scanner1.nextInt();
        String resultSignOfTheNumber = findTheSignOfTheNumber(numTheSignOfTheNumber);
        System.out.println(resultSignOfTheNumber);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner2.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner2.nextInt();
        int resultMaxAB = findTheBiggerNumber(a, b);
        System.out.println("The biggest number is : " + resultMaxAB);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the garde: ");
        int grade = scanner3.nextInt();
        String resultGrade = chooseGrade(grade);
        System.out.println(resultGrade);

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numOddEven = scanner4.nextInt();
        String resultOddEvenNumber = isTheNumOddOrEven(numOddEven);
        System.out.println(resultOddEvenNumber);

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = scanner5.nextInt();
        String resultDiscount = findTheSizeOdTheDiscount(age);
        System.out.println(resultDiscount);

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Enter the tests' results: ");
        int testResults = scanner6.nextInt();
        String resultsOfTheTest = findTestResults(testResults);
        System.out.println(resultsOfTheTest);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int dayOfTheWeek = scanner7.nextInt();
        String resultDayOfTheWeek = testTheDayOfTheWeek(dayOfTheWeek);
        System.out.println(resultDayOfTheWeek);


        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numDayOfTheWeek = scanner8.nextInt();
        String resultPrice = findThePriceOfTheTicket(numDayOfTheWeek);
        System.out.println(resultPrice);

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int numGrade = scanner9.nextInt();
        String resultLettersGrade = convertNumericalGradesIntoLettersGrades(numGrade);
        System.out.println(resultLettersGrade);

        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Enter the command: ");
        String input = scanner10.nextLine().trim().toUpperCase();
        try {
            Command command = Command.valueOf(input);
            String result = testCommand(command);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown command");
        }


        Scanner scanner11 = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        double num1 = scanner11.nextDouble();
        System.out.println("Enter the operator (+,-,*,/): ");
        char operator = scanner11.next().charAt(0);
        System.out.println("Enter the second num: ");
        double num2 = scanner11.nextDouble();
        String resultOperator = String.valueOf(calculate(num1, num2, operator));
        System.out.println(resultOperator);

        For_Solver.testDivideNumbers();

        Scanner scanner12 = new Scanner(System.in);
        System.out.println("Enter n: ");
        int sum = scanner12.nextInt();
        int resultSum = testSumNumbers(sum);
        System.out.println(resultSum);

        For_Solver.printMultiplicationTable(2);

        Scanner scannerSimpleNumber = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scannerSimpleNumber.nextInt();
        if (isNumberSimple(number)) {
            System.out.println("The Number is simple");
        } else {
            System.out.println("The Number isn't simple");
        }


        For_Solver.printNumbers();

        Scanner scanner14 = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int numF = scanner14.nextInt();
        int resultFactorial = findFactorial(numF);
        System.out.println(resultFactorial);


        Scanner scanner15 = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int num = scanner15.nextInt();
        printNum(num);

        Scanner scanner16 = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int numP = scanner16.nextInt();
        int resultPositiveNumber = printPositiveNumber(numP);
        System.out.println(resultPositiveNumber);

    }
}
