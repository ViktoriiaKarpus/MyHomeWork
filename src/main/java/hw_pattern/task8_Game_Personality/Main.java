package hw_pattern.task8_Game_Personality;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Character warrior = game.createPerson(100, 20,  "metal", "fire");
        System.out.println(warrior);

        Character mage = game.createPerson(80, 10, "water", "ice");
        System.out.println(mage);
    }
}
