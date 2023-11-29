public class Car {
    String brand;
    String type;
    Integer year;
    String colour;
    Float capacity;

    public Car(String brand, String type, Integer year, String colour, Float capacity) {
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.colour = colour;
        this.capacity = capacity;
        System.out.println("Deze " + brand + " " + type + " is " + colour);

    }
}
