package Behavioral.Interpreter.RuleBasedDiscountEngine;

public class MembershipExpression implements Expression<Boolean> {
    @Override
    public Boolean interpret(DiscountContext context) {
        return context.isMember();
    }
}