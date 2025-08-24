public class TaxService {
    double taxRate;
    TaxService(double taxRate) {
        this.taxRate = taxRate;
    }
    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
