package solution_book.objects.task25;

import java.util.Objects;

public class EmployeeRecord implements Comparable<EmployeeRecord>{

    //Класс EmployeeRecord
    // Поля: id, name, salary. Сравнение по зарплате, equals() — только по id.

    private String id;
    private String name;
    private Double salary;


    public EmployeeRecord(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeRecord that) {
        return Double.compare(this.salary, that.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeRecord that = (EmployeeRecord) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
