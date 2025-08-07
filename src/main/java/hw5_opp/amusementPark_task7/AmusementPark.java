package hw5_opp.amusementPark_task7;

public class AmusementPark {
    public Attraction attraction1;
    public Attraction attraction2;

    public AmusementPark(Attraction attraction1, Attraction attraction2){
        this.attraction1 = attraction1;
        this.attraction2 = attraction2;
    }

    public void showInformation(){
        System.out.println("Attraction info: ");
        attraction1.info();
        attraction2.info();
    }

    public void maintainAttractions(){
        System.out.println("Attractions' maintain: ");
        attraction1.maintain();
        attraction2.maintain();
    }
}
