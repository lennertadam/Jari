import java.time.LocalDate;

public class Car {
    String plate;
    String brand;
    Integer year;
    String fuel;
    Double price;
    Boolean clime;
    LocalDate validity;
    public Car(String plate, String brand, Integer year, String fuel, Double price, Boolean clime, LocalDate validity) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
        this.price = price;
        this.clime = clime;
        this.validity = validity;
    }
    
}
