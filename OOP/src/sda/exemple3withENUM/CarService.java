package sda.exemple3withENUM;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car, 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
 */
public class CarService {
    private final Set<Car> cars = new HashSet<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }


    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getAllCarWithV12Engine() {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getAllCarWithV12EngineWithStream() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsManufacturedBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearsOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null || car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Optional<Car> getMostExpensiveCarWithStream() {
        return cars.stream()
                .max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }

    public Optional<Car> getCheapestCar() {
        return cars.stream()
                .min(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
    }

    public List<Car> getCarWithAtLeast3Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsSortedByPrice(boolean ascending) {
        return cars.stream()
                .sorted((c1, c2) -> {
                    if (ascending) {
                        return Double.compare(c1.getPrice(), c2.getPrice());
                    }
                    return Double.compare(c1.getPrice(), c2.getPrice());
                })
                .collect(Collectors.toList());
    }

    public boolean containsCar(Car car) {
        return cars.contains(car);
    }
//    public List<Car>getCarsByManufacturer(Manufacturer manufacturer){
//        return cars.stream()
//                .sorted()

    public List<Car> getCarsWhichContainsManufactureWithEstablishmentYear(String operator, int year) {
        return cars.stream()
                .filter(car -> {
                    switch (operator) {
                        case ">":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearsOfEstablishment() > year);
                        case "<":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearsOfEstablishment() < year);
                        case ">=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearsOfEstablishment() >= year);
                        case "<=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearsOfEstablishment() <= year);
                        case "=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearsOfEstablishment() == year);
                        case "!=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearsOfEstablishment() != year);

                        default:
                            throw new IllegalArgumentException("Invalid operator " + operator);
                    }

                })
                .collect(Collectors.toList());

    }

}


