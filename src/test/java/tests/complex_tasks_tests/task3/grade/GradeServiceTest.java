package tests.complex_tasks_tests.task3.grade;

import hw_complex_tasks.task3.GradeService;
import hw_complex_tasks.task3.InvalidGradeException;
import hw_complex_tasks.task3.StudentGrade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest extends GradeServiceUtils {

    @Test
    public void testAddGrade_ValidTest() {
        GradeService<Integer> service = new GradeService<>();
        StudentGrade<Integer> grade = new StudentGrade<>("John", "Math", 90);

        assertDoesNotThrow(() -> service.addGrade(grade));
        assertEquals(1, service.getGrades().size());
        assertEquals(grade, service.getGrades().get(0));

    }

    @Test
    public void testAddGrade_NegativeTest_ShouldThrowTheException() {
        GradeService<Integer> service = new GradeService<>();
        StudentGrade<Integer> grade = new StudentGrade<>("John", "Math", -5);

        assertThrows(InvalidGradeException.class,
                () -> service.addGrade(grade));
    }

    @Test
    public void testAddGrade_NegativeTest_Null_ShouldThrowTheException() {
        GradeService<Integer> service = new GradeService<>();
        StudentGrade<Integer> grade = new StudentGrade<>("John", "Math", null);

        assertThrows(InvalidGradeException.class,
                () -> service.addGrade(grade));
    }

    @Test
    public void testAverageGradeForSubject_Integer() {

        integerService.addGrade(new StudentGrade<>("John", "Math", 90));
        integerService.addGrade(new StudentGrade<>("Anna", "Math", 70));

        double avg = integerService.averageGradeForSubject("Math");

        assertEquals(80.0, avg);
    }

    @Test
    public void testAverageGradeForSubject_Double() {

        doubleService.addGrade(new StudentGrade<>("John", "Math", 80.5));
        doubleService.addGrade(new StudentGrade<>("Anna", "Math", 90.0));

        double avg = doubleService.averageGradeForSubject("Math");

        assertEquals(85.25, avg, 0.001);
    }

    @Test
    public void testAverageGradeForSubject_NoGrades_ShouldThrow() {
        GradeService<Integer> service = new GradeService<>();

        assertThrows(InvalidGradeException.class,
                () -> integerService.averageGradeForSubject("Math"));
    }

    @Test
    public void testAverageGradeForSubject_WrongSubject_ShouldThrow() {
        GradeService<Integer> service = new GradeService<>();

        service.addGrade(new StudentGrade<>("John", "Math", 90));

        assertThrows(InvalidGradeException.class,
                () -> integerService.averageGradeForSubject("Football"));
    }

}
