package static_final_public_default;

public class Company {
    /**
     * Создайте класс Company с полями:
     * static String companyName — общее название для всех сотрудников
     * final int employeeID — уникальный идентификатор (нельзя менять)
     * String employeeName — имя сотрудника.
     * Реализуйте конструктор,
     * принимающий employeeID и employeeName, статический метод printCompanyName(),
     * геттеры и сеттеры для employeeName.
     * В main: создайте несколько сотрудников,
     * измените companyName и проверьте, что она изменилась для всех.
     * Попробуйте изменить employeeID — должно быть невозможно.
     */

    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        companyName = "Samsung";
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String newEmployeeName) {
       employeeName = newEmployeeName;
    }

    public static void setCompanyName(String newCompanyName) {
      companyName = newCompanyName;
    }

    public static void printCompanyName(){
        System.out.println("Company Name: " + " " + companyName);
    }

    public void printEmployeeInfo(){
        System.out.println("Employee Id: " + employeeID +
                ", Name: " + employeeName +
                ", Company Name: " + companyName);
    }
}
