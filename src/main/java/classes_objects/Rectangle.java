package classes_objects;

public class Rectangle {
    /**
     * Создайте класс Rectangle с полями width и height.
     * Реализуйте конструктор, геттеры для ширины и высоты,
     * сеттер только для ширины и метод calculateArea() для расчёта площади.
     * В main создайте прямоугольник,
     * измените ширину и выведите площадь.
     */
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public double calculateArea(){
        return width * height;
    }
}
