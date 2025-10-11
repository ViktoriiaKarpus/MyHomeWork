package solution_book.objects.task25;

public class Main {
    //Класс EmployeeRecord
    // Поля: id, name, salary. Сравнение по зарплате, equals() — только по id.
    public static void main(String[] args) {
        EmployeeRecord employeeRecord1 = new EmployeeRecord("123", "Steve Peters", 5050.50);
        EmployeeRecord employeeRecord2 = new EmployeeRecord("123", "Steve Peters", 5050.50);
        EmployeeRecord employeeRecord3 = new EmployeeRecord("125", "Niki Flami", 7000.50);

        System.out.println("employeeRecord1 compareTo employeeRecord2: " +  employeeRecord1.compareTo(employeeRecord2));
        System.out.println("employeeRecord2 compareTo employeeRecord3: " +  employeeRecord2.compareTo(employeeRecord3));
        System.out.println("employeeRecord1 compareTo employeeRecord3: " +  employeeRecord1.compareTo(employeeRecord3));

        System.out.println("employeeRecord1 equals employeeRecord2: " + employeeRecord1.equals(employeeRecord2));
        System.out.println("employeeRecord2 equals employeeRecord3: " + employeeRecord2.equals(employeeRecord3));
        System.out.println("employeeRecord1 equals employeeRecord3: " + employeeRecord1.equals(employeeRecord3));

    }
}
