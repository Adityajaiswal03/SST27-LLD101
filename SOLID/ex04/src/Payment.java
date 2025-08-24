public class Payment {
    PaymentService p;
    double amount;
    Payment(PaymentService p, double a){
        this.p=p;
        amount=a;
    }
    String pay() {
        return p.pay(this);
    }
}