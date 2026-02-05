package hw_pattern.task4_Weapon;

public class BowFactory extends WeaponFactory {

    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}
