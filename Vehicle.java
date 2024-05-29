public abstract class Vehicle {
private String make;
private String model;
private int year;
private String fuelType;
private double fuelEfficiency;

public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
this.make = make;
this.model = model;
this.year = year;
this.fuelType = fuelType;
this.fuelEfficiency = fuelEfficiency;
    }

public String getMake() {
return make;
    }

public String getModel() {
return model;
    }

public int getYear() {
return year;
    }

public String getFuelType() {
return fuelType;
    }

public abstract double getFuelEfficiency();

    public abstract double calculateDistanceTravel();

    public abstract double getMaxSpeed();
}

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    public double calculateDistanceTravel() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    public double getMaxSpeed() {
        return 80.0;
    }
}
