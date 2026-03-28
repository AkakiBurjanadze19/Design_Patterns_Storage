package Behavioral.Visitor.UIExportSystem;

public class Button implements UIElement {
    public String label = "Submit";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}