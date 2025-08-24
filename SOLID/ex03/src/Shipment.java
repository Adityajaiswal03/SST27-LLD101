public abstract class Shipment {
    double weightKg;
    String type;
    public Shipment(double weightKg) {
        type=null;
        this.weightKg = weightKg;
    }
    abstract double cost();
}