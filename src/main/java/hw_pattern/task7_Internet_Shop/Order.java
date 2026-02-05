package hw_pattern.task7_Internet_Shop;

public class Order {

    private String product;
    private String sale;
    private String payment;

    public Order(String product, String sale, String payment) {
        this.product = product;
        this.sale = sale;
        this.payment = payment;
    }


    private Order (OrderBuilder builder){
        this.product = builder.product;
        this.sale = builder.sale;
        this.payment = builder.payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", sale='" + sale + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }

    static class OrderBuilder{
        private String product;
        private String sale;
        private String payment;


        public OrderBuilder setSale(String sale) {
            this.sale = sale;
            return this;
        }

        public OrderBuilder setPayment(String payment) {
            this.payment = payment;
            return this;
        }

        public OrderBuilder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Order build(){
            return new Order(this);
        }

    }
}
