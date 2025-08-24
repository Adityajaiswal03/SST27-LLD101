public class Demo03 {
    public static void main(String[] args) {
        Shipment s=new ShippingCostExpress(2.0);

        new ShippingCostCalculator().cost(s);
    }
}
