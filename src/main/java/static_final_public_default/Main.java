package static_final_public_default;

public class Main {
    public static void main(String[] args) {

        Company employee1 = new Company(123, "Viktoriia");
        Company employee2 = new Company(127, "Arseny");
        Company employee3 = new Company(127, "Mia");

        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();
        employee3.printEmployeeInfo();
        Company.printCompanyName();
        Company.setCompanyName("Tesla");
        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();
        employee3.printEmployeeInfo();

        System.out.println("Area : " + MathConstants.calculateCircleArea(25.5));
        System.out.println("Area : " + MathConstants.calculateCircleArea(37.7));
        System.out.println("Circumference: " + MathConstants.calculateCircumference(12.5));
        System.out.println("Circumference: " + MathConstants.calculateCircumference(17.5));

        University student1 = new University(333, "Petya");
        University student2 = new University(334, "Ivan");
        University student3 = new University(335, "Alex");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("ULB");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings.setMaxPlayers(11);
        GameSettings game1 = new GameSettings("Kity cat", 12);
        GameSettings game2 = new GameSettings("Bad boys", 9);
        game1.addPlayer();
        game1.printGameStatus();
        game2.addPlayer();
        game2.printGameStatus();

        Person person1 = new Person(" Ivan", "Ivanov", "123-45-6789");
        Person person2 = new Person(" Petya", "Petrov", "133-55-7777");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person1.setFirstName("Mia");
        person1.setLastName("Kai");
        person1.printPersonInfo();



    }
}
