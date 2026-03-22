package Behavioral.Interpreter.RuleBasedDiscountEngine;

public class Client {
    public static void main(String[] args) {
        Expression<Boolean> isMember = new MembershipExpression();
        Expression<Boolean> spentOver500 = new AmountExpression(500);
        Expression<Boolean> or = new OrExpression(isMember, spentOver500);

        DiscountContext personA = new DiscountContext(600, false);

        boolean canDiscount = or.interpret(personA);

        System.out.println(canDiscount);
    }
}
