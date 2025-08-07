package hw5_opp.pet_task2;

public class Dog extends Pet{
    @Override
    void feed() {
        System.out.println("The Dog eats dry food");
    }

    @Override
    void interact() {
        System.out.println("The Dog walks");
    }

    @Override
    public String toString(){
        return "Dog";
    }
}

