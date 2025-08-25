public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(ShipmentType.EXPRESS, 2.0);
        ShippingCostCalculator calculator = new ExpressShippingCostCalculator();
        System.out.println(calculator.cost(shipment));
    }
}
