package Behavioral.Mediator.GameSystem;

public abstract class Component {
    protected GameMediator mediator;

    public Component(GameMediator mediator) {
        this.mediator = mediator;
    }
}
