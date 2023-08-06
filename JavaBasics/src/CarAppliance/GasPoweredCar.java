package CarAppliance;

public class GasPoweredCar extends Car {
    double avgKMPerLitre;
    int cylinders;

    public GasPoweredCar(String description, double currentCharge, double avgKMPerLitre, int cylinders) {
        super(description, currentCharge);
        this.avgKMPerLitre = avgKMPerLitre;
        this.cylinders = cylinders;
    }

    public void drive() {
        setCurrentCharge(getCurrentCharge() - avgKMPerLitre);
    }
}
