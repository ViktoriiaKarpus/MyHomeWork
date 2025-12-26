package tests.complex_tasks_tests.task3.grade;

import hw_complex_tasks.task3.GradeService;
import org.junit.jupiter.api.BeforeEach;

public class GradeServiceUtils {
    protected GradeService<Integer> integerService;
    protected GradeService<Double> doubleService;

    @BeforeEach
    public void setUpTest(){
        integerService = new GradeService<>();
        doubleService = new GradeService<>();
    }
}
