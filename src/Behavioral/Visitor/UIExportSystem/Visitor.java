package Behavioral.Visitor.UIExportSystem;

public interface Visitor {
    void visit(Button button);
    void visit(TextField textField);
    void visit(Image image);
}
