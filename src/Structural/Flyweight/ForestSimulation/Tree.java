package Structural.Flyweight.ForestSimulation;

public class Tree {
    private int x;
    private int y;
    private String name;
    private String color;
    private byte[] texture = new byte[1024 * 1024];

    public Tree(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display(int x, int y) {
        System.out.println("Drawing " + name + " [" + color + "] at (" + x + "," + y + ")");
    }
}
