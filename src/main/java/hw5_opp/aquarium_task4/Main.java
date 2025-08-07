package hw5_opp.aquarium_task4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Shark shark = new Shark();
        aquarium.addCreature(shark);
        aquarium.showMovement();

        Starfish starfish = new Starfish();
        aquarium.removeCreature(shark);
        aquarium.addCreature(starfish);
        aquarium.showMovement();
    }
}
