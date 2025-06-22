package classes_objects;

public class Point {
    /**
     * Создайте класс Point с координатами x и y.
     * Реализуйте конструктор, геттеры,
     * сеттер только для x, и метод print(),
     * выводящий координаты.
     * В main измените x, выведите новые координаты.
     */

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

    public void print() {
        System.out.println("Coordinate for X is :" + x + " " + " Coordinate for Y is: " + y);
    }


}
