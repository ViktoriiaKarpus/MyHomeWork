package hw5_opp.farm_task5;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();

        FarmAnimal cow = new Cow();
        farm.serviceAnimal(cow);

        FarmAnimal chicken = new Chicken();
        farm.serviceAnimal(chicken);
    }
}
