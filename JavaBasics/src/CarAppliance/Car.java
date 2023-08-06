package CarAppliance;

public abstract class Car {
    String description;
    private boolean engineStatus;
    private double currentCharge;

    public Car(String description, double currentCharge) {
        this.description = description;
        this.currentCharge = currentCharge;
        this.engineStatus = false;
    }

    protected void setCurrentCharge(double newCharge) {
        currentCharge = newCharge;
    }

    public double getCurrentCharge() {
        return currentCharge;
    }

    public boolean isRunning() {
        return engineStatus && currentCharge > 0;
    }

    public void startEngine() {
        engineStatus = true;
    }

    public void stopEngine() {
        engineStatus = false;
    }

    public abstract void drive();

    protected void runEngine() {

    }
}
