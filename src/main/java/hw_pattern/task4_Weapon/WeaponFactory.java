package hw_pattern.task4_Weapon;

abstract class WeaponFactory {
    abstract Weapon createWeapon();

    public void useWeapon(){
        Weapon weapon = createWeapon();
        weapon.attack();
    }
}
