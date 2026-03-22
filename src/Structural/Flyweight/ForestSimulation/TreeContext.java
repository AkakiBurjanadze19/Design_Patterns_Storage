package Structural.Flyweight.ForestSimulation;

public class TreeContext {
    private int x;
    private int y;
    private Tree tree;

    public TreeContext(int x, int y, Tree tree) {
        this.x = x;
        this.y = y;
        this.tree = tree;
    }

    public void render() {
        tree.display(x, y);
    }
}