package hw_dry_kiss_yagni_solid.task5;

public class CreditCardPayment extends Payment{
    protected String creditCard;

    public CreditCardPayment(double amount, String creditCard) {
        super(amount);
        this.creditCard = creditCard;
    }

    @Override
    public void processPayment() {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
