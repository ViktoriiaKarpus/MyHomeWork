package hw5_opp.farm_task5;

public class Cow implements FarmAnimal {
    @Override
    public void feed() {
        System.out.println("The Cow eats grass");
    }

    @Override
    public void care() {
        System.out.println("The Cow grazes");
    }

    @Override
    public void produce() {
        System.out.println("The Cow gives milk");
    }
}
