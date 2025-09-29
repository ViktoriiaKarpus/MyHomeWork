package solution_book.objects.task3;

import java.util.Objects;

public class Point2D {
    //Класс Point2D
    // Поля x, y. Если x и y равны, точки считаются равными. Проверь поведение в коллекциях (HashSet).


    private String x;
    private String y;

    public Point2D(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D that = (Point2D) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }


}
