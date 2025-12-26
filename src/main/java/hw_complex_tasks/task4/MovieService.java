package hw_complex_tasks.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {

    private final Map<Movie, List<Rating<? extends Number>>> ratings = new HashMap<>();

    public List<Rating<?extends Number >> getRatingsForMovie(Movie movie){
        return new ArrayList<>(ratings.getOrDefault(movie, new ArrayList<>()));
    }

    public synchronized void addRate(Movie movie, Rating<? extends Number> rating) {
        if(rating == null || rating.getValue() == null){
            throw new IllegalArgumentException("Rating cannot be null");
        }

        double value = rating.getValue().doubleValue();
        if (value > 10 || value < 1) {
            throw new IllegalArgumentException("The Valid must be between 1-10");
        }

        ratings.computeIfAbsent(movie, m -> new ArrayList<>());
        ratings.get(movie).add(rating);
    }

    public double getAverageRating(Movie movie) {
        List<Rating<? extends Number>> movieRatings = ratings.get(movie);

        if (movieRatings == null || movieRatings.isEmpty()) {
            throw new IllegalArgumentException("The movie rating is empty");
        }

        return movieRatings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElseThrow(() -> new IllegalArgumentException(" No rates found for the movie"));
    }
}
