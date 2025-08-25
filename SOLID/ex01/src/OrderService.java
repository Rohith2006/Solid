public class OrderService {
    private TaxCalculator taxCalculator;
    private MailClient mail;

    public OrderService(MailClient mail, TaxCalculator taxCalculator) {
        this.mail = mail;
        this.taxCalculator = taxCalculator;
    }

    void checkout(String customerMail, double subtotal) {
        double total = subtotal + taxCalculator.calculateTax(subtotal);
        mail.send(customerMail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}