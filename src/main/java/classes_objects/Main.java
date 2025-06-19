package classes_objects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2025);
        car.print();
        car.setYear(2027);
        car.print();

        Rectangle rectangle = new Rectangle(22.5, 55.7);
        rectangle.setWidth(32.5);
        System.out.println("Area: " + " " + rectangle.calculateArea());

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
        studentGroup.setStudentCount(85);
        studentGroup.printInfo();

        Circle circle = new Circle(25.5);
        circle.setRadius(45.7);
        System.out.println("Area: " + circle.calculateArea() + " " + "Circumference: " + circle.calculateCircumference());

        Teacher teacher = new Teacher("Ivanov", "Math");
        teacher.printInfo();
        teacher.setSubject("English");
        teacher.printInfo();

        Product product = new Product("Tesla", 40.550);
        product.printInfo();
        product.setPrice(35.453);
        product.applyDiscount(15);
        product.printInfo();

        Laptop laptop = new Laptop("Samsung", 12.535);
        laptop.printInfo();
        laptop.setPrice(10.755);
        laptop.printInfo();
    }
}
