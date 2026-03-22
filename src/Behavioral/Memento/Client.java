package Behavioral.Memento;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Shape();
        EditorHistory history = new EditorHistory();

        rectangle.move(0, 0);
        rectangle.setColor("Green");

        history.push(rectangle.save());

        rectangle.move(10, 20);
        System.out.println("Changed position to 10,20");

        history.push(rectangle.save());

        rectangle.setColor("Red");
        System.out.println("Changed color to Red");

        rectangle.restore(history.pop());
        System.out.println("After Undo: " + rectangle);
    }
}
