package hw_complex_tasks.task4;

import java.util.Objects;

public class Movie {

    private String nameofTheMovie;
    private int year;
    private String movieGenre;

    public Movie(String nameofTheMovie, int year, String movieGenre) {
        this.nameofTheMovie = nameofTheMovie;
        this.year = year;
        this.movieGenre = movieGenre;
    }

    public String getNameofTheMovie() {
        return nameofTheMovie;
    }

    public int getYear() {
        return year;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(nameofTheMovie, movie.nameofTheMovie) && Objects.equals(movieGenre, movie.movieGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameofTheMovie, year, movieGenre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nameofTheMovie='" + nameofTheMovie + '\'' +
                ", year=" + year +
                ", movieGenre='" + movieGenre + '\'' +
                '}';
    }

}
