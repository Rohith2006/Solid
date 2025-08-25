public class PaymentProcessor {

    public PaymentService getPaymentService(PaymentProviderType provider) {
        switch (provider) {
            case CARD: return new CardPaymentService();
            case UPI:  return new UPIPaymentService();
            case WALLET: return new WalletPaymentService();
            default: throw new RuntimeException("No provider");
        }
    }

}
