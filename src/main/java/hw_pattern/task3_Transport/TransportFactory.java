package hw_pattern.task3_Transport;

abstract class TransportFactory {
    abstract Transport createTransport();

    public void planDelivery(){
        Transport transport = createTransport();
        transport.receiveDetails();
    }

}
