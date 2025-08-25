public class UPIPaymentService implements PaymentService {

    public String pay(Payment p) {
        return "Paid via UPI: " + p.getAmount();
    }

}
