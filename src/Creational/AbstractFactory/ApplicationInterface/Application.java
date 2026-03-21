package Creational.AbstractFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void render() {
        this.button.render();
        this.checkbox.render();
    }
}
