package CarAppliance;

public class CarAppliance {

    public static void Main() {
        Car gpc = new GasPoweredCar(
            "Ferrari",
            100,
            15,
            12);

        Car elec = new ElectricCar(
            "Tesla",
            100,
            15,
            100);

        Car hybrid = new HybridCar(
            "Toyota",
            100,
            20,
            100,
            12,
            1);

        gpc.startEngine();
        elec.startEngine();
        hybrid.startEngine();

        while(gpc.isRunning() && elec.isRunning() && hybrid.isRunning()) {

            gpc.drive();
            elec.drive();
            hybrid.drive();

        }
    }
}
