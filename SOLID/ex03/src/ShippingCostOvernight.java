public class ShippingCostOvernight extends Shipment {

    public ShippingCostOvernight(double weightKg) {
       super(weightKg);
       type = "Overnight";
    }
    public double cost() {
        return 120 + 10 * weightKg;
    }
}
