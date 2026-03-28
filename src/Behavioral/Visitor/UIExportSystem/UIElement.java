package Behavioral.Visitor.UIExportSystem;

public interface UIElement {
    void accept(Visitor visitor);
}
