package Behavioral.Interpreter.RuleBasedDiscountEngine;

import java.util.Arrays;
import java.util.List;

public class DiscountContext {
    private int totalSpent;
    private boolean isMember;
    private List<String> items = Arrays.asList("Smartphone", "Laptop", "Dishwasher");

    public DiscountContext(int totalSpent, boolean isMember) {
        this.totalSpent = totalSpent;
        this.isMember = isMember;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public boolean isMember() {
        return isMember;
    }

    public List<String> getItems() {
        return items;
    }
}