package Structural.Flyweight.ForestSimulation;

public class Usage {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 10_000; i++) {
            forest.plantTree(i, i, "Oak", "Green");
        }

        forest.render();
    }
}