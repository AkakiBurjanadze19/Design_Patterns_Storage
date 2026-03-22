package Structural.Flyweight.BulletFiringSimulation;

public class Bullet {
    private double x, y;
    private double velocityX, velocityY;
    private int damage;
    private double speed;
    private BulletType bulletType;

    public Bullet(
            double x,
            double y,
            double vX,
            double vY,
            int damage,
            int speed,
            BulletType bulletType
    ) {
        this.x = x;
        this.y = y;
        this.velocityX = vX;
        this.velocityY = vY;
        this.damage = damage;
        this.speed = speed;
        this.bulletType = bulletType;
    }

    public void move() {
        x += velocityX;
        y += velocityY;
    }

    public void render() {
        bulletType.display(x, y);
    }
}