package Behavioral.Mediator.GameSystem;

public class Player extends Component {
    private int health = 100;

    public Player(GameMediator mediator) {
        super(mediator);
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println("Player took damage! health: " + health);

        if (health <= 0) {
            mediator.notify(this, "PLAYER_DIED");
        } else {
            mediator.notify(this, "PLAYER_HURT");
        }
    }
}
