package hw_complex_tasks.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {
    //Управление рейтингами:
    //Хранение оценок в  //Управление рейтингами:
    //    //Хранение оценок в Map<Movie, List<Rating>>.
    //    //Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и валидировать оценку на
    //    // допустимость (например, оценка должна быть в пределах от 1 до 10).
    //    //Возможность расчета средней оценки для каждого фильма..
    //Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и валидировать оценку на
    // допустимость (например, оценка должна быть в пределах от 1 до 10).
    //Возможность расчета средней оценки для каждого фильма.

    private final Map<Movie, List<Rating<? extends Number>>> ratings = new HashMap<>();

    public synchronized void addRate(Movie movie, Rating<? extends Number> rating) {
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
