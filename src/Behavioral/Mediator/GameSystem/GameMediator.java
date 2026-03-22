package Behavioral.Mediator.GameSystem;

public interface GameMediator {
    void notify(Component sender, String event);
}
