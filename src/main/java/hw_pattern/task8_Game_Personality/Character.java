package hw_pattern.task8_Game_Personality;

public class Character {

    private int health;
    private int damage;
    private String armor;
    private String magic;

    public Character(int health, int damage, String armor, String magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public Character(CharacterBuilder builder){
        this.health = builder.health;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "Character{" +
                "health=" + health +
                ", damage=" + damage +
                ", armor='" + armor + '\'' +
                ", magic='" + magic + '\'' +
                '}';
    }

    static class CharacterBuilder{
        private int health;
        private int damage;
        private String armor;
        private String magic;

        public CharacterBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setMagic(String magic) {
            this.magic = magic;
            return this;
        }

        public Character build(){
            return new Character(this);
        }

    }
}
