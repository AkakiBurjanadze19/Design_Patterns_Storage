package Behavioral.Mediator.GameSystem;

public class SoundEngine extends Component {
    public SoundEngine(GameMediator mediator) {
        super(mediator);
    }

    public void playLowHealthSound() {
        System.out.println("Playing low health sound...");
    }

    public void stopMusic() {
        System.out.println("Stopping music...");
    }
}