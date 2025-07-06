package hw4;

import java.util.Scanner;

import static hw4.For_Solver.isNumberSimple;
import static hw4.For_Solver.testSumNumbers;
import static hw4.If_Else_Solver.*;
import static hw4.Switch_Solver.*;
import static hw4.While_Solver.*;

public class Main {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int numTheSignOfTheNumber = scanner.nextInt();
        // String result = findTheSignOfTheNumber(numTheSignOfTheNumber);
        // System.out.println(result);

        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Enter the first number: ");
        //  int a =  scanner.nextInt();
        //  System.out.println("Enter the second number: ");
        //  int b =  scanner.nextInt();
        //  int resultMaxAB = findTheBiggerNumber(a,b);
        //  System.out.println("The biggest number is : " + resultMaxAB);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the garde: ");
        // int grade = scanner.nextInt();
        // String resultGrade = chooseGrade(grade);
        // System.out.println(resultGrade);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int numOddEven = scanner.nextInt();
        // String resultOddEvenNumber = isTheNumOddOrEven(numOddEven);
        // System.out.println(resultOddEvenNumber);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the age : ");
        // int age = scanner.nextInt();
        // String resultDiscount = findTheSizeOdTheDiscount(age);
        // System.out.println(resultDiscount);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the tests' results: ");
        // int testResults = scanner.nextInt();
        // String resultsOfTheTest = findTestResults(testResults);
        // System.out.println(resultsOfTheTest);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int dayOfTheWeek = scanner.nextInt();
        // String resultDayOfTheWeek = testTheDayOfTheWeek(dayOfTheWeek);
        // System.out.println(resultDayOfTheWeek);


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int numDayOfTheWeek = scanner.nextInt();
        // String resultPrice = findThePriceOfTheTicket(numDayOfTheWeek);
        // System.out.println(resultPrice);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the num: ");
        // int numGrade = scanner.nextInt();
        // String resultLettersGrade = convertNumericalGradesIntoLettersGrades(numGrade);
        // System.out.println(resultLettersGrade);

        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Enter the command: ");
        //  String input = scanner.nextLine().trim().toUpperCase();

        //  try{
        //      Command command = Command.valueOf(input);
        //      String result = testCommand(command);
        //      System.out.println(result);
        //  } catch (IllegalArgumentException e) {
        //      System.out.println("Unknown command");
        //  }


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the first num: ");
        // double num1 = scanner.nextDouble();
        // System.out.println("Enter the operator (+,-,*,/): ");
        // char operator = scanner.next().charAt(0);
        // System.out.println("Enter the second num: ");
        // double num2 = scanner.nextDouble();
        // String resultOperator = String.valueOf(calculate(num1, num2, operator));
        // System.out.println(resultOperator);

        // For_Solver.testDivideNumbers();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // int sum = scanner.nextInt();
        // int resultSum = testSumNumbers(sum);
        // System.out.println(resultSum);

        // For_Solver.printMultiplicationTable(2);

        // Scanner scannerSimpleNumber = new Scanner(System.in);
        // System.out.println("Enter the Number: ");
        // int number = scannerSimpleNumber.nextInt();

        // if(isNumberSimple(number)){
        //     System.out.println("The Number is simple");
        // }else{
        //     System.out.println("The Number isn't simple");
        // }


        // For_Solver.printNumbers();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println(" Enter the number: ");
        // int num = scanner.nextInt();
        // int resultFactorial = findFactorial(num);
        // System.out.println(resultFactorial);


       // Scanner scanner = new Scanner(System.in);
       // System.out.println(" Enter the number: ");
       // int num = scanner.nextInt();
       // printNum(num);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int num = scanner.nextInt();

        int resultPositiveNumber = printPositiveNumber(num);
        System.out.println(resultPositiveNumber);



    }
}
