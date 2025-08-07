package hw5_opp.farm_task5;

public class Farm {

    public FarmAnimal farmAnimal;

    public void serviceAnimal(FarmAnimal farmAnimal){
        this.farmAnimal = farmAnimal;
        this.farmAnimal.care();
        this.farmAnimal.feed();
        this.farmAnimal.produce();
    }
}
