package CarAppliance;

public class ElectricCar extends Car {
    double avgKMPerCharge;
    int batterySize;

    public ElectricCar(String description, double currentCharge, double avgKMPerCharge, int batterySize) {
        super(description, currentCharge);
        this.avgKMPerCharge = avgKMPerCharge;
        this.batterySize = batterySize;
    }
    public void drive() {
        setCurrentCharge(getCurrentCharge() - avgKMPerCharge);
    }
}

