package hw_dry_kiss_yagni_solid.task5;

public class PayPalPayment extends Payment{

    protected String paypal;

    public PayPalPayment(double amount, String paypal) {
        super(amount);
        this.paypal = paypal;
    }


    @Override
    public void processPayment() {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
