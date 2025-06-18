public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2025);
        car.print();
        car.setYear(2027);
        car.print();

        Rectangle rectangle = new Rectangle(22.5, 55.7);
        rectangle.setWidth(32.5);
        System.out.println(rectangle.calculateArea());

        Book book = new Book("Pride and Prejudice", "Jane Austen");
        book.printInfo();
        book.setAuthor("William Shakespeare");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Ivanov", 5000.54);
        bankAccount.printBalance();
        bankAccount.deposit(7000);
        bankAccount.withdraw(3540);
        bankAccount.printBalance();

        Point point = new Point(123.55, 145.87);
        point.print();
        point.setX(112.5);
        point.print();

        StudentGroup studentGroup = new StudentGroup("We are the best", 55);
        studentGroup.printInfo();


    }
}
