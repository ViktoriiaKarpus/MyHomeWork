package classes_objects;

public class Car {
    /**
     * Создайте класс classes_objects. Car с полями brand (строка) и year (целое число).
     * Реализуйте конструктор с двумя параметрами,
     * геттеры и сеттеры для обоих полей, метод print(),
     * выводящий информацию о марке и годе выпуска.
     * В main создайте объект, установите значения через конструктор,
     * измените год через сеттер, выведите информацию.
     */

    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print() {
        System.out.println("Brand: " + brand + " " + "Year: " + year);
    }


}
