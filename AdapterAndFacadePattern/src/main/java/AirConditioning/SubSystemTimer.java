package AirConditioning;

public class SubSystemTimer {
    public void program(int program) {
        System.out.println("SubSystemTimer: Program postavljen na " + program);
    }

    public void on(boolean isOn) {
        System.out.println("SubSystemTimer: Timer je " + (isOn ? "uključen" : "isključen"));
    }
}
