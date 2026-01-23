package hw_dry_kiss_yagni_solid.task6;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name) {
        super(name);
    }


    @Override
    public void fly() {
        System.out.println(getName() + "can fly");
    }
}
