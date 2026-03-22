package Behavioral.Iterator;

public class Weapon {
    private String name;
    private WeaponType type;
    private int damage;

    public Weapon(String name, WeaponType type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", damage=" + damage +
                '}';
    }
}