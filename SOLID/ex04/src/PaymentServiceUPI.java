public class PaymentServiceUPI implements PaymentService {
    @Override
    public String pay(Payment p) {
        // Logic to process payment using UPI service
        return "Payment of " + p.amount + " processed via UPI provider";
    }
}
