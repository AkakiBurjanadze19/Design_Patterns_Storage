package Structural.Flyweight.ForestSimulation;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<TreeContext> trees = new ArrayList<>();
    private TreeFactory treeFactory = new TreeFactory();

    public void plantTree(int x, int y, String name, String color) {
        Tree tree = treeFactory.getTree(name, color);
        TreeContext treeContext = new TreeContext(x, y, tree);
        trees.add(treeContext);
    }

    public void render() {
        trees.forEach(TreeContext::render);
    }
}