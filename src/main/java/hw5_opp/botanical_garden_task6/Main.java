package hw5_opp.botanical_garden_task6;

public class Main {
    public static void main(String[] args) {
       BotanicalGarden  botanicalGarden = new BotanicalGarden();

       Plant cactus = new Cactus();
       botanicalGarden.maintainPlant(cactus);

       Plant chicken = new Orchid();
       botanicalGarden.maintainPlant(chicken);
    }
}
