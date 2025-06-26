package hw3;

public class Company {
    /**
     * static String companyName — общее название для всех сотрудников
     * final int employeeID — уникальный идентификатор (нельзя менять)
     * String employeeName — имя сотрудника Реализуйте конструктор,
     * принимающий employeeID и employeeName, статический метод printCompanyName(),
     * геттеры и сеттеры для employeeName.
     * В main: создайте несколько сотрудников, измените companyName и проверьте,
     * что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
     */

    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        companyName = "Samsung";
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String newEmployeeName){
        employeeName = newEmployeeName;
    }

    static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    public static void printCompanyName() {
        System.out.println("Company Name: " + " " + companyName);
    }

    public void printEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID +
                ", Name: " + employeeName +
                ", Company: " + companyName);
    }
}
