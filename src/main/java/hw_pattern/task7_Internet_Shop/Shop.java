package hw_pattern.task7_Internet_Shop;

public class Shop {


    public Order createOrder(String product, String sale, String payment){
      return new Order.OrderBuilder()
                .setProduct(product)
                .setSale(sale)
                .setPayment(payment)
                .build();
    }


    public Order createPremiumOrder(String product){
        return new Order.OrderBuilder()
                .setProduct(product)
                .setSale("VIP discount")
                .setPayment("creditCard")
                .build();
    }
}
