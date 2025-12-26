package hw_complex_tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {

    private final List<StudentGrade<T>> grades = new ArrayList<>();

    public List<StudentGrade<T>> getGrades(){
        return new ArrayList<>(grades);
    }

    public synchronized void addGrade(StudentGrade<T> grade){
        if(grade.getGrade() == null || grade.getGrade().doubleValue() < 0){
            throw new InvalidGradeException("The Grade cannot be null or negative");
        }

        grades.add(grade);

    }

    public double averageGradeForSubject(String subject){
        return grades.stream()
                .filter(g-> g.getSubject().equals(subject))
                .mapToDouble(g->g.getGrade().doubleValue())
                .average()
                .orElseThrow(()->new InvalidGradeException ("No grades found for subject"));

    }

}
