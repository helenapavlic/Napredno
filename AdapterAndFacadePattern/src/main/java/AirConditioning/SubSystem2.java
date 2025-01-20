package AirConditioning;

public class SubSystem2 {
    public void setTemperature(float temp) {
        System.out.println("SubSystem2: Temperatura postavljena na " + temp + "°C");
    }

    public void fanSpeed(int modeSpeed) {
        System.out.println("SubSystem2: Brzina ventilatora postavljena na " + modeSpeed);
    }
}
