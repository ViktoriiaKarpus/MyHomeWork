package hw5_opp.zoo_task1;

public class Bird extends Animal {

    @Override
    void makeSound() {
        System.out.println("The Bird tweets");
    }

    @Override
    void move() {
        System.out.println("The Bird flies");
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}
