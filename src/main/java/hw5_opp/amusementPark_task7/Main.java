package hw5_opp.amusementPark_task7;

public class Main {
    public static void main(String[] args) {
      Attraction attraction1 = new Carousel("Ferris wheel");
      Attraction attraction2 = new RollerCoaster("Carousel with the wind");

      AmusementPark amusementPark = new AmusementPark(attraction1, attraction2);

      amusementPark.showInformation();
      amusementPark.maintainAttractions();
    }
}
