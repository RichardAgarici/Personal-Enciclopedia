package sda.exemple3withENUM;

import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private double price;
    private int yearsOfManufacture;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearsOfManufacture, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearsOfManufacture = yearsOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearsOfManufacture() {
        return yearsOfManufacture;
    }

    public void setYearsOfManufacture(int yearsOfManufacture) {
        this.yearsOfManufacture = yearsOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearsOfManufacture=" + yearsOfManufacture +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearsOfManufacture == car.yearsOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearsOfManufacture, manufacturers, engineType);
    }
}
