public class ElectricCar implements Electricvehicle{

    @Override
    public void chargeBattery(int amount) {
        System.out.println("Charging battery by " + amount + " units.");
    }

    @Override
    public int getBatteryLevel() {
        return 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric engine started silently.");
    }
}
