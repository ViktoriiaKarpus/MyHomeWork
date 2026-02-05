package hw_pattern.task7_Internet_Shop;

public class Shop {

    private Order.OrderBuilder builder = new Order.OrderBuilder();

    public Order createOrder(String product, String sale, String payment){
        return builder
                .setProduct(product)
                .setSale(sale)
                .setPayment(payment)
                .build();
    }

    public Order createPremiumOrder(String product){
        return builder
                .setProduct(product)
                .setSale("VIP discount")
                .setPayment("creditCart")
                .build();
    }
}
