package hw5_opp.zoo_task1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("The Animal " + animal + " was added to the Zoo");
    }

    public void removeAnimal() {
        this.animal = null;
        System.out.println("The Animal " + animal + " was removed from the Zoo");
    }

    public void forceToMove() {
        this.animal.move();
    }

    public void forceToMakeASound() {
        this.animal.makeSound();
    }
}
