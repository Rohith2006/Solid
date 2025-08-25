public class CardPaymentService implements PaymentService {

    public String pay(Payment p) {
        return "Charged card: " + p.getAmount();
    }
}
