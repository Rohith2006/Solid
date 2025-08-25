public class OvernightShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double cost(Shipment shipment) {
        return 15.0 + 2.0 * shipment.getWeightKg();
    }
}
