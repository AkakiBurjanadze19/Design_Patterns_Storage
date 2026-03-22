package Behavioral.Memento;

import java.util.Stack;

public class EditorHistory {
    private Stack<ShapeMemento> stack = new Stack<>();

    public void push(ShapeMemento memento) {
        stack.push(memento);
    }

    public ShapeMemento pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }

        return null;
    }
}
