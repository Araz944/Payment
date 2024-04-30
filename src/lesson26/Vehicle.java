package lesson26;

abstract class Vehicle {
    private String manufacturer;
    private String model;
    private FuelType fuelType;

    public Vehicle(String manufacturer, String model, FuelType fuelType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuelType = fuelType;
    }

    // Abstract methods
    abstract void start();

    abstract void stop();

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}