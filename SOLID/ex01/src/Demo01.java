

public class Demo01 {
    public static void main(String[] args) {
        EmailClient email= new EmailClient();
        TaxService taxService = new TaxService(0.18);
        new OrderService(email,taxService).checkout("a@shop.com", 100.0);
    }
}
