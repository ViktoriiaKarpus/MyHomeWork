package hw5_opp.zoo_task1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird eagle = new Bird();

        zoo.addAnimal(eagle);
        zoo.forceToMakeASound();
        zoo.forceToMove();

        zoo.removeAnimal();

        Elephant elepant = new Elephant();
        zoo.addAnimal(elepant);
        zoo.forceToMakeASound();
        zoo.forceToMove();

    }
}
