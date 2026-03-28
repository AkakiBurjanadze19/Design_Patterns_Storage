package Behavioral.State.DocumentWorkflow;

public class PublishedState implements State {
    private Document document;

    public PublishedState(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering: public view.");
    }

    @Override
    public void publish() {
        System.out.println("Document is already published. no action taken.");
    }
}