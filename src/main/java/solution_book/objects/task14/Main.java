package solution_book.objects.task14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //Класс Grade
    // Поля: studentName, subject, score.
    // Сравнение (compareTo()) должно идти по убыванию балла.

    public static void main(String[] args) {

        List<Grade> grades = new ArrayList<>();

        grades.add(new Grade("Alice", "Math",85));
        grades.add(new Grade("Bob", "Physics", 92));
        grades.add(new Grade("Charlie", "History", 78));
        grades.add(new Grade("Diana", "Math", 92));
        grades.add(new Grade("Evan", "Chemistry", 88));

        Collections.sort(grades);

        System.out.println("Sorted grades: descending order  " + grades);
        for (Grade grade: grades){
            System.out.println(grade);
        }

    }
}
