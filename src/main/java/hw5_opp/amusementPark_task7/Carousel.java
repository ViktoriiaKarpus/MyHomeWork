package hw5_opp.amusementPark_task7;

public class Carousel implements Attraction {
    private String name;

    public Carousel(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Attraction -  " + name + "a calm and relaxing ride");
    }

    @Override
    public void maintain() {
        System.out.println("Attraction - " + name + "performing technical maintenance");
    }
}
