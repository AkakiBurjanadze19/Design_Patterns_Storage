package Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        Weapon sniperRifle = new Weapon(
                "AWM Sniper Rifle",
                WeaponType.BOLT_ACTION,
                120
        );
        Weapon subMachineGun = new Weapon(
          "MP5 Submachine Gun",
          WeaponType.AUTOMATIC,
          29
        );
        Weapon shotgun = new Weapon(
                "M1887 Shotgun",
                WeaponType.LEVEL_ACTION,
                100
        );

        WeaponInventory weaponInventory = new WeaponInventory(
                sniperRifle,
                subMachineGun,
                shotgun
        );

        WeaponInventoryIterator inventoryIterator = new WeaponInventoryIterator(weaponInventory);

        while (inventoryIterator.hasNext()) {
            Weapon nextWeapon = inventoryIterator.next();
            System.out.println(nextWeapon);
        }
    }
}