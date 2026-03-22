package Behavioral.Memento;

public class Shape {
    private int x, y;
    private String color;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ShapeMemento save() {
        return new ShapeMemento(x, y, color);
    }

    public void restore(ShapeMemento memento) {
        this.x = memento.x();
        this.y = memento.y();
        this.color = memento.color();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
