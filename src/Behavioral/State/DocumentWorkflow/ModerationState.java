package Behavioral.State.DocumentWorkflow;

public class ModerationState implements State {
    private Document document;

    public ModerationState(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Document rendered: read-only for moderation.");
    }

    @Override
    public void publish() {
        System.out.println("Approved! document is now published.");
        document.setState(new PublishedState(document));
    }
}