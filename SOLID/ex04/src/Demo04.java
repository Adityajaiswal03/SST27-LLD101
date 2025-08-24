
public class Demo04 {
    public static void main(String[] args) {
        Payment p=new Payment(new PaymentServiceUPI(), 499);
        System.out.println(p.pay());
    }
}
