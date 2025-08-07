package hw5_opp.restaurant_task3;

public class Menu {
    public Dish mainDish;
    public Drink drink;

    public void addDrink(Drink drink){
        this.drink = drink;
        System.out.println("The Drink was added: " + drink.getDescription());
    }

    public void addDish(Dish mainDish){
        System.out.println("The Dish was added: " + mainDish.getDescription());
        this.mainDish = mainDish;

    }

    public void printDish(){
        System.out.println("==Menu==");
        System.out.println("Main Dish: " + (mainDish != null ? mainDish.getDescription() : "None"));
        System.out.println("The Drink :" + (drink !=null ? drink.getDescription(): "None"));
    }
}
