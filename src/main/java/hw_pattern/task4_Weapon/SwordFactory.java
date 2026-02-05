package hw_pattern.task4_Weapon;

public class SwordFactory extends WeaponFactory{

    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}
