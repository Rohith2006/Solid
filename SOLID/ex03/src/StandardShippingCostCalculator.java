public class StandardShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double cost(Shipment shipment) {
        return 5.0 + 1.0 * shipment.getWeightKg();
    }
}
