package Structural.Flyweight.BulletFiringSimulation;

import java.util.ArrayList;
import java.util.List;

public class BulletManager {
    private List<Bullet> bullets = new ArrayList<>();
    private BulletFactory bulletFactory = new BulletFactory();

    public void fireBullet(double x, double y, double vX, double vY, String type, int dmg, int speed) {
        // High memory allocation happening here!
        BulletType bulletType = bulletFactory.getBulletType(type);
        Bullet bullet = new Bullet(x, y, vX, vY, dmg, speed, bulletType);
        bullets.add(bullet);
    }

    public void update() {
        bullets.forEach(b -> {
            b.move();
            b.render();
        });
    }
}