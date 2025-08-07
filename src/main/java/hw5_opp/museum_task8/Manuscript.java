package hw5_opp.museum_task8;

public class Manuscript extends Exhibit{


    @Override
    public String describe() {
        return "Ancient text";
    }

    @Override
    public void preserve() {
        System.out.println("Controlled humidity");
    }
}
