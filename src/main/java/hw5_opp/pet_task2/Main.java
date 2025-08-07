package hw5_opp.pet_task2;

public class Main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        Dog dog = new Dog();
        petManager.handlePet(dog);
        petManager.forceToEat();
        petManager.forceToInteract();

        Cat cat = new Cat();
        petManager.handlePet(cat);
        petManager.forceToEat();
        petManager.forceToInteract();

    }
}
