package hw5_opp.aquarium_task4;

public class Starfish extends SeaCreature{
    @Override
    void move() {
        System.out.println("The Starfish crawls very slow");
    }

    @Override
    public String toString(){
        return "Starfish";
    }
}
