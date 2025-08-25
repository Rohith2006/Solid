public class DefaultTaxCalculator implements TaxCalculator {
    double taxRate;

    public DefaultTaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculateTax(double amount) {
        return amount * taxRate;
    }
}
