package hw3;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(112,"Viktor");
        Company company2 = new Company(115,"Salina");
        Company company3 = new Company(117, "Tesa");
        company1.printEmployeeInfo();
        company2.printEmployeeInfo();
        company3.printEmployeeInfo();

        Company.setCompanyName("Tesla");
        Company.printCompanyName();

        System.out.println("После смены названия компании: ");

        company1.printEmployeeInfo();
        company2.printEmployeeInfo();
        company3.printEmployeeInfo();


        System.out.println( "Area :" + " " + MathConstants.calculateCircleArea(25.5));
        System.out.println("Area :" + " " + MathConstants.calculateCircleArea(25.5));
        System.out.println("Circumference : " + " " + MathConstants.calculateCircumference(12.3));
        System.out.println("Circumference : " + " " + MathConstants.calculateCircumference(12.3));

        University student1 = new University(1, "Viktoriia");
        University student2 = new University(2, "Arseny");
        University student3 = new University(3, "Mia");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("ULB");
        System.out.println("После смены названия университета: ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings.setMaxPlayers(11);
        GameSettings gameSettings1 = new GameSettings("Kity cat",12);
        GameSettings gameSettings2 = new GameSettings("Bad boys",9);
        gameSettings1.addPlayer();
        gameSettings1.printGameStatus();
        gameSettings2.printGameStatus();

        Person person1 = new Person("Иван","Иванов", "123-45-6789");
        Person person2 = new Person("Petya","Petrov", "123-47-6787");
        Person person3 = new Person("Dava","Davudov", "123-77-7777");

        person1.setFirstName("Tanya");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();






    }


}
