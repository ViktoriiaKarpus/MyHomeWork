package hw5_opp.restaurant_task3;

public class Drink extends Dish{
    int volume;

    public Drink(int volume){
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return "Drink (volume: " + volume + "ml)";
    }
}
