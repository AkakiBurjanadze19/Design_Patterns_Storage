package Behavioral.Visitor.UIExportSystem;

public class HtmlExportVisitor implements Visitor {
    @Override
    public void visit(Button button) {
        System.out.println("<button>" + button.label + "</button>");
    }

    @Override
    public void visit(TextField textField) {
        System.out.println("<input type='text' placeholder='" + textField.placeholder + "'>");
    }

    @Override
    public void visit(Image image) {}
}