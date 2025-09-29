package solution_book.objects.task4;

import java.util.Objects;

public class Student {
    //Класс Student
    // Поля name, group. Два студента равны, если совпадают оба поля.
    // Выведи список студентов без повторов с помощью Set.

    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

}
