public class OrderService {

    EmailClient email;
    TaxService taxService;
    OrderService(EmailClient email, TaxService taxService) {
        this.email = email;
        this.taxService = taxService;
    }

    void checkout(String customerEmail, double subtotal) {
        double total=taxService.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}