package Behavioral.Visitor.UIExportSystem;

public class TextField implements UIElement {
    public String placeholder = "Enter name...";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}