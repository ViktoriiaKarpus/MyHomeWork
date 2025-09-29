package solution_book.objects.task4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Класс Student
        // Поля name, group. Два студента равны, если совпадают оба поля.
        // Выведи список студентов без повторов с помощью Set.

        Student st1 = new Student("Ivi", "A2");
        Student st2 = new Student("Ivi", "A2");
        Student st3 = new Student("Karl", "A3");
        Student st4 = new Student("Niki", "A4");
        Student st5 = new Student("Vivi", "A5");
        Student st6 = new Student("Karl", "A3");

        Set<Student> students = new HashSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        System.out.println("The amount of the students: " + students.size());

        for (Student s : students){
            System.out.println(s);
        }




    }
}
