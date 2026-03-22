package Structural.Flyweight.BulletFiringSimulation;

public class BulletType {
    private String typeName;
    private byte[] sprite;

    public BulletType(String typeName) {
        this.typeName = typeName;
        this.sprite = new byte[512 * 1024];
    }

    public void display(double x, double y) {
        System.out.println("Rendering " + typeName + " at " + x + "," + y + " with sprite size: " + sprite.length);
    }
}