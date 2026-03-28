package Behavioral.Visitor.UIExportSystem;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<UIElement> document = List.of(new Button(), new TextField());

        System.out.println("-- Exporting to HTML ---");
        Visitor htmlExporter = new HtmlExportVisitor();
        document.forEach(UIElement -> UIElement.accept(htmlExporter));

        System.out.println();

        System.out.println("-- Generating accessibility report --- ");
        Visitor accessScanner = new AccessibilityVisitor();
        document.forEach(UIElement -> UIElement.accept(accessScanner));
    }
}