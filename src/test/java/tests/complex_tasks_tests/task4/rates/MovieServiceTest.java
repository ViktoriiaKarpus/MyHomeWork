package tests.complex_tasks_tests.task4.rates;

import hw_complex_tasks.task4.Movie;
import hw_complex_tasks.task4.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest extends MovieServiceUtils {

    @Test
    public void testAddRate_PositiveTest() {
        Movie movie = new Movie("Science", 2025, "documentary");

        Rating<Integer> rating = new Rating<>(8);

        assertDoesNotThrow(() -> movieService.addRate(movie, rating));
        assertEquals(1, movieService.getRatingsForMovie(movie).size());
        assertEquals(rating, movieService.getRatingsForMovie(movie).get(0));
    }

    @Test
    public void testAddRate_ExceptionTest() {
        Movie movie = new Movie("Science", 2025, "documentary");

        assertThrows(IllegalArgumentException.class,
                () -> movieService.addRate(movie, null));
    }

    @Test
    public void testAddRate_DoubleRating() {
        Movie movie = new Movie("Science", 2025, "documentary");

        Rating<Double> rating = new Rating<>(8.5);

        assertDoesNotThrow(() -> movieService.addRate(movie, rating));

        assertEquals(8.5, movieService.getAverageRating(movie), 0.001);
    }

    @Test
    public void testAddRate_ExactBoundaryValues() {
        Movie movie = new Movie("Science", 2025, "documentary");

        movieService.addRate(movie, new Rating<>(1));
        movieService.addRate(movie, new Rating<>(10));

        assertEquals(5.5, movieService.getAverageRating(movie), 0.001);
    }

    @Test
    public void testGetAverageRating_EmptyRate() {
        Movie movie = new Movie("Science", 2025, "documentary");

        assertThrows(IllegalArgumentException.class,
                ()-> movieService.getAverageRating(movie));
    }

    @Test
    public void testGetAverageRating_Null(){

        assertThrows(IllegalArgumentException.class,
                ()->movieService.getAverageRating(null));
    }

}
