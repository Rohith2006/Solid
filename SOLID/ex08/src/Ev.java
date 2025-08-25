public class Ev implements Motorized, Rechargable {

    @Override
    public void recharge(int kWh) {
        System.out.println("Recharging battery with " + kWh + " kWh");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting electric engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping electric engine");
    }

    @Override
    public void move() {
        System.out.println("EV is moving");
    }

    @Override
    public void stop() {
        System.out.println("EV has stopped");
    }
}
