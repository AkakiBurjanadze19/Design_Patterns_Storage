package Structural.Flyweight.ForestSimulation;

import java.util.Map;
import java.util.HashMap;

public class TreeFactory {
    private Map<String, Tree> trees = new HashMap<>();

    public Tree getTree(String name, String color) {
        if (trees.containsKey(name)) {
            return trees.get(name);
        } else {
            Tree tree = new Tree(name, color);
            trees.put(name, tree);
            return tree;
        }
    }
}
