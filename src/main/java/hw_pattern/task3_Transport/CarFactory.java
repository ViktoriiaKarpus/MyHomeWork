package hw_pattern.task3_Transport;

public class CarFactory extends TransportFactory{
    @Override
    Transport createTransport() {
        return new Car();
    }
}
