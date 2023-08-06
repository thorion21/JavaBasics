package CarAppliance;

public class HybridCar extends Car {
    double avgKMPerLitre;
    int batterySize;
    double avgKMPerCharge;
    int cylinders;

    public HybridCar(String description, double currentCharge, double avgKMPerLitre, int batterySize, double avgKMPerCharge, int cylinders) {
        super(description, currentCharge);
        this.avgKMPerLitre = avgKMPerLitre;
        this.batterySize = batterySize;
        this.avgKMPerCharge = avgKMPerCharge;
        this.cylinders = cylinders;
    }
    public void drive() {
        setCurrentCharge(getCurrentCharge() - 0.3 * avgKMPerLitre - 0.7 * avgKMPerCharge);
    }
}
