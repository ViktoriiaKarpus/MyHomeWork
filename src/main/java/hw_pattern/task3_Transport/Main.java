package hw_pattern.task3_Transport;

public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        carFactory.planDelivery();

        TransportFactory bicycleFactory = new BicycleFactory();
        bicycleFactory.planDelivery();
    }
}
