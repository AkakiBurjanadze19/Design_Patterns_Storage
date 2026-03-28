package Behavioral.State.DocumentWorkflow;

public class Document {
    private State state;

    public Document() {
        this.state = new DraftState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish();
    }
}