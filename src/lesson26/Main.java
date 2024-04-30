package lesson26;

public class Main {
    public static void main(String[] args) {
        // Creating an electric car
        ElectricCar teslaModelS = new ElectricCar("Tesla", "Model S");

        // Starting and stopping the electric car
        teslaModelS.start();
        teslaModelS.stop();

        // Charging the electric car
        teslaModelS.charge();
        System.out.println("Battery level: " + teslaModelS.getBatteryLevel() + "%");
    }
}