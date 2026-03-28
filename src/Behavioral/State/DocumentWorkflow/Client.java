package Behavioral.State.DocumentWorkflow;

public class Client {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.render();
        doc.publish();

        doc.render();
        doc.publish();
    }
}
