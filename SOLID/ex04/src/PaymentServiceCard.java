public class PaymentServiceCard implements PaymentService {
    @Override
    public String pay(Payment p) {
        // Logic to process payment using a card service
        return "Payment of " + p.amount + " processed via card provider";
    }
}
