package WeatherInfoWeb;

import java.util.concurrent.ThreadLocalRandom;

public class NoMetricWeatherServiceAdaptee {
    private double tempF;
    private double windSpeedKn;

    public double getTempF(){
    return tempF;
    }

    public double getWindSpeedKn(){
        return windSpeedKn;
    }

    public void readTemperatureF(){
        this.tempF = ThreadLocalRandom.current().nextDouble(0, 114);
    }

    public void readWindSpeedKn(){
        this.windSpeedKn = ThreadLocalRandom.current().nextDouble(0, 60);

    }

    public void showMeasuredData(){
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "NonMetricWthrServiceAdaptee [ tempF = " + tempF + ", degree Fahrenheit & wndSpdKn = " + windSpeedKn + " knots ]";
    }
}
