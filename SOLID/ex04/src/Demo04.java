
public class Demo04 {
    public static void main(String[] args) {

        Payment payment = new Payment(PaymentProviderType.UPI, 499);
        PaymentService paymentService = new PaymentProcessor().getPaymentService(payment.getProvider());
        System.out.println(paymentService.pay(payment));
    }
}
