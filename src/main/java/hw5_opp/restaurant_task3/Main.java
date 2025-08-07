package hw5_opp.restaurant_task3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        HotDish frenchPotatoes = new HotDish(75, "FrenchPotatoes");
        Drink cola = new Drink(500);
        menu.addDish(frenchPotatoes);
        menu.addDrink(cola);
        menu.printDish();
    }
}
