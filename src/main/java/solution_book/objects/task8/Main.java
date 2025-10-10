package solution_book.objects.task8;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //Класс Order
    // Поля: orderId, date. Переопредели equals() и hashCode() по orderId.
    // Проверь, работает ли Map<Order, String> корректно.

    public static void main(String[] args) {
        Order order1 = new Order(123, "12.07.2025");
        Order order2 = new Order(123, "13.05.2025");
        Order order3 = new Order(125, "12.07.2025");

        Map<Order, String> map = new HashMap<>();
        map.put(order1, "The first order");
        map.put(order2, "The second order");
        map.put(order3, "The third order");

        System.out.println("Map size :" + map.size());
        System.out.println("Map contents :" + map);

    }
}
