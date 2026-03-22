package Behavioral.Interpreter.RuleBasedDiscountEngine;

public class OrExpression implements Expression<Boolean> {
    private Expression<Boolean> exp1;
    private Expression<Boolean> exp2;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public Boolean interpret(DiscountContext context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
