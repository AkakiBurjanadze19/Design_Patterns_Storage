package Behavioral.Iterator;

import java.util.Iterator;

public class WeaponInventory implements Iterable {
    private Weapon[] weapons;

    public WeaponInventory(Weapon... weapons) {
        this.weapons = weapons;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    @Override
    public WeaponInventoryIterator iterator() {
        return new WeaponInventoryIterator(this);
    }
}