package solution_book.objects.task21;

import java.util.Objects;

public class Passport {

    //Класс Passport
    // Поля: series, number. Два паспорта равны, если совпадают оба поля.
    private String series;
    private int number;

    public Passport(String series, int number) {
        this.series = series;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number && Objects.equals(series, passport.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, number);
    }
}
