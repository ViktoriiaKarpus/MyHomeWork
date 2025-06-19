package classes_objects;

public class Circle {

    /**Создайте класс Circle с полем radius.
     *  Реализуйте конструктор, геттер и сеттер,
     *  методы calculateArea() и calculateCircumference().
     *  В main измените радиус,
     *  выведите площадь и длину окружности.*/

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double calculateArea(){
        return  Math.PI * radius * radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
}
