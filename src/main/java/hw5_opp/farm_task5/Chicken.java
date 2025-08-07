package hw5_opp.farm_task5;

public class Chicken implements FarmAnimal {
    @Override
    public void feed() {
        System.out.println("The Chicken eats corn");
    }

    @Override
    public void care() {
        System.out.println("The Chicken needs a feeder");
    }

    @Override
    public void produce() {
        System.out.println("The Chicken lays eggs");
    }
}
