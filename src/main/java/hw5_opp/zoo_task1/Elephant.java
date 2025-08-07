package hw5_opp.zoo_task1;

public class Elephant extends Animal{
    @Override
    void makeSound() {
        System.out.println("The Elephant trumpts");
    }

    @Override
    void move() {
        System.out.println("The Elephant goes");
    }

    @Override
    public String toString(){
        return "Elephant";
    }
}
