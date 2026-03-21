package Creational.Prototype;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private int year;
    private Person owner;

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        try {
            Car car = (Car) super.clone();
            car.owner = owner.clone();
            return car;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                '}';
    }
}