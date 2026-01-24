package hw_dry_kiss_yagni_solid.task5;

public abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

}
