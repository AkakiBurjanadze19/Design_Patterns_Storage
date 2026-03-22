package Behavioral.Iterator;

import java.util.Iterator;

public class WeaponInventoryIterator implements Iterator {
    private WeaponInventory weaponInventory;
    private int index;

    public WeaponInventoryIterator(WeaponInventory weaponInventory) {
        this.weaponInventory = weaponInventory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        Weapon[] weapons = weaponInventory.getWeapons();
        if (index < weapons.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Weapon next() {
        Weapon[] weapons = weaponInventory.getWeapons();
        if (hasNext()) {
            Weapon weapon = weapons[index++];
            return weapon;
        }

        return null;
    }
}
