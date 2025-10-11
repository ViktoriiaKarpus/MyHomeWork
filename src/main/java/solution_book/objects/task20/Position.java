package solution_book.objects.task20;

import java.util.Objects;

public class Position {
    //Класс Position
    // Поля: x, y. equals() и hashCode() — по координатам.
    // toString() должен возвращать формат "(x=5, y=7)".

    private Double x;
    private Double y;

    public Position(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(x, position.x) && Objects.equals(y, position.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(x=" + x + " , y=" + y + ")";
    }

}
