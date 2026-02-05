package hw_pattern.task4_Weapon;

public class Main {
    public static void main(String[] args) {
        WeaponFactory bowFactory = new BowFactory();
        bowFactory.useWeapon();

        WeaponFactory swordFactory = new SwordFactory();
        swordFactory.useWeapon();

        WeaponFactory gunFactory = new GunFactory();
        gunFactory.useWeapon();
    }
}
