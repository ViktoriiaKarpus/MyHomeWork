package hw_pattern.task3_Transport;

public class BicycleFactory extends TransportFactory{

    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}
