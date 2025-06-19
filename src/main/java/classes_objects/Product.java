package classes_objects;

public class Product {

    /**
     * Создайте класс Product с полями name и price.
     * Реализуйте конструктор, геттеры, сеттер для цены,
     * метод applyDiscount(discount) для применения скидки,
     * и метод printInfo(),
     * выводящий информацию о товаре и цене.
     * В main измените цену, примените скидку и выведите цену.*/

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void applyDiscount(double discount){
        price = price * (1 - discount / 100);
    }

    public void printInfo(){
        System.out.printf("Name: %s Price: %.3f\n", name ,  price);
    }




}
