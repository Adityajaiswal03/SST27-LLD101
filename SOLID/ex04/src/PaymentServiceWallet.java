public class PaymentServiceWallet  implements PaymentService {

    @Override
    public String pay(Payment p) {
        // Logic to process payment using a wallet service
        return "Payment of " + p.amount + " processed via wallet provider" ;
    }

}
