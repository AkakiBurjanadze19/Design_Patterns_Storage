package Behavioral.Mediator.GameSystem;

public class GameDemo {
    public static void main(String[] args) {
        GameWorldManager gameWorldManager = new GameWorldManager();

        Player player = new Player(gameWorldManager);
        gameWorldManager.setPlayer(player);

        UIManager uiManager = new UIManager(gameWorldManager);
        gameWorldManager.setUIManager(uiManager);

        SoundEngine soundEngine = new SoundEngine(gameWorldManager);
        gameWorldManager.setSoundEngine(soundEngine);

        player.takeDamage(50);
        player.takeDamage(20);
    }
}