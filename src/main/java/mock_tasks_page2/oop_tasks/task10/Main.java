package mock_tasks_page2.oop_tasks.task10;

public class Main {

    public static void main(String[] args) {
        OrderItems it1 = new OrderItems("Noteboo", 1000, 1);
        OrderItems it2 = new OrderItems("Mice", 50, 2);
        OrderItems it3 = new OrderItems("Keyboard", 120, 1);

        Order myOrder = new Order();

        myOrder.addOrder(it1);
        myOrder.addOrder(it2);
        myOrder.addOrder(it3);

        myOrder.findPriceOfTheOrder();

        System.out.println("Price of the order: " + myOrder.findPriceOfTheOrder());

    }
}
