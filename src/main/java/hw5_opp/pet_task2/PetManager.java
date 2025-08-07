package hw5_opp.pet_task2;

public class PetManager {
    private Pet pet;

    public void handlePet(Pet pet) {
        this.pet = pet;
        System.out.println("The Manager spends time with the " + pet);
    }

    public void forceToEat() {
        this.pet.feed();
    }

    public void forceToInteract() {
        this.pet.interact();
    }

}
