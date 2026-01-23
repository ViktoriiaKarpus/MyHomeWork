package hw_dry_kiss_yagni_solid;

public class Task1 {

    public class MathOperations {
        public int add(int a, int b) {
            return a + b;
        }

        public int addThreeNumbers(int a, int b, int c) {
            return add(a, b) + c;
        }

        public int addFourNumbers(int a, int b, int c, int d) {
            return addThreeNumbers(a, b, c) + d;
        }
    }
}
