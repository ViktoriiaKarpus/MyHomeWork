package hw_pattern.task8_Game_Personality;

public class Game {

    private Character.CharacterBuilder builder = new Character.CharacterBuilder();

    public Character createPerson(int health, int damage, String armor, String magic){
        return builder
                .setHealth(health)
                .setDamage(damage)
                .setArmor(armor)
                .setMagic(magic)
                .build();
    }
}
