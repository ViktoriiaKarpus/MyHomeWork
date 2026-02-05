package hw_pattern.task7_Internet_Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Order regularOrder = shop.createOrder(
                "Samsung S25",
                "5% discount",
                "creditCard"
        );

        System.out.println("Regular order: " + regularOrder);

        Order premiumOrder = shop.createPremiumOrder("MacBook Pro");
        System.out.println("Premium order: " +  premiumOrder);

        Order directOrder = new Order.OrderBuilder()
                .setProduct("Tee")
                .setPayment("Cash")
                .build();

        System.out.println("Direct order: " + directOrder);
    }
}
