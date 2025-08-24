public class ShippingCostStandard extends Shipment {
    public ShippingCostStandard(double weight) {
        super(weight);
        type = "Standard";
    }
    public double cost() {
        return 50 + 5 * weightKg;
    }

}
