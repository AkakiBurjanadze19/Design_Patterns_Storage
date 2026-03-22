package Behavioral.Interpreter.RuleBasedDiscountEngine;

public interface Expression<T> {
    T interpret(DiscountContext context);
}
