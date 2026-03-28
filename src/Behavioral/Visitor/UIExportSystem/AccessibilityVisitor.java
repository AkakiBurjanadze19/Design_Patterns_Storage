package Behavioral.Visitor.UIExportSystem;

public class AccessibilityVisitor implements Visitor {
    @Override
    public void visit(Button button) {
        System.out.println("Screen Reader: This is a button labeled " + button.label);
    }

    @Override
    public void visit(TextField textField) {
        System.out.println("Screen Reader: Text input area.");
    }

    @Override
    public void visit(Image image) {}
}
