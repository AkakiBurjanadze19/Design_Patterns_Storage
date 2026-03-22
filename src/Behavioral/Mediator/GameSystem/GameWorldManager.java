package Behavioral.Mediator.GameSystem;

public class GameWorldManager implements GameMediator {
    private Player player;
    private UIManager uiManager;
    private SoundEngine soundEngine;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setUIManager(UIManager uiManager) {
        this.uiManager = uiManager;
    }

    public void setSoundEngine(SoundEngine soundEngine) {
        this.soundEngine = soundEngine;
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("PLAYER_HURT")) {
            uiManager.flashRed();
            soundEngine.playLowHealthSound();
        } else if (event.equals("PLAYER_DEATH")) {
            uiManager.showGameOver();
            soundEngine.stopMusic();
        }
    }
}
