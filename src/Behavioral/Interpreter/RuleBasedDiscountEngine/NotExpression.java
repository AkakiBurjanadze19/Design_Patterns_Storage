package Behavioral.Interpreter.RuleBasedDiscountEngine;

public class NotExpression implements Expression<Boolean> {
    private Expression<Boolean> expr;

    public NotExpression(Expression<Boolean> expr) {
        this.expr = expr;
    }

    @Override
    public Boolean interpret(DiscountContext context) {
        return !(expr.interpret(context));
    }
}