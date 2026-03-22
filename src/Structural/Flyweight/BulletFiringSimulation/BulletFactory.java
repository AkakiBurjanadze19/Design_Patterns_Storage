package Structural.Flyweight.BulletFiringSimulation;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private Map<String, BulletType> bulletTypes = new HashMap<>();

    public BulletType getBulletType(String bulletType) {
        if (bulletTypes.containsKey(bulletType)) {
            return bulletTypes.get(bulletType);
        } else {
            BulletType bullet = new BulletType(bulletType);
            bulletTypes.put(bulletType, bullet);

            return bullet;
        }
    }
}