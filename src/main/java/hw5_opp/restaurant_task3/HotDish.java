package hw5_opp.restaurant_task3;

public class HotDish extends Dish {
    int temperature;
    String name;

    public HotDish(int temperature, String name){
        this.temperature = temperature;
        this.name = name;
    }

    @Override
    public String getDescription() {
        return  "Dish " + name + " with the temperature " + temperature;
    }
}
