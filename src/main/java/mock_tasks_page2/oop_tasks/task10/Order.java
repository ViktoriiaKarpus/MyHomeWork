package mock_tasks_page2.oop_tasks.task10;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private String idOrder;
    List<OrderItems> items = new ArrayList<>();
    public void addOrder(OrderItems item){
        items.add(item);
    }

    public double countGeneralPrice(OrderItems item){
       return item.getPrice() * item.getQuantity();
    }

    public double findPriceOfTheOrder(){
        double total = 0;
        for (OrderItems item : items){
            total+= countGeneralPrice(item);
        }
        return total;
    }

}
