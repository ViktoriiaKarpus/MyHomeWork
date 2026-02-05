package hw_pattern.task4_Weapon;

public class GunFactory extends WeaponFactory{

    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
