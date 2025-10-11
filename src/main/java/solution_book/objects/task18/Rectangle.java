package solution_book.objects.task18;

public class Rectangle implements Comparable<Rectangle> {
    //Класс Rectangle
    // Поля: width, height.
    // Сравни прямоугольники по площади (в compareTo()), toString() возвращает "10x20".

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int compareTo(Rectangle other) {
        double thisArea = this.height * this.width;
        double otherArea = other.height * other.width;

        return Double.compare(thisArea, otherArea);
    }

    @Override
    public String toString() {
        return (int) width + "x" + (int) height;
    }
}
