public class Payment {
    private PaymentProviderType provider; 
    private double amount;

    public Payment(PaymentProviderType provider, double amount){ 
        this.provider=provider; 
        this.amount=amount; 
    }

    public PaymentProviderType getProvider() {
        return provider;
    }

    public double getAmount() {
        return amount;
    }
}