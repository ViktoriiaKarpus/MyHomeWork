public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return (distance / time);
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int add1 = add(5, 7);
        System.out.println("The sum of the two numbers are: " + add1);

        int subtract1 = subtract(12, 9);
        System.out.println("The result of subtraction is: " + subtract1);

        int multiply1 = multiply(15, 25);
        System.out.println("The result of the multiplication is: " + multiply1);

        double divide1 = divide(125, 45);
        System.out.println("The result of division is: " + divide1);

        int findMax1 = findMax(541, 3568);
        System.out.println("The Max value is: " + findMax1);

        int difference1 = difference(75, 135);
        System.out.println("The difference between two numbers is : " + difference1);

        int squareArea1 = squareArea(25);
        int squarePerimeter1 = squarePerimeter(45);
        System.out.println("The squareArea is :" + squareArea1 + " and " + "The squarePerimeter is " + squarePerimeter1);

        int seconds = 25;
        double minutes = convertSecondsToMinutes(seconds);
        System.out.println("convertSecondsToMinutes: " + minutes);

        double averageSpeed1 = averageSpeed(125.5, 33.7);
        System.out.println("The average of the speed is : " + averageSpeed1);

        double averageSpeed2 = averageSpeed(35.33, 0);
        System.out.println("The average of the speed is : " + averageSpeed2);

        double findHypotenuse1 = findHypotenuse(25.2, 75.5);
        System.out.println("The Hypotenuse is: " + findHypotenuse1);

        double findHypotenuse2 = findHypotenuse(25.3, 95.5);
        System.out.println("The Hypotenuse is: " + findHypotenuse2);

        double circleCircumference1 = circleCircumference(6.5);
        System.out.println("The Circumference of the circle is: " + circleCircumference1);
        double circleCircumference2 = circleCircumference(67.85);
        System.out.println("The Circumference of the circle is: " + circleCircumference2);

        double calculatePercentage1 = calculatePercentage(200, 25);
        System.out.println("calculatePercentage : " + calculatePercentage1);

        double calculatePercentage2 = calculatePercentage(0, 25);
        System.out.println("calculatePercentage : " + calculatePercentage2);

        double celsiusToFahrenheit1 = celsiusToFahrenheit(452);
        System.out.println("celsiusToFahrenheit : " + celsiusToFahrenheit1);

        double fahrenheitToCelsius1 = fahrenheitToCelsius(123);
        System.out.println("fahrenheitToCelsius : " + fahrenheitToCelsius1);
    }
}