package tests.complex_tasks_tests.task4.rates;

import hw_complex_tasks.task4.MovieService;
import org.junit.jupiter.api.BeforeEach;

public class MovieServiceUtils {
    protected MovieService movieService;

    @BeforeEach
    public void setUpTest(){
        movieService = new MovieService();
    }
}
