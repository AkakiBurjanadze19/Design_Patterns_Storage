package Creational.Prototype.Car;

public class Usage {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("E39");
        car.setYear(1998);

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);

        car.setOwner(person);

        Car carCopy = car.clone();
        carCopy.getOwner().setFirstName("Michael");

        System.out.println(car);
        System.out.println(carCopy);
    }
}
