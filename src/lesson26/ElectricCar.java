package lesson26;

class ElectricCar extends Vehicle implements EcoFriendly {
    private int batteryLevel; // Battery level in percentage

    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model, FuelType.ELECTRIC);
        this.batteryLevel = 100; // Fully charged by default
    }

    // Override start method
    @Override
    void start() {
        System.out.println("Starting " + getManufacturer() + " " + getModel() + " (Electric Car)");
    }

    // Override stop method
    @Override
    void stop() {
        System.out.println("Stopping " + getManufacturer() + " " + getModel() + " (Electric Car)");
    }

    // Implement charge method from EcoFriendly interface
    @Override
    public void charge() {
        System.out.println("Charging " + getManufacturer() + " " + getModel() + "'s battery");
        // Logic to charge the battery
        batteryLevel = 100;
    }

    // Method to get battery level
    public int getBatteryLevel() {
        return batteryLevel;
    }
}