public class Shipment {
    private ShipmentType type;
    private double weightKg;

    public Shipment(ShipmentType type, double weightKg){ 
        this.type=type; 
        this.weightKg=weightKg; 
    }

    public ShipmentType getType() {
        return type;
    }

    public double getWeightKg() {
        return weightKg;
    }
}