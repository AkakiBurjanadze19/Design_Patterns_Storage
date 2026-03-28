package Behavioral.State.DocumentWorkflow;

public class DraftState implements State {
    private Document document;

    public DraftState(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering draft: editing allowed.");
    }

    @Override
    public void publish() {
        System.out.println("Moving to moderation...");
        document.setState(new ModerationState(document));
    }
}