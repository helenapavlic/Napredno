package AirConditioning;

public class SubSystemEnergy {
    public void on() {
        System.out.println("SubSystemEnergy: Sustav uključen");
    }

    public void mode(String mode) {
        System.out.println("SubSystemEnergy: Energetski način postavljen na " + mode);
    }

    public void start() {
        System.out.println("SubSystemEnergy: Sustav pokrenut");
    }

    public void off() {
        System.out.println("SubSystemEnergy: Sustav isključen");
    }
}
