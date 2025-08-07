package hw5_opp.botanical_garden_task6;

public class BotanicalGarden {
    public Plant plant;

    public void maintainPlant(Plant plant){
        this.plant = plant;
        this.plant.care();
    }
}
