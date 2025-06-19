package classes_objects;

public class Laptop {

    /**
     * Создайте класс Laptop с полями brand и price.
     * Реализуйте конструктор, геттеры и сеттеры,
     * и метод printInfo(),
     * выводящий информацию о ноутбуке и его цене.
     * В main измените цену и выведите информацию.
     */

    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void printInfo(){
        System.out.println("Brand: " + brand + " " + "Price: " + price);
    }
}
