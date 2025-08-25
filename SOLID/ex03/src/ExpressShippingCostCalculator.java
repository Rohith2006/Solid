public class ExpressShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double cost(Shipment shipment) {
        return 10.0 + 1.5 * shipment.getWeightKg();
    }
}
