package hw5_opp.museum_task8;

public class Sculpture extends Exhibit{
    @Override
    public String describe() {
        return "Sculptural object";
    }

    @Override
    public void preserve() {
        System.out.println("Restoration");
    }
}
