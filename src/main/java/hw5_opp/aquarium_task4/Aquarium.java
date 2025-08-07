package hw5_opp.aquarium_task4;

public class Aquarium {
    public SeaCreature seaCreature;

    public void addCreature(SeaCreature seaCreature){
        this.seaCreature = seaCreature;
        System.out.println(seaCreature + " was added into the aquarium");
    }

    public void removeCreature(SeaCreature creature){
        System.out.println(seaCreature + " was removed from the aquarium");
        this.seaCreature = null;
    }

    public void showMovement(){
        this.seaCreature.move();
    }
}
