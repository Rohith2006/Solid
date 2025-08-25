public class Bicycle implements Pedalable {
    

    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle has stopped");
    }

    @Override
    public void pedal(int effort) {
        System.out.println("Bicycle pedal effort: " + effort);
    }
}