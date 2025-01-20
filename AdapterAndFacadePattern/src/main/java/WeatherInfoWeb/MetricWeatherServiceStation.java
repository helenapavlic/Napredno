package WeatherInfoWeb;

import java.util.concurrent.ThreadLocalRandom;

public class MetricWeatherServiceStation implements PrimaryInterface {
    private double temp;
    private double windSpeed;

    @Override
    public void readTempC() {

        double temperatute = ThreadLocalRandom.current().nextDouble(-20, 48);
        this.temp = Math.round(temperatute * 100.0) / 100.0;
//        System.out.println(temperatute);
//        System.out.println(temp);

    }

    @Override
    public void readWindSpeedMs() {
        double wind = ThreadLocalRandom.current().nextDouble(0, 35);
        this.windSpeed = Math.round(wind * 100.0) / 100.0;
//        System.out.println(wind);
//        System.out.println(windSpeed);
    }

    @Override
    public void showWhetherData() {
        System.out.println("******************* Weather data *********************");
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "MetricWthrServiceStation [ temp=" + temp + " degree Celsius, wndSpeed=" + windSpeed + " m/s ]";
    }

}
