package Behavioral.Interpreter.RuleBasedDiscountEngine;

public class AmountExpression implements Expression<Boolean> {
    private int minAmount;

    public AmountExpression(int minAmount) {
        this.minAmount = minAmount;
    }

    @Override
    public Boolean interpret(DiscountContext context) {
        return context.getTotalSpent() > minAmount;
    }
}
