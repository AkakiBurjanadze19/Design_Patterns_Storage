package Behavioral.Mediator.GameSystem;

public class UIManager extends Component {
    public UIManager(GameMediator mediator) {
        super(mediator);
    }

    public void showGameOver() {
        System.out.println("Rendering game over screen...");
    }

    public void flashRed() {
        System.out.println("Flashing screen red...");
    }
}
