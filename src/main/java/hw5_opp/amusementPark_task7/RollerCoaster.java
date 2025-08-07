package hw5_opp.amusementPark_task7;

public class RollerCoaster implements Attraction {

    public String name;

    public RollerCoaster(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Attraction - " + name + " thrilling carousel experience!");
    }

    @Override
    public void maintain() {
        System.out.println("Attractions - " + name + " performing safety check");
    }
}
