package hw_dry_kiss_yagni_solid;

public class Task2 {

    public double calculateDiscount(double price, boolean isLoyalCustomer,
                                    boolean isFirstPurchase, boolean hasCoupon) {
        double discount;

        if (isLoyalCustomer && isFirstPurchase) {
            discount = 0.10;
        } else if (isLoyalCustomer) {
            discount = 0.05;
        } else if (hasCoupon) {
            discount = 0.07;
        } else {
            discount = 0.02;
        }
        return price - price * discount;
    }
}
