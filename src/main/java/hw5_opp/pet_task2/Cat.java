package hw5_opp.pet_task2;

public class Cat extends Pet{
    @Override
    void feed() {
        System.out.println("The Cat eats wet food");
    }

    @Override
    void interact() {
        System.out.println("The Cat plays");
    }

    @Override
    public String toString(){
        return "Cat";
    }
}
