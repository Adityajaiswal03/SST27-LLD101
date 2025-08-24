public class ShippingCostExpress extends Shipment {
    public ShippingCostExpress(double weightKg) {
        super(weightKg);
        type="Express";
    }
    public double cost() {
        return 80 + 8 * weightKg;
    }
}
