package solution_book.objects.task8;

import java.util.Objects;

public class Order {

    ////Класс Order
    //   Поля: orderId, date. Переопредели equals() и hashCode() по orderId.
    //  Проверь, работает ли Map<Order, String> корректно.

    private int orderId;
    private String date;

    public Order(int oderId, String date) {
        this.orderId = oderId;
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order that = (Order) obj;
        return this.orderId == that.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", date='" + date + '\'' +
                '}';
    }

}
