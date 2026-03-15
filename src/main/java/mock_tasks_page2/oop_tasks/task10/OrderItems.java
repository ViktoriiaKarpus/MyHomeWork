package mock_tasks_page2.oop_tasks.task10;

public class OrderItems {

    private String name;
    private double price;
    private int quantity;


    public OrderItems(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.quantity = amount;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }


}
