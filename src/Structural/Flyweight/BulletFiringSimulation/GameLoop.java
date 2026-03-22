package Structural.Flyweight.BulletFiringSimulation;

import java.util.Random;

public class GameLoop {
    public static void main(String[] args) {
        Random rand = new Random();
        BulletManager manager = new BulletManager();

        for (int i = 0; i < 10_000; i++) {
            double vX = rand.nextDouble() * 0.5;
            double vY = rand.nextDouble() * 0.5;

            manager.fireBullet(0, 0, vX, vY, "RedLaser", 10, 100);
        }

        manager.update();
    }
}