package hw_dry_kiss_yagni_solid.task5;

public class BitcoinPayment extends Payment{
    protected String bitcoin;


    public BitcoinPayment(double amount, String bitcoin) {
        super(amount);
        this.bitcoin = bitcoin;
    }


    @Override
    public void processPayment() {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
